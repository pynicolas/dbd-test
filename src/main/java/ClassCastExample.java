import java.util.ArrayList;

public class ClassCastExample {

  public int foo() {
    Object a = new ArrayList<>();
    return ((String) a).length();
  }

  public void callsCastToString() {
    Object a = new ArrayList<>();
    castToString(a);
  }

  private String castToString(Object p) {
    return (String) p;
  }

}
