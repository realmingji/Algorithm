def solution(array, commands):
    # array=[1,5,2,6,3,7,4], i=2, j=5, k=3
    # i번째부터 j번째까지 자르기
    # 배열 정렬 후 k번째 숫자 구하기
    count = []
    for i, j, k in commands:
        slice = array[i-1:j]
        slice.sort()
        count.append(slice[k-1])
    return count