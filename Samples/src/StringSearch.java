
public class StringSearch {

	public static void main(String args[])
	{
		String origninalStr = "It is the string to be searched. It is a sample.";
		
		int lastIndex = 0;
      
        while (lastIndex != -1)
        {
            lastIndex = origninalStr.indexOf("is", lastIndex);
        
            if (lastIndex != -1) {   
            	System.out.println("Found {is} at position.." + lastIndex);
                lastIndex ++;
            }
            
        }

        
	}
}
