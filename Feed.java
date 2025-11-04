import java.util.Scanner;

public class Feed {
  Post[] posts;
  int fastLikes = 0;
  int sustainLikes = 0;
  int cityHealth = 50; // Range allowed: -10 .. 110
  Scanner input;

  public Feed(Post[] posts, Scanner input) {
    this.posts = posts;
    this.input = input;
  }

  public void simulate() {
    for (Post p : posts) {
      showPost(p);
    }
    summary();
  }

  public void showPost(Post p) {
    System.out.println("--------------------------------");
    System.out.println("Post: " + p.tag);
    System.out.println("Type: " + (p.type.equals("fast") ? "Fast Fashion" : "Sustainable"));
    System.out.println("Reach: " + p.reach + " likes");
    System.out.print("Do you want to like this post? (type 'like' or press Enter to skip): ");
    String choice = input.nextLine().trim().toLowerCase();

    if (choice.equals("like")) {
      if (p.type.equals("fast")) {
        fastLikes++;
        cityHealth -= 10; 
        System.out.println("You liked a fast fashion post.");
        System.out.println("Factories ramp up cheap production for viral trends.");
        System.out.println("Smog rolls over the Los Angeles skyline. City Health decreases to " + cityHealth + "%.");
      } else {
        sustainLikes++;
        cityHealth += 12;
        System.out.println("You liked a sustainable fashion post.");
        System.out.println("Local thrift stores and eco-designers gain attention.");
        System.out.println("The air in Los Angeles feels cleaner. City Health increases to " + cityHealth + "%.");
      }
    } else {
      System.out.println("You scrolled past this post.");
      if (p.type.equals("fast")) {
        cityHealth += 8; 
        System.out.println("You ignored a fast fashion ad. LA breathes a little easier.");
      } else {
        cityHealth -= 7; 
        System.out.println("You skipped a sustainable post. A small chance for awareness was missed.");
      }
      System.out.println("Current City Health: " + cityHealth + "%.");
    }

    // Allow overflow/underflow but clamp only the display bar later
    if (cityHealth < -10) cityHealth = -10;
    if (cityHealth > 110) cityHealth = 110;

    drawCityVisual(cityHealth);
    System.out.println("--------------------------------\n");
  }

  private void drawCityVisual(int health) {
  // Show a 0–100 bar, but report the true (possibly overflow) health number
  int displayHealth = Math.max(0, Math.min(health, 100));
  int filled = Math.round(displayHealth / 5.0f); // 20-slot bar
  int empty = 20 - filled;
  String bar = "[" + "#".repeat(filled) + "-".repeat(empty) + "]";
  System.out.println("City Health: " + bar + " " + health + "%");

  // Three visual tiers only: >75 thriving, 25–75 neutral/haze, <25 collapsing
  String[] scene;
  if (health > 75) {
    scene = new String[]{
      "                    \\   |   /                    ",
      "                     .--*--.                     ",
      "                ____/  ***  \\____               ",
      "               /    \\  ***  /    \\   mountains  ",
      "              /______\\_____/______\\             ",
      "             |  []   []   []   []  |  skyline   ",
      "             |  []   []   []   []  |            ",
      "          ___|_______________________|___        ",
      "             ^    ^     ^    ^    ^             ",
      "        Clear air, trees, and bright sunlight.  "
    };
  } else if (health < 25) {
    scene = new String[]{
      "            (========)    (========)            ",
      "           (==========)  (==========)           ",
      "             ||    ||      ||    ||             ",
      "  ~~~~~~~~~~ SMOG ~~~~~~~~~~~~ SMOG ~~~~~~~~~~  ",
      "         ____ ____   ____ ____   ____           ",
      "        |####|####| |####|####| |####|  waste   ",
      "        |####|####| |####|####| |####|          ",
      "      __|_______________________________|__      ",
      "        Debris, dark smoke, skyline obscured.   ",
      "        Los Angeles is collapsing.              "
    };
  } else {
    scene = new String[]{
      "                    ~  ~  ~                     ",
      "                  Haze over LA                  ",
      "             /\\      /\\      /\\               ",
      "            /__\\____/__\\____/__\\              ",
      "           |  []  |  []  |  []  |   skyline     ",
      "           |  []  |  []  |  []  |               ",
      "        ___|___________________________|___      ",
      "            Choices now decide the path.         ",
      "     Support sustainable posts to clear the air. ",
      "                                                 "
    };
  }

  for (String line : scene) System.out.println(line);
}


  public void summary() {
    System.out.println("===== END OF FEED =====");
    System.out.println("Fast Fashion Likes: " + fastLikes);
    System.out.println("Sustainable Likes: " + sustainLikes);
    System.out.println("Final City Health: " + cityHealth + "%\n");

    if (cityHealth > 100) {
      System.out.println("Los Angeles is a model of sustainability and clean design.");
    } else if (cityHealth < 0) {
      System.out.println("Los Angeles has collapsed into environmental crisis.");
      System.out.println("Fast fashion overwhelmed progress toward sustainability.");
    } else {
      System.out.println("The city stands in a delicate balance.");
      System.out.println("With more sustainable engagement, LA can thrive.");
    }

    System.out.println("\nReflection:");
    System.out.println("Every like or skip shaped the health of Los Angeles.");
    System.out.println("Social media can either heal or harm a city, depending on how we engage.");
  }
  
}
