public class Test {
    static class A {
    }
    static class B extends A {
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        System.out.println(a instanceof B);
    }
}
