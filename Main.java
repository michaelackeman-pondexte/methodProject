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

    boolean skill = newskill()
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

  static boolean newSkill( int newLevel)
  {
    if(newLevel > 100)
    {
      Skill = "Due to your level being " + newLevel + ", you have unlocked Flurry Rush";
    }else{
      Skill = "Due to your level being " + newLevel + ", you still have Flurry";
      return skill;
    }
  }


}