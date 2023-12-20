package java_core;

public class SwitchCaseSample {
public static void main(String args[]) {
	char grade = 'A';
	switch (grade) {
	case 'A':
		System.out.println("Congrats you are eligible for scholarship");
		break;
	case 'B':
		System.out.println("Kindly fill the exception scholarship form to get eligible");
		break;
	case 'C':
		System.out.println("Not eligible for scholarship for year 2023-2024");
		break;
	default:
		System.out.println("Kindly enter valid grade");
		
	}
}
}
