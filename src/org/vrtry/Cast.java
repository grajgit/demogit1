package org.vrtry;

import java.util.Arrays;

public class Cast {
	
	public static String d;
	
	static void secondLargestNum(int array[]) {
		int temp;
		
		int size = array.length;
		if (size<2) {
			
			System.out.println("invalid input");
			
		} else {
			for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		}
		System.out.println("Largest num: "+array[size-1]);
		
		System.out.println("Second largest num: "+array[size-2]);
	}
	
	static void largN(int ars[]) {
		
		Arrays.sort(ars);
		
		System.out.println(ars[ars.length-1]);
		
		String string = Arrays.toString(ars);
		System.out.println(string);
		

	}

public static void main(String[] args) {
	
	
	
	
	
	float a = 166.3f;
	
	long b = (long)a;
	
	int[] f= new int[4];
	
	
	
	System.out.println(f[0]);
	
	int e;
	
	e=0;
	
	System.out.println(e+1);
	
	
		
	System.out.println(b);
	
	String[] c = {"I", "am", "Rajesh"};
	
	for (String string : c) {
		
		
		
		d = d+string;
	}
	
	System.out.println(d);
	
	
	String day = "monday";
	
	switch (day) {
	case "sunday":
		System.out.println("Holiday");
		break;

	default:
		System.out.println("working day");
		break;
	}
	
	
	int g = 10;
	int h = 11;
	
	int i = g>h?g:h;
	
	System.out.println("Largest Number: "+i);
	
	boolean j = h!=g;
	
	System.out.println(j);
	
	
	int ar[]= {23, 45, 12, 10};
	
	System.out.println(ar.length);
	
	
	
	
	secondLargestNum(ar);
	
	largN(ar);
	
	
}
}
