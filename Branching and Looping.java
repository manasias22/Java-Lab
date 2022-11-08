//Basic program to constructs Branching and Looping 

CODE:

import java.util.Scanner;

class Std{
	int RN;
	String Name;
	int M[];
	int Total;
	float Per;
	
	void read(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number and name: ");
		RN = sc.nextInt();
		Name = sc.nextLine();
		M = new int[5];
		 	
		System.out.println("Enter marks: ");
		for(int i = 0; i<5; i++){
			M[i] = sc.nextInt();
			Total = Total + M[i];
		}
		
		Per = (float)Total/5;
	}

	void disp(){
		System.out.println("RN: "+RN+"\tName: "+Name);
		
		for(int i = 0; i<5; i++){
			System.out.print(M[i]+"  ");
		}
		System.out.println("\nTotal: "+Total+"\tPercentage: "+Per);

		if(Per >= 70){
			System.out.println("Class: Distinction");
		}
		else if(Per >= 60){
			System.out.println("Class: First class");
		}
		else if(Per >= 50){
			System.out.println("Class: Second class");
		}
		else if(Per >= 40){
			System.out.println("Class: Pass");
		}
		else{
			System.out.println("Class: Fail");
		}
	}
}

class Student{
	public static void main(String args[]){
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.read();
		s1.disp();
		s2.read();
		s2.disp();
	}
}

OUTPUT:

Enter the roll number and name:
08 ABC
Enter marks:
50 50 50 50 50
RN: 8   Name:  ABC
50  50  50  50  50
Total: 250      Percentage: 50.0
Class: Second class
Enter the roll number and name:
09 XYZ
Enter marks:
100 90 98 96 95
RN: 9   Name:  XYZ
100  90  98  96  95
Total: 479      Percentage: 95.8
Class: Distinction
