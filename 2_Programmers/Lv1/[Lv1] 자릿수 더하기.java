// 문제: 자릿수 더하기 (Lv.1)
// 풀이: String 변환 후 각 문자를 숫자로 변환하여 합산

class Solution {
    public int solution(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int answer = 0;
        for(char i:s) {
            answer += i - '0';
        }
        return answer;
    }
}