package nonaccessmodifier;

public class Static {
		static int count =17;
		int variable =22;
	    
		static {
			count =17;
			System.out.println("showing the static variable count: "+count);
		}

		public static void main(String[] args) {
			
			System.out.println("printing the main method :");
			display();
		}

		private static void display() {
			// TODO Auto-generated method stub
			
		}
			
	}

