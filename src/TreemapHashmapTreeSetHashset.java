import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapHashmapTreeSetHashset {

   // TreeMap example
   private static void treeMap() {
      // Create a hash map
      TreeMap tm = new TreeMap();

      // Put elements to the map
      tm.put("Zara", new Double(3434.34));
      tm.put("Mahnaz", new Double(123.22));
      tm.put("Ayan", new Double(1378.00));
      tm.put("Daisy", new Double(99.22));
      tm.put("Qadir", new Double(-19.08));

      // Get a set of the entries
      Set set = tm.entrySet();

      // Get an iterator
      Iterator i = set.iterator();

      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();

      // Deposit 1000 into Zara's account
      double balance = ((Double)tm.get("Zara")).doubleValue();
      tm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + tm.get("Zara"));
   }
   /**
    *
    *    TreeMap
    *
    *
    *
    *
    *
    *    HashMap
    *
    *    a hashmap holds a key and a variable or a object, the key is used to map the the value it holds.
    *    HashMap is a simlpe and powerfull way to store data. used to get data faster than normal Lists since it searches the key and
    *    not the
    *    Permits null values
    *    can hold duplicate values
    *
    *
    *    TreeSet
    *    same as treemap, can't hold duplicate values
    *
    *    HashSet
    *
    *    same as Hashmap, but can't hold duplicate values
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    */
}
