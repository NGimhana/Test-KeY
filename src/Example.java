public class Example {
    /*@ public normal_behavior
      @ requires true;
      @ ensures true;
      @*/
    public int square(int x) {
        return x*x;
    }
}
