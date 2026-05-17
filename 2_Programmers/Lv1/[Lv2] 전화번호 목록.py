# 문제: 전화번호 목록 (Lv.2)
# 유형: 해시
# 풀이: 정렬 -> prefix 탐색이 더 효율적

"""
def solution(phone_book):
    s = set(phone_book)

    for phone in phone_book:
        prefix = ""

        for i in phone[:-1]:
            prefix += i
            if prefix in phone_book:
                return False
    return True
"""

def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book)-1):
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    return True