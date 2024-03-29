package com.manthan.resumefinder.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;

@WebServlet("/Download")
public class DownloadResume extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		PrintWriter out = resp.getWriter();  
		String filename = req.getParameter("filename");   
		String filepath = "D:\\resume\\";   
		resp.setContentType("APPLICATION/OCTET-STREAM");   
		resp.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\""); 

		FileInputStream fileInputStream = new FileInputStream(filepath + filename);  

		int i;   
		while ((i=fileInputStream.read()) != -1) {  
			out.write(i);   
		}   
		fileInputStream.close();   
		out.close();   
	} 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
