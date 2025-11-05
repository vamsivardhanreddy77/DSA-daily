package stringproblems;

import java.util.*;

public class StringCompressionUsingHashMap {
    public static String StrCom(String str){
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder res=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            res.append(entry.getKey());
            if(entry.getValue()>1){
                res.append(entry.getValue());

            }
        }
        return res.toString();

    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=StrCom(str);
        System.out.println(res);
    }
    
}
