# import re

# def solution(my_string):
#     arr=[]
#     sum = 0
    
#     result = re.sub(r'[^0-9]', '', my_string)
    
#     for i in range(len(result)):
#         sum = sum + int(result[i])
#     return sum


def solution(my_string):
    answer = 0
    number = ['0','1','2','3','4','5','6','7','8','9']

    for i in range(len(my_string)):
        if my_string[i] in number:
            answer += int(my_string[i])
        else:
            continue

    return answer