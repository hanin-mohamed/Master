public class Main {

    //implement interface
    public interface showable {
        public void print(int x);

    }
    public static void main(String[] args) {
        Test test =new Test(){
            @Override
            public void testMethod() {
                System.out.println("Test2" );
            }
        };
        test.testMethod();


        showable showable;
        showable=new showable(){
            @Override
            public void print(int x){
                System.out.println("showable : "+x);
            }
        };
        showable=(x)->
            System.out.println("showable: "+x);
        showable.print(6);

        RewardClass rew1 = new RewardClass();
        rew1.rewardMethod();
       /*
       RewardClass rew3=new RewardClass(){
             //anonymous inner class
             // outer class$inner class
            @Override
            public void rewardMethod() {
                System.out.println("Your reward is 200$");
            }
        };
                rew3.rewardMethod();
*/
        new RewardClass() {
            //anonymous inner class
            // outer class$inner class
            @Override
            public void rewardMethod() {
                System.out.println("Your reward is $200");
            }
        }.rewardMethod();


    }

}