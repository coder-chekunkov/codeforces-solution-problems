# Level - 800
# Link - https://codeforces.com/problemset/problem/1228/A

def is_distinct(x):
    return len(set(str(x))) == len(str(x))


L, R = [int(c) for c in input().split()]
found = False
for i in range(L, R + 1):
    if is_distinct(i):
        found = True
        print(i)
        break
if not found: print(-1)
