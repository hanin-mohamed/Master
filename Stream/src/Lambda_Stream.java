import java.util.*;
import java.util.stream.Collectors;

public class Lambda_Stream {
    public static void main(String[] args) {
        List<Integer> nums =  Arrays.asList(1,3,2,5,6,4,7,10);
        int res=0;
        for(int i=0; i<nums.size(); i++){
            if (nums.get(i)%2==0){
                res+=nums.get(i)*2;
            }
        }
        System.out.println(res);

      int res2=  nums.stream()
                .filter(num -> num%2==0)
                .map(num -> num*2) //input->num ,Output->num*2
                .reduce(0,(tot,num)->num+tot)//initial=0, every iterate->tot=tot+num(num*2)
                .intValue();
        System.out.println(res2);

      int res3=nums.stream()
              .filter(num->num%2==0)
              .map(num->num*2)
              .mapToInt(num->num)
              .sum();  //add and store in sum
        System.out.println(res3);


        int FirstEvenNumBig3 = nums.stream()
                .filter(num->num%2==0&&num>3)
//                .filter(num->num>3)
                .findFirst()
                .orElse(3);
        System.out.println("FirstEvenNumBig3 is : "+FirstEvenNumBig3);


      List<Integer>DoubleOdd=  nums.stream()
                .filter(num->num%2!=0)
                .map(num->num*2)
                .collect(Collectors.toList());
        System.out.println("DoubleOdd : "+DoubleOdd);


        List<Item> itemList=new ArrayList<>();
        itemList.add(new Item(1,"Java"));
        itemList.add(new Item(2,"Python"));
        itemList.add(new Item(3,"C++"));
        itemList.add(new Item(4,"JavaScript"));
        itemList.add(new Item(5,"C#"));

        List<String>name=
                itemList.stream()
                .map(item->item.getName())
                .collect(Collectors.toList());
        System.out.println("Item Names is:  "+name);

        Map<Integer,String>Details=
                itemList.stream()
                .collect(Collectors.toMap(item->item.getId(),item->item.getName()));
        System.out.println("Items Details is : "+Details);

        long EvenCnt =nums.stream()
                .filter(num->num%2==0)
                .count();
        System.out.println("Even Count: "+EvenCnt);

    }
}
