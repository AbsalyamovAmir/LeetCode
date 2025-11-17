package LongestCommonPrefix;

public class SolutionLongComPr {
    public String longestCommonPrefix(String[] strs) {
        String pr = strs[0];
        int lengthPr = pr.length();

        for (int i = 1; i < strs.length; i++) {
            String p = strs[i];
            int lengthP = p.length();
            while (lengthPr > lengthP || !pr.equals(p.substring(0, lengthPr))) {
                lengthPr--;

                if (pr.isEmpty()) {
                    return "";
                }

                pr = pr.substring(0, lengthPr);
            }
        }
        return pr;
    }
}















































//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//
//        String pref = strs[0];
//        int prefLen = pref.length();
//
//        for (int i = 1; i < strs.length; i++) {
//            String s = strs[i];
//            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
//                prefLen--;
//                if (prefLen == 0) {
//                    return "";
//                }
//                pref = pref.substring(0, prefLen);
//            }
//        }
//
//        return pref;
//    }
//}
