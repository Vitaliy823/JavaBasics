package com.syntax.class10;

public class myTask3 {

	public static void main(String[] args) {
		String[][] name=new String [4] [4];
		name[0][0]="Mr";
		name[0][1]="Mrs";
		name[0][2]="Ms";
		name[0][3]="Miss";
		
		name[1][0]="Smith";
		name[1][1]="Jordan";
		name[1][2]="Jackson";
		name[1][3]="Obama";
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);

		String [][] names= {
				{"Dana","Anton","Habib","Daria"},
				{"A","B","C","D"}
		}
		System.out.println();
	}

}
