// 문제: 정수 내림차순으로 배치하기 (Lv.1)
// 풀이: 문자열 변환 후 정렬

import java.util.Collections;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        String s = "";
        for(String i:arr) {
            s += i;
        }
        answer = Long.parseLong(s);
        return answer;
    }
}