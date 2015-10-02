import com.structurepackage.Treet;
import com.structurepackage.Treets;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Date;
import java.util.TreeSet;


public class Example {
  public static void main(String []args) {
    Treet[] treets = Treets.load();
    System.out.printf("There are %d treets. %n", treets.length);
    Set<String> allHashTags = new HashSet<String>();
    Set<String> allMentions = new TreeSet<String>();
    for (Treet treet : treets) {
    	allHashTags.addAll(treet.getHashTags());
    	allMentions.addAll(treet.getMentions());
    	System.out.printf("This is a treet %s\n", treet);

    }
    System.out.printf("Hash tags: %s %n", allHashTags);
    System.out.printf("Mentions: %s %n", allMentions);

  }
}
