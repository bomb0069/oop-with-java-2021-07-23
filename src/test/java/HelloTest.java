import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    // f(name) = "Hello Somkiat"

    @Test
    public void case01(){
        // Arrange
        Hello hello = new Hello();
        String name = "somkiat";

        // Act
        String actualResult = hello.sawadee(name);

        // Assert
        assertEquals("Hello somkiat", actualResult);
    }

}