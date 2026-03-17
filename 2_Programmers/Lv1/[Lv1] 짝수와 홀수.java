// 문제: 짝수와 홀수 (Lv.1)
// 풀이: 나머지 연산으로 짝수/홀수 판별

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }
}