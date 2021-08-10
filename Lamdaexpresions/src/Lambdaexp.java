
interface HelloWorld
	{
	    public void greet(String welcome);
	

	} 

public class Lambdaexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HelloWorld mylamb =(String s)-> {System.out.println("Hello 1" +s);};
		 HelloWorld mylamb2 =s -> {System.out.println("Hello 2 "+s);};
	        
		 	mylamb.greet("World");
		 	mylamb2.greet("JIP");
	        
	    }
	}
	


