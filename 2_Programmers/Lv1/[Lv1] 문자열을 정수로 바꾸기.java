// 문제: 문자열을 정수로 바꾸기
// 풀이: Integer.parseInt()로 문자열 -> 정수 변환

class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}