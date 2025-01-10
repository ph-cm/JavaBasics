package POOExample4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Read students 3 grades
		 * Show the final score
		 * Show if student passed or not(60.00)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		
		System.out.println("Grades: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("Final Grade: " + student.finalGrade());
		
		System.out.println(student.toString());
		
		sc.close();
	}

}
