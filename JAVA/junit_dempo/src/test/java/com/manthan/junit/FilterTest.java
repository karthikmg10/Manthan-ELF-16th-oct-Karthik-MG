package com.manthan.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
public class FilterTest {
@Test
void testMYFilter() {
	DBUtil db=mock(DBUtil.class);
	Filter f=new Filter(db);
	when(db.getNames()).thenReturn(Arrays.asList("Arun","Banu","Arjun","Anu"));
	List<String> mylist=f.myFilter();
	assertEquals(3, mylist.size());
	
	
}


}
