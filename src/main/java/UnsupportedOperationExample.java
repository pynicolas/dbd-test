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


  public List<String> getAllItems(List<String> paidItems) {
    List<String> allItems = getOfferedItems();
    allItems.addAll(paidItems);
    return allItems;
  }

  private List<String> getOfferedItems() {
    return Collections.singletonList("Our catalog");
  }

}
