// 문제: 약수의 합
// 풀이: 1부터 n까지 반복하며 약수 합산

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}