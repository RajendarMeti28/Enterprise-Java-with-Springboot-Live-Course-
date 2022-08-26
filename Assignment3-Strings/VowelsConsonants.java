import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VowelsConsonants {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String in = input.nextLine().toLowerCase();
        List<Character> chars = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'});
        Set<Character> vowels = new HashSet<>(chars);
        int vowelsCount = 0, consonantsCount = 0;
        for(int i=0;i<in.length();i++){
            char c = in.charAt(i);
            if(c>='a' && c<='z'){
                if(vowels.contains(c))
                    vowelsCount++;
                else
                    consonantsCount++;
            }
        }

        System.out.println("No of vowels: \t\t "+vowelsCount);
        System.out.println("No of consonants: \t "+consonantsCount);

        input.close();
    }
    
}
