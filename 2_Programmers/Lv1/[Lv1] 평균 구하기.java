// 문제: 평균 구하기 (Lv.1)
// 풀이: 배열 합산 후 길이로 나누기

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
double solution(int arr[], size_t arr_len) {
    
    double answer = 0;
    double sum = 0;
    
    for(int i=0;i<arr_len;i++) {
        sum += arr[i];
    }
    
    answer = sum / arr_len;
    
    return answer;
}