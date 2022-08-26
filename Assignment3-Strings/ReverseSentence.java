import java.util.Scanner;

public class ReverseSentence {

    public static String helper(String str){
        StringBuilder st = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            st.append(str.charAt(i));
        }
        return st.toString();
    }

    public static String reverse(String str){
        String[] splits = str.split(" ");
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<splits.length;i++){
            answer.append(helper(splits[i])+" ");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = input.nextLine();
        String answer = reverse(sentence);
        System.out.println(answer);

        input.close();
    }
    
}
