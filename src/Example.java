public class Example {
    /*@ public normal_behavior
      @ requires true;
      @ ensures true;
      @ assignable \everything;
      @*/
    public int add(int a, int b) {
        return a + b;
    }
}
