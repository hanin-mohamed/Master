public class CarV1 implements Movable,SelfDrivable{
    private int x,y;
    private int numOfPass;
    public CarV1(){}
    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void dest(String d) {
        System.out.println("Destination : "+d);
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

}
