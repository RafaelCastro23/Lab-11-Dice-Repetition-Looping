import java.util.Random;

class Main
{
  public static void main(String[] args) {
    //Example calling the roll() method
    //System.out.println("Roll:" = roll());
    int count1, count2, count3, count4, count5, count6;

    count1 = count2 = count3 = count4 = count5 = count6 = 0;
    for (int i = 0; i < 100; i++) {
      int random = roll();
      System.out.printf("Roll %d; [%d]%n", (i + 1) , random);

      if (random == 1) {
        count1++;
      } else if (random == 2) {
        count2++;
      } else if (random == 3) {
        count3++;
      } else if (random == 4) {
        count4++;
      } else if (random == 5) {
        count5++;
      } else if (random == 6) {
        count6++;
      }
      System.out.println("Final Roll Counts:");
      System.out.printf("[1]: %d times%n", count1);
      System.out.printf("[2]: %d times%n", count2);
      System.out.printf("[3]: %d times%n", count3);
      System.out.printf("[4]: %d times%n", count4);
      System.out.printf("[5]: %d times%n", count5);
      System.out.printf("[6]: %d times%n", count6);
    }
  }
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}
