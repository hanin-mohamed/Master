//package easy;
//
//import java.util.*;
//
//public class LongestCommonPrefix {
//
//
//    public String longestCommonPrefix(String[] strs) {
//        List<String> list = new ArrayList<String>();
//        String s = strs[0], temp = "";
//        boolean flag = false;
//        for (int i = 0; i < s.length(); i++) {
//            temp += s.charAt(i);
//            for (int j = 0; j < strs.length; j++) {
//                if (!strs[j].contains(temp)) {
//                    flag = true;
//                }
//            }
//            if (flag ==false) {
//                list.add(temp);
//            }
//            else {temp=""; break;}
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() > temp.length());
//
//        }
//        return temp;
//    }
//
//    public static void main(String[] args) {
//        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        System.out.println(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//    }
//}
