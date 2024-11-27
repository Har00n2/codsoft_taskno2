import java.util.Scanner;
public class GradeCalculator {

	public static void display(String subjects[], int marks[], int totalMarks, double percentage, char grade) {
		System.out.println("----------------------------------------------------------------------------Results----------------------------------------------------------------------------------");
		System.out.println();
		for(int i = 0; i<marks.length; i++) {
			System.out.print(subjects[i] + " : ");
			System.out.print(marks[i]);
			System.out.println();
		}
		System.out.println("The Total Marks are: " + totalMarks);
		System.out.println("The Percentage is: " + percentage + "%");
		System.out.println("The Grade is: " + grade);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
		int subSize = sc.nextInt();
		String subjects[] = new String[subSize];
		int totalMarks = 0;
		double percentage;
		char grade = ' ';
		
		//storing names of the subject
		for(int i=0; i<subjects.length; i++) {
			System.out.println("Enter the name of " +(i+1)+ " subject.");
			String sub = sc.next();
			subjects[i] = sub.toUpperCase();
		}
		
		//storing marks
		int marks[] = new int[subSize];
		System.out.println("Now, Enter the marks of the each subjects(0-100).");
		for(int i=0; i<marks.length; i++) {
			System.out.print(subjects[i] + ": ");
			int mark = sc.nextInt();
			marks[i] = mark;
			totalMarks = totalMarks + mark;
		}
		
		//calculating percentage
		percentage = (totalMarks/subSize);
		
		//grading 
		if(percentage>=90) {
			grade = 'A';
		}
		
		else if(percentage>=80 && percentage<90) {
			grade = 'B';
			
		}
		else if(percentage>=70 && percentage<80) {
			grade = 'C';
			
		}
		else if(percentage>=60 && percentage<70) {
			grade = 'D';
			
		}
		else if(percentage>=50 && percentage<60) {
			grade = 'E';
			
		}
		else {
			grade = 'F';
		}
		
		display(subjects, marks, totalMarks, percentage, grade);
		
		sc.close();
		
	}

}
