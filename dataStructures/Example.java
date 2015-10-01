import com.structurepackage.Treet;
import com.structurepackage.Treets;

import java.util.Arrays;
import java.util.Date;


public class Example {
  public static void main(String []args) {
    Treet treet = new Treet(
    	"NathanSass",
    	"I like turtles",
    	new Date(616181195));
    Treet secondTreet = new Treet(
    	"demouse005",
    	"System down",
    	new Date(616181195));
    System.out.printf("This is a new Treet: %s %n", treet);
    System.out.println("The words are: ");
    for (String word: treet.getWords()) {
    	System.out.println(word);
    }
    Treet[] treets = {treet, secondTreet};
    Arrays.sort(treets);
    for (Treet exampleTreet : treets) {
    	System.out.println(exampleTreet);
    }
    Treets.save(treets);
    Treet[] reloadedTreets = Treets.load();
    for(Treet reloaded : reloadedTreets) {
    	System.out.println(reloaded);
    }
  }
}
