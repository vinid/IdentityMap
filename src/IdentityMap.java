import java.util.Map;
import java.util.HashMap;

public class IdentityMap {
  private static Map <Integer, Person> hash = new HashMap <Integer, Person>();

  public IdentityMap () {
  }
    
  public static Person isInto(int key) throws Exception {
    
    Person person = hash.get(new Integer (key));
      // could return a NULL element
      return person;


  }

  public static void add(Person person) {
      hash.put(new Integer(person.getKey()), person);
  } 
}
