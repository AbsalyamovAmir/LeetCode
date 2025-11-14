package longestsubstring;

import java.util.HashSet;

/*
Given a string s, find the length of the longest substring without duplicate characters.
 */
public class SolutionLongSub {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char chRight = s.charAt(right);
            while (set.contains(chRight)) {
                char chLeft = s.charAt(left);
                set.remove(chLeft);
                left++;
            }

            set.add(chRight);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}











































//int left = 0;
//int max = 0;
//HashSet<Character> charSet = new HashSet<>();
//
//        for (int right = 0; right < s.length(); right++) {
//Character chRight = s.charAt(right);
//            while (charSet.contains(chRight)) {
//Character chLeft = s.charAt(left);
//                charSet.remove(chLeft);
//left++;
//        }
//
//        charSet.add(chRight);
//max = Math.max(max, right - left + 1);
//        }
//
//                return max;
