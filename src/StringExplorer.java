import java.util.Scanner;

public class StringExplorer
{
	public static void main(String[] args)
	{
        // Count down with a "T minus 5"
        for (int i = 5; i >= 0; i--) {
            System.out.println("T minus " + i);
        }

        // Declare and instantiate a Scanner
        Scanner s = new Scanner(System.in);
        // infinite loop 
        while (true) {
            // take an input
            System.out.print("Meaning of life, the universe, and everything: ");
            String answer = s.nextLine();
            // repeat input + message
            if (answer.equals("42")) {
                System.out.println("Wise choice.\n");
                break;
            } else System.out.println("lmao you thought " + answer + " was right?");
        }

  		String sample = "The quick brown fox jumps over the lazy dog.";
  
        // Print the sample and add a blank line after
            System.out.println("OUR SAMPLE:");
            System.out.println(sample + "\n");

        //  Demonstrate the length method.
            int l = sample.length();
            System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		    int position = sample.indexOf("quick");
  		    System.out.println ("sample.indexOf(\"quick\") = " + position);
		
        //  Demonstrate the toLowerCase method.
	        String lowerCase = sample.toLowerCase();
		    System.out.println ("sample.toLowerCase() = " + lowerCase);
		    System.out.println ("After toLowerCase(), sample = " + sample);
				
	    //  toUpperCase
            System.out.println(sample.toUpperCase());

        // lastIndexOf
            System.out.println("Last 'h': " + sample.lastIndexOf("h"));

        // substring
            System.out.println("SUBSTRING PRACTICE");
            System.out.println(sample.substring(0, 5));
      
        // equals

	}
}
