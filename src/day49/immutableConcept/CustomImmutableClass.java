package day49.immutableConcept;



import java.util.HashMap;
import java.util.Map;
/**
 * @author kanhaiya.chhipa
 *
 *1) Final class - Make class final so that it cannot be inherited
 */

final class CustomImmutableClass{
   
  /**
  * 2) private member variable -> Making fields private ensures that fields cannot 
       be accessed outside class.
  * 3) final member variable -> Make field final so that they can be assigned only 
       once.
  */
   private final Integer salary; //Immutable member variable
   private final String name; //Immutable member variable
   private final HashMap<Integer,String> map; //mutable member variable

   /** 4) Constructor -> Initialize all fields in constructor. Assign all mutable 
          member variable using new keyword.
    */
   public CustomImmutableClass(Integer id, String name, Map<Integer,String> map){
       this.salary=id;
       this.name=name;
      
       //assign all mutable member variable using new keyword.
       this.map=new HashMap<>(map);
   }
    
    /* getter method for id.*/
   public Integer getId() {
      /** 5a) Integer is immutable class,
       *     any changes made to Integer object produces new Integer object.
       *     so return reference variable of Integer.
       */
       return salary;
   }

   /* getter method for name.*/
   public String getName() {
      /** 5b) String is immutable class,
       *     any changes made to Sting object produces new String object.
       *     so return reference variable of String.
       */
       return name;
   }
    
   /* Method returns clone of HashMap. */
   public Map<Integer, String> getMap() {
      /** 5c) HashMap is mutable class,
       *     any changes made to HashMap object won't produce new HashMap object.
       *     so return copy/clone of object, not reference variable of HashMap.*/
       return (HashMap<Integer, String>) map.clone(); 
   }
  
   /** 6) Don't provide setter methods in class */

}