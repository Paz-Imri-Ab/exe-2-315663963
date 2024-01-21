package pazab;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
	public String numberToChar(int num)
	{
		String result;
		
		if(num<1) 
		{
			result = "Error";
		}
		
		else if(num >= 1 && num <=49) 
		{
			result = "F";
		}
		
		else if(num >= 50 && num <=59) 
		{
			result = "E"; 
		}
		
		else if(num >= 60 && num <= 69) 
		{
			result="D";
		}
		
		else if(num >= 70 && num <= 79) 
		{
			result = "C";
		}
		
		else if(num >= 80 && num <=89) 
		{
			result = "B";
		}
		
		else if(num >= 90 && num <= 100) 
		{
			result = "A";
		}
		
		else result = "Error";
		
		return result;
	}
    
    
}
