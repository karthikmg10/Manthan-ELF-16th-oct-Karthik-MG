package com.manthan.resumefinder.servlets;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;

import com.manthan.resumefinder.bean.SearchDataBean;
import com.manthan.resumefinder.dao.SearchResumeDao;


@WebServlet("/SearchResume")
public class SearchResume extends HttpServlet {
	
	public static void main(String[] args) throws Exception {
	      BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream inputstream = new FileInputStream(new File("D:/resume/Fresher_Java_Sql_Apti_MCQ_20180310_Questions.docx"));
	      AutoDetectParser parser = new AutoDetectParser();
	      ParseContext pcontext = new ParseContext();
	      //parsing the document using PDF parser
	      //PDFParser pdfparser = new PDFParser();
	      parser.parse(inputstream, handler, metadata,pcontext);
	      String content = handler.toString();
	      
	      String pattern = "(.*)(\\d+)(.*)"; ////REGEX for getting address

	      Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); //REGEX for getting mobile number
	      

	      Matcher found = p.matcher(content);

	      if (found.find( )) {
	         // System.out.println("Start index: " + found.start());
	          //System.out.println(" End index: " + found.end() + " ");
	          String mobile=found.group();
	          System.out.println("Mobile -------------> "+mobile);

	       } else {
	          System.out.println("NO MATCH");
	       }

	      Pattern address=Pattern.compile(pattern);
	      Matcher m=address.matcher(content);
	      if(m.find())
	      {
	          String fullAddress = m.group(0);
	          System.out.println("address------------->"+fullAddress);
	      }
	      Pattern email=Pattern.compile("([a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+)");
	      Matcher mail=email.matcher(content);
	      if(mail.find())
	      {
	          String emailAdd = mail.group(0);
	          System.out.println("Email Address----> "+emailAdd);
	      }
	      else {
	          System.out.println("NO MATCH");
	       }
	      
	      Pattern experience=Pattern.compile("\\d+\\s+years?\\s+(?:and\\s*)?\\d+\\s+months?|\\d+\\s+(?:months?|years?)");
	      Matcher m1=experience.matcher(content);
	      if(m1.find())
	      {
	          String exp = m1.group(0);
	          System.out.println("Experience------------->"+exp);
	      }

	      Pattern skill=Pattern.compile("\\b(Skill(s?) & Expertise(s?)|Tool(s?) & Technolog(y?|ies?)|Skill(s?)|SKILL(S?)|Technical Skills|TECHNICAL SKILLS|Computer Skills|COMPUTER SKILLS)\\b");
	      Matcher ms=skill.matcher(content);
	      if(ms.find())
	      {
	          String skilltxt = ms.group(0);
	          System.out.println("Skill------------->"+skilltxt);
	      }
	      
	      

	      StringTokenizer st=new StringTokenizer(content);
	      while(st.hasMoreTokens()) { 
	          String key = st.nextToken(); 
	          //String val = st.nextToken(); 
	          System.out.println(key + "\t" ); 
	          } 

	      //getting the content of the document
	    //  System.out.println("Contents of the PDF :" + content);

	      //getting metadata of the document
	    //  System.out.println("Metadata of the PDF:");
	      String[] metadataNames = metadata.names();

	    /*  for(String name : metadataNames) {
	         System.out.println(name+ " : " + metadata.get(name));
	      }*/
	      
	   }
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchStr = request.getParameter("searchtxt");
		SearchResumeDao dao = new SearchResumeDao();
		
		Set<SearchDataBean> files = dao.getFileNames(searchStr);
		request.setAttribute("results",files);
		System.out.println(files);
		request.getRequestDispatcher("/Search").forward(request, response);
	}

	}
