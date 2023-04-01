def solution(array):
    answer = [0, 0]
    max = array[0]
    for i in range(len(array)):
        if array[i] > max:
            max = array[i]
            answer[0] = max
            answer[1] = i
    return answer