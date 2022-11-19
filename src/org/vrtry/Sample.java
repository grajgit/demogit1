package org.vrtry;

public class Sample {
	
	static void display(String... values){
		
				
		if (values.length == 0) {
			
			System.out.println("Not a valid input");
			
		} else {
			
			for(String s:values){  
				   System.out.println(s);  
				  }

		}	    
		    
		 }  
		  
		 public static void main(String args[]){  
		  
		 display();//zero argument   
		 display("hello");//one argument   
		 display("my","name","is","varargs");//four arguments  
		 }   

}
