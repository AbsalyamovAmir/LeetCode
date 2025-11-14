import AddTwo.ListNode;
import AddTwo.SolutionAddTwo;
import LongestCommonPrefix.SolutionLongComPr;
import ValidParentheses.SolutionValidParent;
import longestPolindromeSubstr.SolutionLongPolinSubstr;
import longestsubstring.SolutionLongSub;

public class Main {
    public static void main(String[] args) {
        solutionAddTwo();

        solutionLongSub();

        solutionLongSubPolingrome();

        solutionLonComPr();

        solutionValidParent();
    }

    private static void solutionValidParent() {
        SolutionValidParent solutionValidParent = new SolutionValidParent();
        solutionValidParent.isValid("()");
        solutionValidParent.isValid("()[]{}");
        solutionValidParent.isValid("(]");
    }

    private static void solutionLonComPr() {
        String[] strs = new String[] {"flower","flow","flight"};
        SolutionLongComPr solutionLongComPr = new SolutionLongComPr();
        solutionLongComPr.longestCommonPrefix(strs);
    }

    private static void solutionLongSubPolingrome() {
        SolutionLongPolinSubstr solutionLongPolinSubstr = new SolutionLongPolinSubstr();
        String result1 = solutionLongPolinSubstr.longestPalindrome("babad");
        String result2 = solutionLongPolinSubstr.longestPalindrome("cbbd");
    }

    private static void solutionLongSub() {
        SolutionLongSub solutionLongSub = new SolutionLongSub();
//        solutionLongSub.lengthOfLongestSubstring("abcabcbb");
        solutionLongSub.lengthOfLongestSubstring("pwwkew");
    }

    private static void solutionAddTwo() {
        SolutionAddTwo solutionAddTwo = new SolutionAddTwo();
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
        ListNode listNode4 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode result12 = solutionAddTwo.addTwoNumbers(listNode1, listNode2);
        ListNode result34 = solutionAddTwo.addTwoNumbers(listNode3, listNode4);
    }
}


