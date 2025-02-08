class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }

            if (count > limit) {
                count = power;
            }

            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 3, 2)); // 10
        System.out.println(sol.solution(10, 3, 2)); // 21
    }
}
