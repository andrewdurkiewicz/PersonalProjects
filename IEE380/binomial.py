import numpy as np
import math
x = np.arange(0,16,1)
def binomial(p,n,i):
    return ((math.factorial(n)/(math.factorial(i)*math.factorial(n-i)))*(p)**(i) * (1-p)**(n-i))
result = 0

for i in x:
    result = result + binomial(0.75,20,i)
print("-----------------")
print(1-result)
print(x)
