package com.manthan.junit;

import java.util.Arrays;
import java.util.List;

public class DBUtilImpl implements DBUtil {

	@Override
	public List<String> getNames() {
		return Arrays.asList("Arun","Banu","Arjun","Pyu");
	}

}
