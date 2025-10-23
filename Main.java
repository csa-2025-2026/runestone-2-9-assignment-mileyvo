import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);
    String word = "calculator";

    int maxCount = 0;
    int maxLetter = "10";

    for (int i = 0; i < wordlength(); i++)
    {
      String goal = word.substring(i, i++);
      int count = 0;
      for (int j = 0; j < word.length(); j++); 
      {
        String currentLetter = word.substring(j, j++);
        if (currentLetter.equals(goal));
        {
          count++;
        }
      }
      if (count > maxCount)
      {
        maxCount = count;
        maxLetter = goal;
      }
    }
    System.out.println("The letter " + maxLetter + " appears the most time at " + maxCount + " times.");
  }
}
