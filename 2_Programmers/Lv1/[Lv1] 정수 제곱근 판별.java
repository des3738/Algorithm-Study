// 문제: 정수 제곱근 판별
// 풀이: Math.sqrt()로 제곱근 구한 후 정수 여부 판별

class Solution {
    public long solution(long n) {
        long answer = 0;
        int r = (int)Math.sqrt(n);
        if(r == Math.sqrt(n)) {
            answer = (long)Math.pow(r + 1, 2);
        }
        else {
            answer = -1;
        }
        return answer;
    }
}