import numpy as np
import math
def binomial(n,x):
    return math.factorial(n)/(math.factorial(n-x)*math.factorial(x))
def cumulative(n,p,x):
    return binomial(n,x) * ((p)**(x) * (1-p)**(n-x)
x = np.arange(9,10,1)
result = 0
for i in x:
    result+=cumulative(11,.75,i)
    #print(result.as_integer_ratio())
    print(binomial(11,i))
    print(result)
