public class Child {
    int x;
    int y;
    int z;
    Child(int x){
        this.x=x;
    }
    Child(int x, int y){
        this(x);
        this.y=y;
    }
    Child(int x, int y, int z){
        this(x,y);
        this.z=z;
    }
}
