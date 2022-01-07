find_greatest_common_denominator.py

1. Take two integers and put them in a and b.
2. If a>b, divide a and b and put the remainder value in r. i.e  r = a%b;
3. If r == 0, the gcd value is b. 
4. Else, put value of b in a and value of r in b and repeat step 2 until you achieve r=0.
5. Then, returb b.

Program in Python:

def gcd(a,b):
    while(b!=0):
    t = a
    a = b
    b = t % b

    return a


Example: gcd(45, 10)  = 5.
gcd(69, 33 )  = 3.
