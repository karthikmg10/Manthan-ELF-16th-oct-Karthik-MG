package com.manthan.junit;

import java.util.ArrayList;
import java.util.List;

public class Filter {
private DBUtil dbutil;
public Filter(DBUtil dbUtil) {
	this.dbutil=dbUtil;
}
public List<String> myFilter(){
	List<String> list=dbutil.getNames();
	List<String> newList=new ArrayList<String>();
	for (String string : list) {
		if(string.startsWith("A")) {
			newList.add(string);
		}
		
	}
	return newList;
}
}
