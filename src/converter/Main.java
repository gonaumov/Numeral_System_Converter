package converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int input = 66;
        System.out.printf("%d = %s", input, converter.convert(input));
    }
}
