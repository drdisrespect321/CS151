
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      generate(m, n, "", result);
      return result;
   }
   
   private static void generate(int m, int n, String gen, Set<String> result){
      //1. if m=0 && n=0, then just return an empty string "".
      if(m==0 && n==0){
         result.add(gen);
         return;
      }

      // if m=0, generate the other possibility
      if(m == 0){
         generate(m, n-1, gen+"-", result);
         return;
      }
      
      // if n=0, generate the other possibility      
      if(n == 0){
         generate(m-1, n, gen+".", result);
         return;
      }
      
      generate(m-1, n , gen+".", result);
      generate(m, n-1, gen+"-", result);
   }
}