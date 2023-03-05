def solution(s):
    answer = list(str(s))
    answer.sort(reverse=True)
    return str(''.join(answer))