// 문제: 나머지가 1이 되는 수 찾기
// 풀이: 1부터 순차 탐색으로 n%i==1 첫 번째 값 반환

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n-1;i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}