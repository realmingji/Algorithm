def solution(numbers):
    # [6, 10, 2]를 [6102, 6210, 1062, 1026, 2610, 2106]
    # 큰 수는 6210 
    numbers = list(map(str, numbers))
    # 인터넷 검색해봄
    numbers.sort(key = lambda x : x * 3, reverse=True) # 역순정렬
    answer = str(int(''.join(numbers)))
    return answer