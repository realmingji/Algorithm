def solution(n):
    for i in range(1, 1000001):
        if n == i**2:
            return 1
            break
    return 2