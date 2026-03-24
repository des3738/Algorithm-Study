// 문제: 자연수 뒤집어 배열로 만들기
// 풀이: 문자열 변환 후 toCharArray로 역순 추출

class Solution {
    public int[] solution(long n) {
        char[] s = String.valueOf(n).toCharArray();
        int len = s.length;
        int[] answer = new int[s.length];
        for(int i=0; i<len; i++) {
            answer[i] = s[len-1 - i] - '0';
        }
        return answer;
    }
}