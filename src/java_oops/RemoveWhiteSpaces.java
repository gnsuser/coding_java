package java_oops;

public class RemoveWhiteSpaces {
    public String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		str = str.replace(" ","");
        return str;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		//str = removeWhiteSpaces(str);
		System.out.println(str);
		RemoveWhiteSpaces object = new RemoveWhiteSpaces();
		System.out.println(object.removeWhiteSpaces(str));

		String name = "gaurav surnis. from Mysore as of now. namma mysore zindabaaad";
		System.out.println(name.replace(" ",""));


	}
}
