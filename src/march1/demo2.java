package march1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
for (int i=5;i<=1;i++);
{
	System.out.println("enter your course");
	String course=s.next();
	switch (course.toUpperCase()) {
	case "MANUAL":
		System.out.println("course is available;;"+course);
		break;
	case "JAVA":
		System.out.println("course is available;;"+course);
		break;
	case "PYTHON":
		System.out.println("course is available;;");
		break;
	case "SELENIUM":
		System.out.println("course is available;;"+course);
		break;

	default:
		System.out.println("course is not available;;"+course);
		break;
	}
}
	}

}

