def solution(s):
    a = len(s)
    
    if a % 2 == 0:  # 짝수
        return s[(len(s)//2 -1) : len(s)//2+1]
    else :
        return s[len(s)//2]
