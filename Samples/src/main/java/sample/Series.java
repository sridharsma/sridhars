package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series {

	public String printSeries(int level)
	{
		String series=null;
			
		if(level <=0)
		{
			return null;
		}
		int seriesStart=0;
		// find starting number
		for(int i=level-1; i>0; i--)
		{			
			seriesStart = seriesStart+i;			
		}
	
		//Add 1 as the series has 1 in starting 
		seriesStart = seriesStart+1;
				
		//print the series
		for(int i=seriesStart; i<seriesStart+level; i++)
		{			
			if(series==null)
			{
				series= i +"  ";
			}
			else
			{
				series= series+ i + "  ";
			}
		}
	
		return series;
		
	}
	
	public static void main(String args[])
	{
		Series sr = new Series();
		System.out.println(sr.printSeries(7));
		
	}
	
	
}
