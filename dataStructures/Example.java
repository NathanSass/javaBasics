import com.structurepackage.Treet;
import java.util.Date;


public class Example {
  public static void main(String []args) {
    Treet treet = new Treet(
    	"NathanSass",
    	"I like turtles",
    	new Date(616181195));
    System.out.printf("This is a new Treet: %s %n", treet);
  }
}
