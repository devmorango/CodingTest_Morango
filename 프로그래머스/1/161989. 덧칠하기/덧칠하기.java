class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;      
        int paintedEnd = 0;  
        for (int s : section) {
            if (s > paintedEnd) {
                paintedEnd = s + m - 1;
                answer++;
            }  
        }
        return answer;
    }
}
