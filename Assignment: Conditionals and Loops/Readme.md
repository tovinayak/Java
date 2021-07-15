##### Problem Description: 
    Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) 
    and the grade (an uppercase character), and depending upon which the total salary is calculated as - 
		totalSalary = basic + hra + da + allow – pf
##### where : 
    hra   = 20% of basic
    da    = 50% of basic
    allow = 1700 if grade = ‘A’
    allow = 1500 if grade = ‘B’
    allow = 1300 if grade = ‘C' or any other character
    pf    = 11% of basic.
#### **Round off the total salary and then print the integral part only.**
#### **Note: Try finding out a function on the internet to do so**
##### Input format : 
    Basic salary & Grade (separated by space)
##### Output Format : 
    Total Salary
##### Constraints :
    0 <= Basic Salary <= 7,500,000
##### Sample Input 1 :
    10000 A
##### Sample Output 1 :
    17600
##### Sample Input 2 :
    4567 B
##### Sample Output 2 :
    8762
##### Explanation of Input 2:
    We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf. 
    Now when we calculate each of the, it turns out to be:
    hra =  20% of Rs. 4567 = Rs. 913.4
    da = 50% od Rs. 4567 = Rs. 2283.5
    pf = 11% of Rs. 4567 = Rs. 502.37
    Since, the grade is 'B', we take allowance as Rs. 1500.
    On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now 
    rounding it off will result in Rs. 8762 and hence the Answer.

Answer: [Code]

##### Problem Description:
    Write a program to input an integer N and print the sum of all its even digits and 
    sum of all its odd digits separately. 
##### Digits mean numbers, not the places! That is, if the given integer is "13245",even digits are 2 & 4 and odd digits are 1, 3 & 5.
##### Input format : 
     Integer N
##### Output format :
    Sum_of_Even_Digits Sum_of_Odd_Digits
    (Print first even sum and then odd sum separated by space)
##### Constraints
    0 <= N <= 10^8
##### Sample Input 1: 
    1234
##### Sample Output 1: 
    6 4
##### Sample Input 2: 
    552245
##### Sample Output 2: 
    8 15
##### Explanation for Input 2:
    For the given input, the even digits are 2, 2 and 4 and if we take the sum of these 
    digits it will come out to be 8(2 + 2 + 4) and similarly, if we look at the odd digits,
    they are, 5, 5 and 5 which makes a sum of 15(5 + 5 + 5). 
    Hence the answer would be, 8(evenSum) <single space> 15(oddSum)

Answer: [Code]

##### Problem Description:
    Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
##### Note : For this question, you can assume that 0 raised to the power of 0 is 1
##### Input format :
    Two integers x and n (separated by space)
##### Output Format :
    x^n (i.e. x raise to the power n)
##### Constraints:
    0 <= x <= 8 
    0 <= n <= 9
##### Sample Input 1 : 
     3 4
##### Sample Output 1 : 
    81
##### Sample Input 2 : 
     2 5
##### Sample Output 2 : 
    32
    
Answer: [Code]
