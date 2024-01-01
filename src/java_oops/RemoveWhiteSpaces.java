package java_oops;

public class RemoveWhiteSpaces {
    public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		str = str.replace(" ","");
        return str;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
