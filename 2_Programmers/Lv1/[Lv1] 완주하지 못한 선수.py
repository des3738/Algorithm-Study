# 문제: 완주하지 못한 선수 (Lv.1)
# 유형: 해시 (dict / Counter)
# 풀이: counter로 참가자 이름 저장 후 완주자 이름으로 차감, 남은 사람이 완주 못한 사람

from collections import Counter

def solution(participant, completion):
    p = Counter(participant)
    c = Counter(completion)

    result = p - c

    return list(result.keys())[0]
