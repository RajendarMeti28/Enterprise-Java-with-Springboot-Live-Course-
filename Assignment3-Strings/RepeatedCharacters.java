import java.util.HashMap;
import java.util.Scanner;

public class RepeatedCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String in = input.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<in.length();i++){
            map.put(in.charAt(i),1+map.getOrDefault(in.charAt(i), 0));
        }
        System.out.println("Repeated Characters are: ");
        for(char c:map.keySet()){
            if(map.get(c)>1){
                System.out.print("\t"+c);
            }
        }

        input.close();
    }
    
}
