public class Post {
  String tag;
  String type; // "fast" or "sustainable"
  int reach;

  public Post(String tag, String type, int reach) {
    this.tag = tag;
    this.type = type;
    this.reach = reach;
  }
}
