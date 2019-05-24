
package data.structure;
import java.util.ArrayList;

public class linkedlist 
{
    
    public static void main(String[] args) 
    {
        long startTime, endTime,end1; 

        startTime = System.currentTimeMillis(); 
       ArrayList<String> ll = new ArrayList<>();
       ll.add("Ravi");
       ll.add("rani");
       ll.add(0,"renu");
       ll.remove("Ravi");
      System.out.println(ll);
      
      int len = ll.size();
      for(int i = 0 ; i<len;i++)
      {
          if(ll.contains("Ravi"))
          {
              System.out.println("yes");
              break;
          }
          else
          {
              System.out.println("no");
              break;
          }
      }
System.out.println(len);
        endTime = System.currentTimeMillis();   
        end1 = endTime-startTime;
        System.out.println(end1);
        
    }
    
    
}
