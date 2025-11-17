import AddTwo.ListNodeAddTwo;
import AddTwo.SolutionAddTwo;
import LongestCommonPrefix.SolutionLongComPr;
import MergeSortedLinkedLists.ListNodeMergeLinkList;
import MergeSortedLinkedLists.SolutionMergeLinkList;
import ValidParentheses.SolutionValidParent;
import longestPolindromeSubstr.SolutionLongPolinSubstr;
import longestsubstring.SolutionLongSub;
import removeDuplicatesFromSortedArray.SolutionRemDuplFromSortArray;
import removeValueFromSortedArray.SolutionRevValFromSortArray;

public class Main {
    public static void main(String[] args) {
        solutionAddTwo();

        solutionLongSub();

        solutionLongSubPolingrome();

        solutionLonComPr();

        solutionValidParent();

        solutionMergeLinkList();

        solutionRemDuplFromSortArray();

        SolutionRevValFromSortArray solutionRevValFromSortArray = new SolutionRevValFromSortArray();
        solutionRevValFromSortArray.removeElement(new int[] {3,2,2,3}, 3);
    }

    private static void solutionRemDuplFromSortArray() {
        SolutionRemDuplFromSortArray solutionRemDuplFromSortArray = new SolutionRemDuplFromSortArray();
        solutionRemDuplFromSortArray.removeDuplicates(new int[] {1,1,2});
        solutionRemDuplFromSortArray.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
    }

    private static void solutionMergeLinkList() {
        SolutionMergeLinkList sol = new SolutionMergeLinkList();
        ListNodeMergeLinkList listNodeAddTwo1 = new ListNodeMergeLinkList(1, new ListNodeMergeLinkList(2, new ListNodeMergeLinkList(4)));
        ListNodeMergeLinkList listNodeAddTwo2 = new ListNodeMergeLinkList(1, new ListNodeMergeLinkList(3, new ListNodeMergeLinkList(4)));
        sol.mergeTwoLists(listNodeAddTwo1, listNodeAddTwo2);
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
        ListNodeAddTwo listNodeAddTwo1 = new ListNodeAddTwo(2, new ListNodeAddTwo(4, new ListNodeAddTwo(3)));
        ListNodeAddTwo listNodeAddTwo2 = new ListNodeAddTwo(5, new ListNodeAddTwo(6, new ListNodeAddTwo(4)));
        ListNodeAddTwo listNodeAddTwo3 = new ListNodeAddTwo(9, new ListNodeAddTwo(9, new ListNodeAddTwo(9, new ListNodeAddTwo(9, new ListNodeAddTwo(9, new ListNodeAddTwo(9))))));
        ListNodeAddTwo listNodeAddTwo4 = new ListNodeAddTwo(9, new ListNodeAddTwo(9, new ListNodeAddTwo(9)));
        ListNodeAddTwo result12 = solutionAddTwo.addTwoNumbers(listNodeAddTwo1, listNodeAddTwo2);
        ListNodeAddTwo result34 = solutionAddTwo.addTwoNumbers(listNodeAddTwo3, listNodeAddTwo4);
    }
}


