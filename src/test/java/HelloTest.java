import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    @DisplayName("Test Case Hello")
    public void case01() {
         // Arrange
         Hello hello = new Hello();
         String name = "somkiat";
         // ACt
         String actualResult = hello.sawadee(name);
         // Assert
         assertEquals("Hello somkiat", actualResult);
    }
}