import java.util.Random;

public class EksamensMain {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      int randomNumber = random.nextInt(6)+1;
      System.out.println(randomNumber);
    }

  }
}
