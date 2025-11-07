//GFG link for this problem https://www.geeksforgeeks.org/problems/print-anagrams-together/1
package stringproblems;
import java.util.*;
public class PrintAnagramsTogether {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String,ArrayList<String>> map=new LinkedHashMap<>();
        for(String word:arr){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String res=new String(ch);
            if(!map.containsKey(res)){
                map.put(res,new ArrayList<>());
            }map.get(res).add(word);
        }
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        for(ArrayList<String> values:map.values()){
            result.add(values);
        }
        return result;
    }
}

    
