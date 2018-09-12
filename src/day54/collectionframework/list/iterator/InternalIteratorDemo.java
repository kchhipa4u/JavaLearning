package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.List;

public class InternalIteratorDemo 
{
  public static void main(String[] args) 
  {
    List<String> names = new ArrayList<>();
    names.add("Kan");
    names.add("Abu");
    names.add("Neha");
        
    for(String name: names){
        System.out.println(name);            
    }    
    
  }
}