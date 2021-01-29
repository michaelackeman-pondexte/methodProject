import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Avatar name?");
    String avatarName = scan.next();

    System.out.println(meetUser(avatarName));

  }

  static String meetUser(String avatarName)
  {
    String greet = avatarName + " welcome back to Dungeon Crawler.";
    return greet;
  }

  int level()


}