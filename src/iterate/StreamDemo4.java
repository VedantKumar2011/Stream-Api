package iterate;

import java.util.Arrays;

public class StreamDemo4 {

	public static void main(String[] args) {
		
		//Concatenate String using 
		String[] strArray = {"Welcome", "To", "India", "Peter"};
		System.out.println("____________Concatenated String_____________");
		String concatenatedString = Arrays.stream(strArray).reduce("",(str1,str2)->str1+str2);
		System.out.println(concatenatedString);
		

	}

}
