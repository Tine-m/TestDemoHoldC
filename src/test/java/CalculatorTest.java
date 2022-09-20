import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  public void setup() {
    calculator = new Calculator();
  }

  @Test
  void addition() {
    //Arrange
    int expected = 9;
    //Act
    int result = calculator.addition(4, 5);
    //Assert
    assertEquals(expected, result);
  }

  @Test
  void additionLargeIntegers() {
    //Act og Assert
    assertThrows(IllegalArgumentException.class, () -> {
          calculator.addition(400, 500);
        }
    );
  }

  @Test
  public void additionNegativeIntegers(){
    //Arrange
    int expected = -9;
    //Act
    int result = calculator.addition(-4, -5);
    //Assert
    assertEquals(expected, result);
  }
}