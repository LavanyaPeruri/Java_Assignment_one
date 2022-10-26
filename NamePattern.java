package com.ineuron.java.assignment;

public class NamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, n=7;
		for(i=0;i<n; i++) {
			//for L
			for(j=0; j<n; j++) {
				if((j==0 && i <n-1) || (j < (3*n-1)/4 && j != 0 && i== n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for A
			for(j=0; j<n; j++) {
				if((j == 0 && i>0) || (i == 0 && j > 0 && j < (3*n-1)/4) || (i== (n-1)/2 && j < (3*n-1)/4) || (i > 0 && j == (3*n-1)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for V
			for(j=0; j<n; j++) {
				if((j==0 && i<(n-1)/2) || (j == n-1 && i<(n-1)/2) || i-j==(n-1)/2 || i+j == (((n-1)/2)+n)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for A
			for(j=0; j<n; j++) {
				if((j == 0 && i>0) || (i == 0 && j > 0 && j < (3*n-1)/4) || (i== (n-1)/2 && j < (3*n-1)/4) || (i > 0 && j == (3*n-1)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for N
			for(j=0; j<n; j++) {
				if(j==0 ||j == n-1 | i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for Y
			for(j=0; j<n; j++) {
				if((i==j && i <= (n-1)/2) || (i+j ==n-1 && i <= (n-1)/2) || (j ==(n-1)/2 && i >= (n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for A
			for(j=0; j<n; j++) {
				if((j == 0 && i>0) || (i == 0 && j > 0 && j < (3*n-1)/4) || (i== (n-1)/2 && j < (3*n-1)/4) || (i > 0 && j == (3*n-1)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\t\t");
			//for I
			for(j=0; j<n; j++) {
				if(i == 0 || i== n-1 || j == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for N
			for(j=0; j<n; j++) {
				if(j==0 ||j == n-1 | i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for E
			for(j=0; j<n; j++) {
				if(j == 0 || i == 0 || i == n-1 || (i == (n-1)/2 && j < (3*n-1)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for U
			for(j=0; j<n; j++) {
				if((j==0 & i != n-1) || (j==n-1 && i != n-1) || (i == n-1 && j != 0 && j != n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for R
			for(j=0; j<n; j++) {
				if(j == 0 || (i==0 && j < (3*n-1)/4) || (i == (n-1)/2 && j < (3*n-1)/4) || (j == (3*n-1)/4 && i < (n-1)/2 && i != 0) || (i >= (n-1)/2 && i-j == n/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for O
			for(j=0; j<n; j++) {
				if((i ==0 && j != 0 && j != n-1) || (j==0 && i != 0 && i != n-1) || (i == n-1 && j != 0 && j != n-1) || (j == n-1 && i != 0 && i != n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//for N
			for(j=0; j<n; j++) {
				if(j==0 ||j == n-1 | i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
