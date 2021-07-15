##### Problem Description: 
    Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
    1, if the character is an uppercase alphabet (A - Z)
    0, if the character is a lowercase alphabet (a - z)
    -1, if the character is not an alphabet

##### Input format : 
    Single Character

##### Output format : 
    1 or 0 or -1

##### Constraints :
    Input can be any character

 ##### Sample Input 1 : 
    v

##### Sample Output 1 : 
    0

##### Sample Input 2 : 
    V

##### Sample Output 2 : 
    1

##### Sample Input 3 : 

    #

##### Sample Output 3 : 
    -1

Answer: [Code](https://github.com/tovinayak/Java/blob/d6b9e3fe578076fa4f757bf9da52cbad7b2671aa/Lecture%203:%20Conditionals%20and%20Loops/FindCharacterCase.java)

##### Problem Description:
    Given a number N, print sum of all even numbers from 1 to N.
    
##### Input Format : 
    Integer N

##### Output Format : 
    Required Sum 
##### Sample Input 1 :
     6
##### Sample Output 1 :
    12
    
Answer: [Code]

##### Problem Description:
    Given three values - Start Fahrenheit Value  (S), End Fahrenheit value (E) and Step Size (W), 
    you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding
    Celsius values and print the table.

##### Input Format :
    3 integers - S, E and W respectively 

##### Output Format :
    Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value. On 
    Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

##### Constraints :
    0 <= S <= 80
    S <= E <=  900
    0 <= W <= 40 
##### Sample Input 1:
    0 
    100 
    20
##### Sample Output 1:
    0	-17
    20	-6
    40	4
    60	15
    80	26
    100	37
##### Sample Input 2:
    20
    119
    13
##### Sample Output 2:
    20	-6
    33	0 
    46	7
    59	15
    72	22
    85	29
    98	36
    111	43
##### Explanation For Input 2: 
    We need need to start calculating the Celsius values for each of the Fahrenheit Value which starts from 20.
    So starting from 20 which is the given Fahrenheit start value, we need to compute its corresponding Celsius
    value which computes to -6. We print this information as <Fahrenheit Value> a tab space"\t" <Celsius Value> 
    on each line for each step of 13 we take to get the next value of Fahrenheit and extend this idea till we 
    reach the end that is till 119 in this case. You may or may not exactly land on the end value depending on 
    the steps you are taking.
 
Answer: [Code]
