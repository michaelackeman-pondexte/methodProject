import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Avatar name?");
    String avatarName = scan.next();//This obtains the avatarName
    System.out.println("What level are you?");
    int levels = scan.nextInt();//This obtains the avatar's level and later is added with userlevel
  
    System.out.println(meetUser(avatarName));
    
    int userLevel = 32;

    int newLevel = level(levels, userLevel);
    System.out.println("After playing dungeon 6, your avatar is now at level " + newLevel);

    String skill = newSkill(newLevel);
    System.out.println(skill);

  }

  static String meetUser(String avatarName)
  {
    String greet = avatarName + " welcome back to Dungeon Crawler.";//This string of code recieves the avatarName and inserts it into the variable greet along with a string
    return greet;//This returns the variable greet to the main method
  }

  static int level(int levels, int userLevel) 
  {
    int newLevel = userLevel + levels;//This adds two variables together to obtain newlevel
    return newLevel;//this returns newlevel to the main method
  }

  static String newSkill(int newLevel)
  {
    String skill;
    if(newLevel > 100)//This if else statement checks if newlevel is over 100
    {
      skill = "Due to your level now being " + newLevel + ", you have unlocked Flurry Rush.";
    }else{
      skill = "Due to your level now being " + newLevel + ", you still have Flurry. Once your level  is greater than 100, you will unlock Flurry Rush";
    }
    return skill;//This sends skill back to my main method
  }


}