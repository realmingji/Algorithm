import re

def solution(my_string):
    arr=[]
    sum = 0
    
    result = re.sub(r'[^0-9]', '', my_string)
    
    for i in range(len(result)):
        sum = sum + int(result[i])
    return sum