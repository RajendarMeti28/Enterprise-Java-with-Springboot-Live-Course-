import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),1+map1.getOrDefault(str1.charAt(i), 0));
            map2.put(str2.charAt(i),1+map2.getOrDefault(str2.charAt(i), 0));
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        for(char c: map1.keySet()){
            if(map1.get(c)!=map2.get(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = input.nextLine();
        System.out.println("Enter string 2");
        String str2 = input.nextLine();

        boolean ans = isAnagram(str1,str2);
        if(ans)
            System.out.println("Given Strings are Anagrams");
        else
            System.out.println("Given Strings are NOT Anagrams");

        
        input.close();
    }
    
}
