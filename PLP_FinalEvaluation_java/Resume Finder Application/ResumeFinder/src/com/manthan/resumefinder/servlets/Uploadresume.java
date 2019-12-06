package com.manthan.resumefinder.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;

import com.manthan.resumefinder.bean.SearchDataBean;
import com.manthan.resumefinder.dao.SearchResumeDao;
import com.manthan.resumefinder.helper.ResumeSearchHelper;

@WebServlet("/Uploadresume")
public class Uploadresume extends HttpServlet {

	private ServletConfig config;

	public void init(ServletConfig config)
	{
		this.config = config;
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SearchResumeDao dao = new SearchResumeDao();
		String name = null;
		SearchDataBean data = new SearchDataBean();
		// process only if its multipart content
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);

				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						name = new File(item.getName()).getName();
						item.write(new File("D:\\Resume" + File.separator + name));
					}
				}

				String configPath = config.getServletContext().getRealPath("")+"/WEB-INF/config";
				if ((new File("D:\\Resume" + File.separator + name)).exists()) {
					data = ResumeSearchHelper.extractData(name,configPath);
					dao.insertsearchdata(data);
				}

				request.setAttribute("msg", "Resume Uploaded Successfully");
			} catch (Exception ex) {
				request.setAttribute("msg", "Error in Resume Upload ");
				ex.printStackTrace();
			}

		} else {
			request.setAttribute("msg", "Nothing Found in a Folder");
		}

		request.getRequestDispatcher("/Upload").forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
