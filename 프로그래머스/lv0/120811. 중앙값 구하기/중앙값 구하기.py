def solution(array):
    array.sort()

    a = len(array)  

    if ( a % 2 == 1 ):
        return array[int(a/2)]