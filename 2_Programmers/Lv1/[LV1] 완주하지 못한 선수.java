// 문제: 완주하지 못한 선수 (Lv.1)
// 유형: 해시 (HaspMap)
// 풀이: 참가자 이름을 HashMap에 카운트 저장 후 완주자 이름으로 차감, 남은 사람이 완주 못한 사람

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map  = new HashMap<>();

        for (String p: participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c: completion) {
            map.put(c, map.get(c) - 1);
        }
        for (String key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return "";
    }
}