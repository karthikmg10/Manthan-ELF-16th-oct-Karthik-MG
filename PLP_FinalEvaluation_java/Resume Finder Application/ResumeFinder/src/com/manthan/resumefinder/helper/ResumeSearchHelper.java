package com.manthan.resumefinder.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;

import com.manthan.resumefinder.bean.SearchDataBean;

public class ResumeSearchHelper {

	public static void main(String[] args) throws Exception {
		extractData("Fresher_Java_Sql_Apti_MCQ_20180310_Questions.docx",""); 
	}



	public static SearchDataBean extractData(String filename, String configpath) throws Exception {
		List<String> skillmaster = loadSkillMaster(configpath);
		final LengthComparator LENGTH_COMPARATOR = new LengthComparator();
		skillmaster = skillmaster.stream().distinct().sorted(LENGTH_COMPARATOR).collect(Collectors.toList());

		BodyContentHandler handler = new BodyContentHandler();
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(new File("D:/resume/" + filename));
		AutoDetectParser parser = new AutoDetectParser();
		ParseContext pcontext = new ParseContext();
		parser.parse(inputstream, handler, metadata,pcontext);
		String content = handler.toString();
		SearchDataBean dataBean = new SearchDataBean();
		dataBean.setFilename(filename);

		String pattern = "(.*)(\\d+)(.*)";

		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");


		Matcher found = p.matcher(content);

		if (found.find( )) {
			String mobile=found.group();
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

		
		Pattern experience=Pattern.compile("\\d+\\s+years?\\s+(?:and\\s*)?\\d+\\s+months?|\\d+[\\+]?\\s+years?\\s+|\\d+\\.\\d+?[\\+]?\\s+(?:months?|years?)");
		Matcher m1=experience.matcher(content.toLowerCase());
		if(m1.find())
		{
			String exp = m1.group(0);
			System.out.println("Experience------------->"+exp);
			dataBean.setExperience(exp);
		}

		List<String> skilllist = new ArrayList<String>();
		for(String skillname : skillmaster)
		{
			if(content.toLowerCase().contains(skillname))
			{	
				System.out.println("skill keyword found--->"+skillname);
				skilllist.add(skillname);
				content.replaceAll(skillname, "");
			}
		}
		dataBean.setSkill(skilllist);
		return dataBean;
	}

	private static List loadSkillMaster(String configpath)
	{
		List<String> skillMaster = new ArrayList();
		File file = new File(configpath+"/skillmasterconfig.properties");
		String content = null;
		try {
			try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name())) {
				content = scanner.useDelimiter("\\A").next();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		skillMaster = new ArrayList<String>(Arrays.asList(content.split("\\s*[|]\\s*")));
		return skillMaster;
	}
	private static class LengthComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o2.length() - o1.length();
		}
	}

}
