public class Calculator {

  // max input value = 100
  public int addition(int i, int j) {
    if (i > 100 || j > 100) {
      throw new IllegalArgumentException();
    }
   return i + j;
  }
}
