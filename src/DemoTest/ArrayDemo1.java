package DemoTest;

import java.util.Scanner;
public class ArrayDemo1 {

    public static void main(String[] args) {
        int count = 0;
        String[] array = {"akash", "hello", "amir", "akshay"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Char");
        String inputs = sc.next();

        for (int i = 0; i < array.length; i++) {
            char[] temp = array[i].toCharArray();
            char alphabets = inputs.toLowerCase().charAt(0);

            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == alphabets) {
                    count++;
                }
            }
        }
        System.out.println("The array of vowels are:" +count);
    }
}