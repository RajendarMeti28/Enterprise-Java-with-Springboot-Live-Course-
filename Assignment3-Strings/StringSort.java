import java.util.Scanner;

public class StringSort {

    public static String sort(String str){

        char arr[] = str.toCharArray();
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }

        String ans = new String(arr);
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to be sorted");
        String str = input.nextLine();
        String ans = sort(str);
        System.out.println("Sorted string is "+ ans);
        
        input.close();
    }   
}
