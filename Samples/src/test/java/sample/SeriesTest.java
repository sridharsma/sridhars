package sample;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SeriesTest {

	Series sr = new Series();
	
	@Test
	public void testNullSeries()
	{				
		assertNull(sr.printSeries(0));
	}
	
	@Test
	public void testSeries()
	{			
		assertNotNull(sr.printSeries(7));
	}
}
