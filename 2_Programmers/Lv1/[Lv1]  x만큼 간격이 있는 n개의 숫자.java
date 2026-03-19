// 문제: x만큼 간격이 있는 n개의 숫자
// 풀이: 반복문으로 x의 배수를 순서대로 배열에 저장

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0;i<n;i++){
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }
}