import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Avatar name?");
    String avatarName = scan.next();
    System.out.println("What level are you?");
    int levels = scan.nextInt();
  
    System.out.println(meetUser(avatarName));
    
    int userLevel = 32;

    int newLevel = level(levels, userLevel);
    System.out.println("After playing dungeon 6, your avatar is now at level " + newLevel);

    String skill = newSkill(newLevel);
    System.out.println(skill);

  }

  static String meetUser(String avatarName)
  {
    String greet = avatarName + " welcome back to Dungeon Crawler.";
    return greet;
  }

  static int level(int levels, int userLevel) 
  {
    int newLevel = userLevel + levels;
    return newLevel; 
  }

  static String newSkill(int newLevel)
  {
    String skill;
    if(newLevel > 100)
    {
      skill = "Due to your level now being " + newLevel + ", you have unlocked Flurry Rush.";
    }else{
      skill = "Due to your level now being " + newLevel + ", you still have Flurry. Once your level  is greater than 100, you will unlock Flurry Rush";
    }
    return skill;
  }


}