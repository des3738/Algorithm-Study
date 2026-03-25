// 문제: 두 정수 사이의 합 (Lv.1)
// 풀이: Math.min/max로 범위 결정 후 누적 합산

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i=Math.min(a, b); i<=Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}