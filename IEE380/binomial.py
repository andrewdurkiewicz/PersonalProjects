import numpy as np
import math
x = np.arange(3,5,1)
def find(p,n,i):
    return ((math.factorial(n)/(math.factorial(i)*math.factorial(n-i)))*(p)**(i) * (1-p)**(n-i))
result = 0

for i in x:
    result = result + find(.5,10,i)
print("-----------------")
print(1-result)
print(x)
