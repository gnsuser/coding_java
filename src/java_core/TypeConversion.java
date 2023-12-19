package java_core;

public class TypeConversion {
public static void main(String args[]) {
//	byte isIt = 10;
//	short a = 20;
	int b = 100;
//	long c = 10000L;
//	float d = 11.11f;
	double e = 100000.11;
	
	//implicit type conversion automatic by compiler. no need to specify deliberately
	System.out.println(b);
	float f = b;
	System.out.println(f);
	//explicit type conversion. or typecasting not by compiler automatically. we have to specifically mention
	// when the data will lost, specifically. 
	int g = (int)e;
	System.out.println(g);
	
}
}
