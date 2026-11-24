import java.util.Scanner;

public class IndexPPosition{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        for (int position = 0; position < text.length(); position+= 2) {

            System.out.println(text.charAt(position));

        }


    }
}
