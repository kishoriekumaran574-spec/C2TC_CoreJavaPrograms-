package Interfacedemo;

public class GreetingExcutor {

	

			

			public static void main(String[] args) {
				
				//lambda expression
				
				Greetingdemo gd = () -> {
					System.out.println("Hi All! Welcome to the Java Session");
				};
				
				gd.greet();
				

			}

		
	}


