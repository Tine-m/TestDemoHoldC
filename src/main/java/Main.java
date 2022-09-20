public class Main {

  public static void main(String[] args) {
    int i = 4;
    int j = 5;

    //Arrange
    Calculator calculator = new Calculator();
    int result=0;
    //Act
    try {
      result = calculator.addition(400, 500);
    }
    catch(IllegalArgumentException e) {
      System.out.println("Fejl - inputværdier for høje " + result);
    }
    //Assert
    System.out.println("Resultat " +  result);


  }
}
