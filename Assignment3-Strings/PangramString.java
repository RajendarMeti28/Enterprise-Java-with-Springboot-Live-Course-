import java.util.HashSet;
import java.util.Scanner;

public class PangramString {

    public static boolean isPangram(String str){
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                set.add(str.charAt(i));
            }
        }
        if(set.size()==26)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be checked");
        String str = input.nextLine();

        boolean ans = isPangram(str);
        if(ans){
            System.out.println("Given string is Pangram");
        }
        else
            System.out.println("Given string is NOT Pangram");
        
        input.close();
    }
    
}
