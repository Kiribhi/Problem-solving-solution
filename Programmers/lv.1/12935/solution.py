# https://programmers.co.kr/learn/courses/30/lessons/12935

def solution(arr):
    arr.remove(min(arr))
    return [-1] if len(arr) < 1 else arr
