# 문제: 폰켓몬 (Lv.1)
# 유형: 해시 (set)
# 풀이: set으로 중복 제거 후 N/2와 비교

def solution(nums):
    n = len(set(nums))

    return min(n, len(nums)//2)