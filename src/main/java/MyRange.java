public class MyRange {
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

        return getNextNumber(originStartNumber);
    }

    private int getNextNumber(int originStartNumber) {
        return originStartNumber + 1;
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int endNumber() {
        int originalEndNumber = Integer.parseInt(String.valueOf(this.input.charAt(3)));
        if (isEndWithInclude())
            return originalEndNumber;

        return getPreviousNumber(originalEndNumber);
    }

    private int getPreviousNumber(int originalEndNumber) {
        return originalEndNumber - 1;
    }
}
