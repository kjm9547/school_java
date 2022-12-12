package cp8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class iter {
    public static void main(String []args){
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        map.put("d","dd");
        Set<String> keys  =map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+"   "+value);
        }
    }
}
