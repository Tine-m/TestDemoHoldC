import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void addition() {
    //Arrange
    Calculator calculator = new Calculator();
    int expected = 9;
    //Act
    int result = calculator.addition(4, 5);
    //Assert
    assertEquals(expected, result);
  }

  @Test
  void additionLargeIntegers() {
    //Arrange
    Calculator calculator = new Calculator();

    //Act og Assert
    assertThrows(IllegalArgumentException.class, () -> {
          calculator.addition(400, 500);
        }
    );
  }
}