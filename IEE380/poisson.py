import numpy as np 
import math

x = np.arange(0,4)
mean_lambda = 0.19

def poisson(mean_lambda, x):
	return (math.exp(-1*mean_lambda)*mean_lambda**(x))/math.factorial(x)
result = 0
for i in x:
	result+=poisson(mean_lambda,i)

print(result)
