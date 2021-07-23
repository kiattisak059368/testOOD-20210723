import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    @DisplayName("ข้อมูล [1,5) run getEnd()")
    public void endNumberWithExclude() {
        MyRange myRange = new  MyRange("[1,5)");
        int result = myRange.getEnd();
        assertEquals(4 , result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] run getEnd()")
    public void endNumberWithInclude() {
        MyRange myRange = new  MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5 , result);
    }


    @Test
    @DisplayName("ข้อมูล [1,5] run isEndWithInclude")
    public void endWithInclude() {
        MyRange myRange = new  MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5) run isEndWithInclude")
    public void endWithExclude() {
        MyRange myRange = new  MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] run getStart()")
    public void startNumberWithInclude() {
        MyRange myRange = new  MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1 , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] run getStart()")
    public void startNumberWithExclude() {
        MyRange myRange = new  MyRange("(1,5]");
        int result = myRange.getStart();
        assertEquals(2 , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] run isStartWithInclude")
    public void startWithExclude() {
        MyRange myRange = new  MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] run isStartWithInclude")
    public void startWithInclude() {
        MyRange myRange = new  MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }
}
