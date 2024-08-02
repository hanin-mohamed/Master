public class Square implements Shape {
   private int side;

   public void setSide( int width) {
       side = width;
   }
    @Override
    public int area() {
        return side*side;
    }
}
