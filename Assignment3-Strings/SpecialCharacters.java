
import java.util.Scanner;

public class SpecialCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String in = input.nextLine().toLowerCase();
        int count = 0;
        for(int i=0;i<in.length();i++){
            char c = in.charAt(i);
            if(!(c>='a' && c<='z') && !(c>='0' && c<='9')){
                count++;
            }
        }

        System.out.println("No of special Characters: \t "+count);

        input.close();
    }
    
}
