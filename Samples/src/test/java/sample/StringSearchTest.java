package sample;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class StringSearchTest {

	StringSearch sr = new StringSearch();
	
	@Test
	public void testNullSearch()
	{				
		assertNull(sr.findPosition("", ""));
	}
	
	@Test
	public void testSearch()
	{				
		assertNotNull(sr.findPosition("It is the string to be searched. It is a sample.", "is"));
	}
	
}
 