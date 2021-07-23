import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyRangeTest {

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (Include) ผลที่ได้คือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }
}
