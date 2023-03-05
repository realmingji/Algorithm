def solution(s):
    answer = ''
    s = s.split(' ') # 문자열 쪼개는 함수 모양 => 문자열.split()
    for i in range(len(s)):
        s[i] = s[i].capitalize()    # 맨 첫 문자는 대문자  
    return ' '.join(s)