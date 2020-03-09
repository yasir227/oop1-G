package com.aiub.labexam;

public class InformationTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(17356023,"Turzo",50000);
		
		System.out.println(e1);
		
		
		Address a1 = new Address("Dhaka","Bangladesh",e1);
		
		System.out.println(a1);
		
		
		

	}

}
