package findIndexInString;

public class SolutionFindIndex {
    public int strStr(String haystack, String needle) {
        //TODO перерешать
        int i = 0;

        for (int j = 0; j < haystack.length(); j++) {
            while (i < needle.length() && haystack.charAt(i) == needle.charAt(i)) {
                i++;
                if (i == needle.length()) {
                    return j;
                }
            }
            if (haystack.length() - j < needle.length()) {
                return -1;
            }
        }

        return i;
    }
}





































//if (haystack.length() < needle.length()) {
//        return -1;
//        }
//
//        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//        if (haystack.substring(i, i + needle.length()).equals(needle)) {
//        return i;
//            }
//                    }
//
//                    return -1;
