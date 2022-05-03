public class InfiniteRecursionExample {

  class A {
    void meth() {}
  }
  class A1 extends A {}
  class A2 extends A {}

  public static int myPow(int num, int exponent) {
    num = num * myPow(num, exponent - 1); // Noncompliant
    return num;
  }

  public static void meth(A a) {
    if (a instanceof A1) {
      meth(a);
    }
    a.meth();
  }

  public static void meth2(boolean p) {
    if (p) {
      meth2(p);
    } else {
      meth2(p);
    }
  }

}
