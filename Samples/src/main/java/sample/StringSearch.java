package sample;

public class StringSearch {

	public String findPosition(String str, String search)
	{	
		
		int lastIndex = 0;
      
		String position= null;
		
		if(str==null || str.length()==0)
		{
			return null;
		}
        while (lastIndex != -1)
        {
            lastIndex = str.indexOf(search, lastIndex);
        
            if (lastIndex != -1) {   
            	if(position==null)
            	{
            		position= String.valueOf(lastIndex);
            	}
            	else
            	{
            		position = position + "," +lastIndex;
            	}
                lastIndex ++;
            }
            
        }

        return position;
	}
	
	public static void main(String args[])
	{
		String origninalStr = "It is the string to be searched. It is a sample.";
		
		String searchStr = "is";
		
		StringSearch sr = new StringSearch();
		
		System.out.println(sr.findPosition(origninalStr, searchStr));

        
	}
}
