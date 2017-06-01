/* This is a simple application that was developed 
 * from a book exercise. The application will 
 * output the description etc.. The application 
 * will also output the total, tax amount, grand
 * total, and average. 
 */
package noob.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // hard code three values
        String productCode = "android";
        double price = 57.50;
        int quantity = 2;
        
        //added int and double variables
        double sum = 301.75;
        int count = 6;
        double taxPercent = .075;
        double percentage = 7.5;
        double average = sum/count;
        
        // added String variables
        String lastName = "Bei";
        String firstName = "Lou";
        
        // perform calculation
        double total = price*quantity;
        double taxAmount = taxPercent*total;
        double grandTotal = total+taxAmount;
            
        // display the output
        String message = 
            "Code:     " + productCode + "\n" +
            "Description: Wala lang programming " + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n" + 
            "Tax Percent: " + percentage;
        System.out.println(message);
        
        //Will output Tax Amount
        System.out.println("Tax Amount: " + taxAmount);
        
        //Will output Grand Total
        System.out.println("Grand Total: " + grandTotal + "\n");
        
        // This is going to output of lastName && firstName
        System.out.println("Name: " + lastName + ", " +
        					firstName);
        
        //sum and count variables output
        System.out.println("Sum: " + sum + "\n" +
        				   "Count: " + count + "\n" );
        //Total average
        System.out.println("Average: " + average + "\n");

        // display a goodbye message
        System.out.println("Bye!");
    }
}
