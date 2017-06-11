public class SearchingAndSortingAndIterators {


   /**
    *
    * Gif på hvordan de forskellige sorting algorimter fungere
    * http://imgur.com/gallery/fq0A8hx
    *
    * Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
    * its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

       Implementation
      Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods to attach and detach observers to a client object.
      We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

      ObserverPatternDemo, our demo class, will use Subject and concrete class object to show observer pattern in action.
    *
    *
    * fx:
    *    nyhedsbrev fra hjemmeside.
    *    Varer ikke på lager - notify mig når den er på lager igen
    *
    *
    *
    *
    */
}
// Iterator
/**
 * Iterators are used to cycle through different collection types.
 * Each of the collection classes provides an iterator( ) method that returns an iterator to the start of the collection.
 * By using this iterator object, you can access each element in the collection, one element at a time.
 *
 * Read example:
 *
 * ArrayList<String> arraylist = new ArrayList<>();
 * Iterator itr = arraylist.iterator();
 *
 * while(itr.hasNext()) {
 * Object element = itr.next();
 * System.out.print(element + " ");
 * }
 *
 * // Modify objects being iterated example
 * ListIterator litr = arraylist.listIterator();
 *
 * while(litr.hasNext()) {
 * Object element = litr.next();
 * litr.set(element + "+");
 * }
 * System.out.print("Modified contents of al: ");
 */

// Linked list
// Node class
/*
public class Node {

   int value;
   Node next;

   public Node(int val) {
      value = val;
   }

   public Node(int val, Node nextNode) {
      value = val;
      next = nextNode;
   }
}
 */

// LinkedIntList class
/*
import java.util.NoSuchElementException;

public class LinkedIntList {

   private Node front;

   public void add(int value) {
      if (front == null) {
         front = new Node(value);
      } else {
         Node current = front;

         while (current.next != null) {
            current = current.next;
         }

         current.next = new Node(value);
      }
   }

   public void insertAt(int index, int value) {
      if (index == 0) {
         front = new Node(value, front);
      } else {
         Node current = front;

         for (int i = 0; i < index - 1; i++) {
            current = current.next;
         }

         current.next = new Node(value, current.next);
      }
   }

   public void remove(int index) {
      if (index == 0) {
         front = front.next;
      } else {
         Node current = front;

         for (int i = 0; i < index - 1; i++) {
            current = current.next;
         }

         current.next = current.next.next;
      }
   }

   public void set(int index, int value) {
      Node current = front;

      for (int i = 0; i < index; i++) {
         current = current.next;
      }

      current.value = value;
   }

   public int min() {
      Node current = front;
      int minVal = Integer.MAX_VALUE;

      if (current == null) {
         throw new NoSuchElementException();
      } else {
         while (current != null) {
            if (current.value < minVal) {
               minVal = current.value;
            }

            current = current.next;
         }
      }

      return minVal;
   }

   public int max() {
      Node current = front;
      int maxVal = Integer.MIN_VALUE;

      if (current == null) {
         throw new NoSuchElementException();
      } else {
         while (current != null) {
            if (current.value > maxVal) {
               maxVal = current.value;
            }

            current = current.next;
         }
      }

      return maxVal;
   }

   public int deleteBack() {
      Node current = front;
      int deletedVal;

      if (current == null) {
         throw new NoSuchElementException();
      } else if (current.next == null) {
         deletedVal = front.value;
         front = front.next;
      } else {
         while (current.next.next != null) {
            current = current.next;
         }

         deletedVal = current.next.value;
         current.next = current.next.next;
      }

      return deletedVal;
   }

   public boolean hasTwoConsecutive() {
      Node current = front;

      while (current != null && current.next != null) {
         if (current.next.value == current.value + 1) {
            return true;
         }

         current = current.next;
      }

      return false;
   }

   public void print() {
      if (front == null) {
         System.out.println("Empty list");
      } else {
         Node current = front;
         System.out.print("[ ");

         while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
         }

         System.out.println("]");
      }
   }
}
 */