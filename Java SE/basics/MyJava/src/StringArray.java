public class StringArray {
    public static void main(String []args){
        String str=new String("haneen");
        //String str="haneen";
        str=str.concat(" mohamed");  //+string
        String str1="abcD";
        String str2="abce";  //the same place in memory-->string pool
      //  System.out.println(str1.compareTo(str2));//1'st diffrent->(D-e) ASCII
        String s="  hello  ";
        System.out.println(s.trim()+" how are you");//delete spaces
        int n=10;
        String x=String.valueOf(n); //+""
        String a=new String("Hello");
        String b=new String("hello");
        System.out.println(a==b);        //address-new not the same address?
        System.out.println(a.equals(b)); //value only
        System.out.println(a.equalsIgnoreCase(b));//compare with ignore case
        String S="Hi,Iam Haneen";
        String rep=S.replace("Hi","Hello");
        System.out.println(rep);
        String name="how are you?";
        System.out.println(name.contains("how are you"));
        System.out.println(name.contains("hello"));
        System.out.println(name.contains("haneen"));
        System.out.println(name.endsWith("you"));
        System.out.println(name.endsWith("?"));
        System.out.println(name.endsWith("how"));
        System.out.println(a.substring(1));
        System.out.println(a.substring(1,4));
        String str3="aa-bb-cc-dd-ee-ff";
        for (String k:str3.split("-")) {
            System.out.print(k+" ");
        }







    }
}
