import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();
        System.out.println("\nYou entered: " + input);

        //System.out.println(StringUtils.reverse(input));

//        if(!StringUtils.isNumeric(input)){
//            System.out.println("\n" + input + " - is not a number\n");
//        } else {
//            System.out.println(input + " - is a number\n");
//        }

        String isNum = !StringUtils.isNumeric(input) ? " - is not a number\n" : " - is a number\n";
        System.out.print(input + isNum);

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));

        //reverse each word and flip case it
        String[] arrStr = input.split(", ");
        String outStr = "";
        for (String word : arrStr)
        {
            outStr += StringUtils.swapCase(StringUtils.reverse(word + " "));
        }
        System.out.println(StringUtils.strip(outStr));

    }

}