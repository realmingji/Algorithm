def solution(x):
    answer = list(map(int, str(x))) # 정수를 배열로 변환 list(map(int, 정수)))
    s = sum(answer)
    
    if x % s == 0 :
        return True
    else:
        return False