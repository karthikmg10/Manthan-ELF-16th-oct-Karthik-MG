package com.manthan.resumefinder.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;

import com.manthan.resumefinder.bean.SearchDataBean;

public class ResumeSearchHelper {
	public static void main(String[] args) throws Exception {
		extractData("Fresher_Java_Sql_Apti_MCQ_20180310_Questions.docx");
	}


	public static SearchDataBean extractData(String filename) throws Exception {
		ArrayList<String> skllKeyWords = new ArrayList();
		skllKeyWords.add("java");
		skllKeyWords.add("jsp");
		skllKeyWords.add("servlets");
		skllKeyWords.add("oracle");
		skllKeyWords.add("Hibernate");
		skllKeyWords.add("JDBC");
		skllKeyWords.add("JSON");
		skllKeyWords.add("Spring");
		skllKeyWords.add("Linux");
		skllKeyWords.add("MySQL");
		
		BodyContentHandler handler = new BodyContentHandler();
		/* ArrayList<String> data = new ArrayList<String>(); */
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(new File("D:/resume/" + filename));
		AutoDetectParser parser = new AutoDetectParser();
		ParseContext pcontext = new ParseContext();
		//parsing the document using PDF parser
		//PDFParser pdfparser = new PDFParser();
		parser.parse(inputstream, handler, metadata,pcontext);
		String content = handler.toString();
		SearchDataBean dataBean = new SearchDataBean();
		dataBean.setFilename(filename);

		String pattern = "(.*)(\\d+)(.*)"; ////REGEX for getting address

		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); //REGEX for getting mobile number


		Matcher found = p.matcher(content);

		if (found.find( )) {
			// System.out.println("Start index: " + found.start());
			//System.out.println(" End index: " + found.end() + " ");
			String mobile=found.group();
			//data.add(mobile);
			dataBean.setMobile(mobile);
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
			dataBean.setEmail(emailAdd);
			//data.add(emailAdd);
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
			dataBean.setExperience(exp);
			//data.add(exp);
		}

		Pattern skill=Pattern.compile("\\b(Skill(s?) & Expertise(s?)|Tool(s?) & Technolog(y?|ies?)|Skill(s?)|SKILL(S?)|Technical Skills|TECHNICAL SKILLS|Computer Skills|COMPUTER SKILLS)\\b");
		Matcher ms=skill.matcher(content);
		if(ms.find())
		{
			String skilltxt = ms.group(0);
			System.out.println("Skill------------->"+skilltxt);
		}


		List<String> skilllist = new ArrayList<String>();
		StringTokenizer st=new StringTokenizer(content);
		while(st.hasMoreTokens()) { 
			String key = st.nextToken(); 
			if(skllKeyWords.contains(key.toLowerCase()))
				skilllist.add(key.toLowerCase());
			//String val = st.nextToken(); 
			//System.out.println(key + "\t" ); 
		} 
		dataBean.setSkill(skilllist);

		//getting the content of the document
		//  System.out.println("Contents of the PDF :" + content);

		//getting metadata of the document
		//  System.out.println("Metadata of the PDF:");
		String[] metadataNames = metadata.names();

		/*  for(String name : metadataNames) {
	         System.out.println(name+ " : " + metadata.get(name));
	      }*/
		return dataBean;
	}

}
