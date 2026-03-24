// 문제: 하샤드 수 (Lv.1)
// 풀이: 문자열 변환 후 자릿수의 합 계산

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] s = Integer.toString(x).split("");
        int sum = 0;

        for(String i:s){
            sum += Integer.parseInt(i);
        }

        if(x%sum == 0){
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}