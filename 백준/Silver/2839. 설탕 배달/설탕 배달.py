n=int(input()) # 설탕 18kg
bag=0 # 봉지

# 최소구하기
while n >= 0:     # 5와 3을 구할 수 있을때(?)
    if n%5==0:    # 5의 배수다
        bag+=n//5
        print(bag)
        break;
    n=n-3            # 5의 배수가 아니다? 그러면 설탕(18kg)-3 해줘라
    bag=bag+1        # bag에 1을 더해라
else:
    print(-1)
    