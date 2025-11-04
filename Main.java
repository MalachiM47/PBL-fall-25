import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Welcome to LA Fashion Feed ");
    System.out.println("You're scrolling through Los Angeles social media posts...");
    System.out.println("Type 'like' to like a post or press Enter to skip.\n");

    // Create posts
    Post[] posts = {
      new Post("#SheinHaul", "fast", 5000),
      new Post("#ZaraDrop", "fast", 3400),
      new Post("#ThriftLA", "sustainable", 2600),
      new Post("#OutfitRepeat", "sustainable", 1200),
      new Post("#HMMegaSale", "fast", 3000),
      new Post("#UpcycleLA", "sustainable", 1400)
    };

    Feed feed = new Feed(posts, input);
    feed.simulate();

    input.close();
  }
}
