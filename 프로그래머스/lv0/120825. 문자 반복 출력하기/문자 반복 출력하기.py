def solution(my_string, n):
    answer = ''
    str = list(my_string)
    
    for i in range(len(str)):
        str[i] = str[i] * n
    return answer.join(str)