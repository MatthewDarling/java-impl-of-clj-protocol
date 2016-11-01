import org.example.thing.Extension;

public class Point implements Extension {
  public int actions_completed;

  public Point() {
    this.actions_completed = 0;
  }

  public Object action1() {
    this.actions_completed += 1;
    return null;
  }

  public Object action2(Object arg1) {
    this.actions_completed += 2;
    return null;
  }

  public static void main(String[] args) throws Exception {
    Point testPoint = new Point();
    System.out.println("made an instance of a class that extends my protocol");
    testPoint.action1();
    testPoint.action2("foo");
    System.out.println(testPoint.actions_completed);
  }
}
