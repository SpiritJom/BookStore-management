package category;
import java.util.*;

public class dic {
    
       public static Dictionary <String ,book> books = new Hashtable<String,book>();

       public static void putDictionaryData(String key,book book){
           books.put(key,book);
       }

}
