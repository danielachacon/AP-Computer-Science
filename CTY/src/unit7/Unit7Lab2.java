package unit7;

public class Unit7Lab2 {	//done
	
	static int binaryToDecimal( String binaryString )
	{
		StringBuilder binary = new StringBuilder(binaryString);
		binary.reverse();
		int decimal = 0;
		
		for(int i = 0; i < binary.length(); i++)
		{
			if(binary.charAt(i) == '1')
				decimal += Math.pow(2, i);
		}
		
		return decimal;
	}
	
	static String binaryToHex(String binaryString)
	{
		int decimal = binaryToDecimal(binaryString);
		return decimalToHex(decimal);
	}
	
	static String decimalToBinary(int decimalNumber)
	{
		StringBuilder binary = new StringBuilder();
		int count = 0;
		while(decimalNumber > 0)
		{
			if(count % 4 == 0)
				binary.append(" ");
			binary.append(decimalNumber % 2);
			decimalNumber /= 2;
			count++;
		}
		binary.reverse();
		
		String answer = new String(binary);
		return answer;
	}
	
	static String decimalToHex(int decimalNumber)
	{
		StringBuilder hex = new StringBuilder();
		while(decimalNumber > 0)
		{
			if(decimalNumber % 16 < 10)
				hex.append(decimalNumber % 16);
			else
				switch(decimalNumber % 16)
				{
				case 10: hex.append("A"); break;
				case 11: hex.append("B"); break;
				case 12: hex.append("C"); break;
				case 13: hex.append("D"); break;
				case 14: hex.append("E"); break;
				case 15: hex.append("F"); break;
				}
			decimalNumber /= 16;
		}
		hex.reverse();
		
		String answer = new String(hex);
		return answer;
	}
	
	public static void main(String[] args) 
	{
		System.out.print(binaryToHex("11101010"));
		

	}

}
