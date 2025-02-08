import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        
        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println((sol.solution("Programmers")));
    }
}
