import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

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
