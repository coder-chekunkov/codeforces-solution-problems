#Level - 800
#Link: https://codeforces.com/problemset/problem/1491/A

n, q = map(int,input().split())
a = list(map(int,input().split()))
zero = a.count(0)
one = n - zero
for _ in range(q):
    t, x = map(int,input().split())
    if t == 1:
        if a[x-1] == 1:
            zero += 1
            one -= 1
            a[x-1] = 0
        else:
            zero -= 1
            one += 1
            a[x-1] = 1
    else:
        if x<=one:
            print(1)
        else:
            print(0)