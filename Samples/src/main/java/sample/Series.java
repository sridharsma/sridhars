package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series {

	public static void main(String args[])
	{
		int inputNum=0;
		//get input from the user
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			inputNum = Integer.parseInt(br.readLine());
			System.out.println("input " + inputNum);
		}
		catch(IOException io)
		{
			System.out.println("Exception in reading.." + io);
		}
		
		int seriesStart=0;
		// find starting number
		for(int i=inputNum-1; i>0; i--)
		{			
			seriesStart = seriesStart+i;			
		}
	
		//Add 1 as the series has 1 in starting 
		seriesStart = seriesStart+1;
				
		//print the series
		for(int i=seriesStart; i<seriesStart+inputNum; i++)
		{
			System.out.print(i + "  ");
		}
							
	}
	
	
}
