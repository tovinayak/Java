#### Problem Description:
    Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between 
    computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
#### If C is equal to: 
     1, then print the sum
     2, then print the product
     Any other number, then print '-1' (without the quotes)
##### Input format : 
    Line 1 : Integer N
    Line 2 : Choice C
##### Output Format : 
    Sum or product according to user's choice
##### Constraints :
    1 <= N <= 12
##### Sample Input 1 : 
    10
    1
##### Sample Output 1 : 
    55
##### Sample Input 2 : 
    10
    2
##### Sample Output 2 : 
    3628800
##### Sample Input 3 : 
    10
    4
##### Sample Output 3 : 
    -1
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/SumOrProduct.java)

#### Problem Description:
    Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. 
##### Input format : 
    Integer x
##### Output format : 
    Terms of series (separated by space)
##### Constraints :
    1 <= N <= 1,000
##### Sample Input 1 : 
    10
##### Sample Output 1 : 
    5 11 14 17 23 26 29 35 38 41
##### Sample Input 2 : 
    4
##### Sample Output 2 : 
    5 11 14 17
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/TermsOfAP.java)

#### Problem Description:
    Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
##### Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
##### Input format : 
    Integer N
##### Output format : 
    Corresponding reverse number
##### Constraints:
    0 <= N < 10^8
##### Sample Input 1 : 
    1234
##### Sample Output 1 :
    4321
##### Sample Input 2 : 
    1980
##### Sample Output 2 :
    891
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/ReverseOfANumber.java)

#### Problem Description:
    Given a binary number as an integer N, convert it into decimal and print.
##### Input format : 
    An integer N in the Binary Format
##### Output format : 
    Corresponding Decimal number (as integer)
##### Constraints :
    0 <= N <= 10^9
##### Sample Input 1 : 
    1100
##### Sample Output 1 : 
    12
##### Sample Input 2 : 
    111
##### Sample Output 2 : 
    7
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/BinaryToDecimal.java)

##### Problem Description:
    Given a decimal number (integer N), convert it into binary and print. 
#### The binary number should be in the form of an integer.
##### Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java. 
##### Input format : 
    Integer N
##### Output format : 
    Corresponding Binary number (long)
##### Constraints :
    0 <= N <= 10^5
##### Sample Input 1 : 
    12
##### Sample Output 1 : 
    1100
##### Sample Input 2 : 
    7
##### Sample Output 2 : 
    111
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/DecimalToBinary.java)

#### Problem Description:
    Given a number N, find its square root. You need to find and print only the integral part of square root of N.
#### For eg. if number given is 18, answer is 4.
##### Input format : 
    Integer N
##### Output Format : 
    Square root of N (integer part only)
##### Constraints :
    0 <= N <= 10^8
##### Sample Input 1 : 
    10
##### Sample Output 1 : 
    3
##### Sample Input 2 : 
    4
##### Sample Output 2 : 
    2

Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/SqureRoot.java)

#### Problem Description:
    You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : 
    s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the
    second is strictly increasing one.
##### Note : We say that x is strictly larger than y when x > y.
##### So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.
#### That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, they cannot decrease at any point further. 
##### Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true.
##### You just need to print true/false. No need to split the sequence.
##### Input format : 
    Line 1 : Integer 'n'
    Line 2 and Onwards : 'n' integers on 'n' lines(single integer on each line)
##### Output Format : 
    "true" or "false" (without quotes)
##### Constraints :
    0 <= n <= 10^7
##### Sample Input 1 : 
    5
    9
    8
    4
    5
    6
##### Sample Output 1 : 
    true
##### Sample Input 2 : 
    3
    1
    2
    3
##### Sample Output 2 : 
    true
##### Sample Input 3 : 
    3
    8
    7
    7
##### Sample Output 3 : 
    false
##### Explanation for Sample Format 3 : 
    8 7 7 is not strictly decreasing, so output is false.
##### Sample Input 4 : 
    6
    8
    7
    6
    5
    8
    2
##### Sample Output 4 : 
    false
##### Explanation for Sample Input 4 :
    The series is :
    8 7 6 5 8 2
    It is strictly decreasing first (8 7 6 5). Then it's strictly increasing (5 8). But then it starts strictly decreasing 
    again (8 2). Therefore, the output for this test case is 'false'
    
Answer: [Code](https://github.com/tovinayak/Java/blob/fdc41ce5bb0ec63f69777a6c50d0b71a59f8327a/Assignment:%20More%20onLoops/CheckNumberSequence.java)
