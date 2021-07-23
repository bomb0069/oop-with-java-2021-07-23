import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะขึ้นต้นด้วย [ (Include) และลงท้ายด้วย ) (Exclude) ผลที่ได้คือ 1,2,3,4")
    public void listNumberWithStartWithIncludeAndEndWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        String result = myRange.listNumber();
        assertEquals("1,2,3,4", result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( (Exclude) และลงท้ายด้วย ] (Include) ผลที่ได้คือ 2,3,4,5")
    public void listNumberWithStartWithExcludeAndEndWithInclude() {
        MyRange myRange = new MyRange("(1,5]");
        String result = myRange.listNumber();
        assertEquals("2,3,4,5", result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นจะขึ้นต้นและลงท้ายด้วย () (Exclude) ผลที่ได้คือ 2,3,4")
    public void listNumberWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        String result = myRange.listNumber();
        assertEquals("2,3,4", result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นและลงท้ายด้วย [] (Include) ผลที่ได้คือ 1,2,3,4,5")
    public void listNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.listNumber();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะขึ้นต้นด้วย [ (Include) และลงท้ายด้วย ) (Exclude) ผลที่ได้คือ Array จาก 1 ถึง 4")
    public void arrayNumberWithStartWithIncludeAndEndWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int[] result = myRange.numberArray();
        assertArrayEquals(new int[] {1,2,3,4}, result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นจะขึ้นต้นและลงท้ายด้วย () (Exclude) ผลที่ได้คือ Array จาก 2 ถึง 4")
    public void arrayNumberWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        int[] result = myRange.numberArray();
        assertArrayEquals(new int[] {2,3,4}, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นและลงท้ายด้วย [] (Include) ผลที่ได้คือ Array จาก 1 ถึง 5")
    public void arrayNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int[] result = myRange.numberArray();
        assertArrayEquals(new int[] {1,2,3,4,5}, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะลงท้ายด้วย ) (Exclude) ผลที่ได้คือ 4")
    public void endNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.endNumber();
        assertEquals(4, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ] (Include) ผลที่ได้คือ 5")
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.endNumber();
        assertEquals(5, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะลงท้ายด้วย ) (Exclude) ผลที่ได้คือ false")
    public void endWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ] (Include) ผลที่ได้คือ true")
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( (Exclude) ผลที่ได้คือ 2")
    public void startNumberWithExclude() {

        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.startNumber();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (Include) ผลที่ได้คือ 1")
    public void startNumberWithInclude() {

        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.startNumber();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (Include) ผลที่ได้คือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( (Exclude) ผลที่ได้คือ false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }
}
