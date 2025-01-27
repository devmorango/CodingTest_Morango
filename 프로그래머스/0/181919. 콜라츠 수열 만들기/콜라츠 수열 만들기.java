class Solution {
    public int[] solution(int n) {
        int[] temp = new int[1000];
        int count = 0;      
        while (n != 1) {
            temp[count++] = n;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        temp[count++] = n; 

       
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}
