package converter;

public class Converter {
    private int base;
    private String prefix;

    // the idea of prefix is to made the
    // code compatible. For example to
    // add "0b" prefix for binary numbers
    public Converter(int base, String prefix) {
        this.base = base;
        this.prefix = prefix;
    }

    public String convert(int input) {
        StringBuilder out = new StringBuilder();
        while (input != 0) {
            out.append(input % this.base);
            input = input / this.base;
        }

        if (input == 0) {
            out.append(0);
        }

        return this.prefix + out.reverse().toString();
    }
}
