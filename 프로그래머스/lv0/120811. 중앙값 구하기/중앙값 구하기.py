def solution(array):
    array.sort()
    
    a = len(array)  
    
    if ( a % 2 == 0 ):   # 짝수
        return a
    else:               # 홀수
        return array[int(a/2)]