// 문제: 전화번호 목록 (Lv.2)
// 유형: 해시
// 풀이: 정렬 -> prefix 탐색이 더 효율적

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}