import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> array;
  RandomStringChooser(String[] a){
    array = new ArrayList <String> ();
    for(String b: a)
      array.add(b);
  }

  public String getNext(){
    if(array.size()>0){
     int index = (int)(Math.random()*array.size());
     String temp = array.get(index);
     array.remove(index);
      return temp;
    }
    return "NONE";
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
