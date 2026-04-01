// 문제: 폰켓몬 (Lv.1)
// 유형: 해시 (HaspMap)
// 풀이: HashMap으로 종류별 카운트 후 N/2와 비교

import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n:nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return Math.min(map.size(), (nums.length / 2));
    }
}