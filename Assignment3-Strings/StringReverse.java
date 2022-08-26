import java.util.Scanner;

public class StringReverse{

    public static String reverse(String str){
        StringBuilder s = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String answer = reverse(in);
        System.out.println(answer);

        input.close();
    }
}