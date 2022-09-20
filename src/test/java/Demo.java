import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Demo {

  @Test
  public void testSandErSand() {
    assertTrue(1 == 1);
  }

  @Disabled
  @Test
  public void testFalskErFalsk() {
    assertFalse(1 == 2);
  }
}
