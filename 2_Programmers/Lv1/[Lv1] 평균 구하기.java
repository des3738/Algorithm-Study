// 문제: 평균 구하기 (Lv.1)
// 풀이: 배열 합산 후 길이로 나누기

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i:arr){
             sum += i;
        }
        return sum/arr.length;
    }
}