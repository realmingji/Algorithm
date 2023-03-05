def solution(numbers):
    # 정렬하면 뒤에 있는 숫자 2개가 큰 수를 가지니깐 곱해준다.
    numbers.sort()
    result = numbers[-1] * numbers[-2]
    return result