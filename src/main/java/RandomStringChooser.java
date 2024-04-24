import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> arr;
  RandomStringChooser(String[] a){
    arr = new ArrayList <String> ();
    for(String b: a)
      arr.add(b);
  }

  public String getNext(){
    if(arr.size()>0){
     int index = (int)(Math.random()*arr.size());
     String temp = arr.get(index);
     array.remove(index);
      return temp;
    }
    return "NONE";
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
