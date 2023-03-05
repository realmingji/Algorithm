def solution(my_string, n):
    answer = ''
    my_string = list(my_string)
    
    for i in range(len(my_string)):
        my_string[i] = my_string[i] * n
    return answer.join(my_string)