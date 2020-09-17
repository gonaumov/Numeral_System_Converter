package converter;

public class Converter {
    public String convert(int input) {
        StringBuilder out = new StringBuilder();
        while (input != 0) {
            out.append(input % 2);
            input = input / 2;
        }
        return "0b" + out.reverse().toString();
    }
}
