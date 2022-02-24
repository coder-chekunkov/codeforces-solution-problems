# Level - 800
# Link - https://codeforces.com/problemset/problem/38/A

n = int(input())
string = input()
mas = list(map(int, string.split()))
string = input()
a, b = map(int, string.split())
ans = 0
for i in range(a - 1, b - 1):
    ans += mas[i]

print(ans)
