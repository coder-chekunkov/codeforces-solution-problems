# Level - 800
# Link - https://codeforces.com/problemset/problem/248/A

n = int(input())
lo = 0
lz = 0
ro = 0
rz = 0
for i in range(n):
    string = input()
    a, b = string.split()
    if a == "0":
        lz += 1
    if a == "1":
        lo += 1
    if b == "0":
        rz += 1
    if b == "1":
        ro += 1
ans = min(lo, lz) + min(ro, rz)
print(ans)
