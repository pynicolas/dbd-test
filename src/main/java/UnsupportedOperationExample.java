import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnsupportedOperationExample {

  public void intra_procedural(boolean condition) {
    List x = new ArrayList();
    if (condition) {
      x = Collections.emptyList();
    }
    if (!condition) {
      x.add("abc"); // Compliant
    }
    if (condition) {
      x.add("abc"); // Noncompliant
    }
  }

}
