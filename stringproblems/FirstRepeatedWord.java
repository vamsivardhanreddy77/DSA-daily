package stringproblems;
import java.util.*;
public class FirstRepeatedWord{
    public static String FirstRepeated(String str){
        String[] words=str.toLowerCase().split("\\s+");
        HashSet<String> res=new HashSet<>();
        for(String word:words){
            if(res.contains(word)){
                return word;
            }res.add(word);
        }
        return "No Repetition";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=FirstRepeated(str);
        System.out.println(res);
    }
}