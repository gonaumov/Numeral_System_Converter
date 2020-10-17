package converter;

import java.util.Scanner;

/**
 * @author Georgi Naumov
 * gonaumov@gmail.com for contacts and suggestions
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Converter converter = new Converter(8, "");
        String octalNumber = converter.convert(input);
        System.out.println(octalNumber.charAt(octalNumber.length() - 1));
    }
}
