/*Exercise05_33 (Current date and time) Invoking System.currentTimeMillis() returns the 
* elapsed time in milliseconds since midnight of January 1, 1970. Write a program 
* that displays the date and time. Here is a sample run: 
*
* @author Taufik Mansuri 
* E-mail: 20cs032@charusat.edu.in
* ID 20CS032 */

package Exercise05;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise05_33 {
	
    public static void main(String[] args) {
    long millis = System.currentTimeMillis();

    //System.out.println("Milisconds since 1970: "+millis);
    Date date = new Date(millis) ; String mydateFormat = "MMM dd, yyyy hh:mm:ss ";
	
    //date output format in given program
    SimpleDateFormat sdf = new SimpleDateFormat(mydateFormat);
	
    //print output date format
    System.out.println("Current date and time is " + sdf.format(date));
  }
}

/*Output
 Current date and time is May 16, 2012 10:34:23
*/
