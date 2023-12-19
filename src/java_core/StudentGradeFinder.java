package java_core;

public class StudentGradeFinder {
public static void main(String args[]) {
	int marks = 90;
	if (marks<40) {
		System.out.println("FAIL");
	}
	else if(marks>=40 && marks<60) {
		System.out.println("GRADE: D");
	}
	else if(marks>=60 && marks<80) {
		System.out.println("GRADE: C");
	}
	else if(marks>=80 && marks<90) {
		System.out.println("GRADE: B");
	}
	else if(marks>=90 && marks<=100) {
		System.out.println("GRADE: A");
	}
	else {
		System.out.println("Invalid marks: Kindly contact exam co-cordinator");
	}
}
}
