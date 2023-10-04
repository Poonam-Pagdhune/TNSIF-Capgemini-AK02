package DayNine;


public class StringBufferClassDemo {
	
	    public static void main(String[] args) {
	    	
	        // Create a StringBuffer object called 'buffer'
	        StringBuffer buffer = new StringBuffer();
	        
	        // Append the string "Hello " to the buffer
	        buffer.append("Hello ");
	        
	        // Append the string "World" to the buffer
	        buffer.append("World");
	        
	        // Convert the StringBuffer to a String and store it in 'result'
	        String result = buffer.toString();
	        
	        // Print the result
	        System.out.println(result);
	    }
	}
