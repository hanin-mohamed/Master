public class Mathh {
    int val;
    public Mathh(){}
    public Mathh(int val){
        this.val=val;
    }
     Mathh add(Mathh obj2) {
        Mathh obj3 = new Mathh();
        obj3.val = this.val + obj2.val;
        return obj3;
    }
    boolean isEqual(Mathh obj2){
        return this.val == obj2.val;
    }
}
