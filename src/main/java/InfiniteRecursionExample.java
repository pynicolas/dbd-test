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

  public static int allReachablePathsRecursive(boolean b) {
    if (b) return allReachablePathsRecursive(!b); // Noncompliant
    if (!b) return allReachablePathsRecursive(!b);
    return 42; // Unreachable
  }

}
