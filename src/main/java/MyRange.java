public class MyRange {
    public static final int ASCII_VALUE_OF_0 = 48;
    private String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int startNumber() {
        int originStartNumber = Integer.parseInt(String.valueOf(this.input.charAt(1)));
        if (isStartWithInclude())
            return originStartNumber;

        return originStartNumber + 1;
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int endNumber() {
        return Integer.parseInt(String.valueOf(this.input.charAt(3)));
    }
}
