##### Problem Description:
    Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list. 
##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    The first line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
##### Output Format :
    For each test case, print the sum of the numbers in the array/list.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    Time Limit: 1sec
##### Sample Input 1: 
    1
    3
    9 8 9
##### Sample Output 1:
    26
##### Sample Input 2: 
    2
    5
    1 2 3 4 5 
    3
    10 20 30 
##### Sample Output 2:
    15
    60
    
Answer: [Code]()

##### Problem Description:
    You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the
    given array/list using 'Linear Search'. 
##### You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
##### 'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.
##### Input format : 
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
    Third line contains the value of X(integer to be searched in the given array/list)
##### Output format :
    For each test case, print the index at which X is present or -1, otherwise.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    -2 ^ 31 <= X <= (2 ^ 31) - 1
    Time Limit: 1 sec
##### Sample Input 1:
    1
    7
    2 13 4 1 3 6 28
    3
##### Sample Output 1:
    4
##### Sample Input 2:
    2
    7
    2 13 4 1 3 6 28
    9
    5
    7 8 5 9 5      
    5
##### Sample Output 2:
    -1
    2
    
Answer: [Code]()

##### Problem Description:
    You have been given an empty array(ARR) and its size N. The only input taken from the user will be N 
    and you need not worry about the array. 
##### Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2. 
##### Note: 
    You need not print the array. You only need to populate it.
##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    The first and the only line of each test case or query contains an integer 'N'.
##### Output Format :
    For each test case, print the elements of the arra/listy separated by a single space.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^4
    Time Limit: 1sec
##### Sample Input 1 : 
    1
    6
##### Sample Output 1 :
    1 3 5 6 4 2
##### Sample Input 2 : 
    2
    9
    3
##### Sample Output 2 :
    1 3 5 7 9 8 6 4 2
    1 3 2
    
Answer: [Code]()

##### Problem Description:
    You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
##### You don't need to print or return anything, just change in the input array itself.
##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
##### Output Format :
    For each test case, print the elements of the resulting array in a single row separated by a single space.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    Time Limit: 1sec
##### Sample Input  1: 
    1
    6
    9 3 6 12 4 32
##### Sample Output 1 :
    3 9 12 6 32 4
##### Sample Input  2: 
    2
    9
    9 3 6 12 4 32 5 11 19
    4
    1 2 3 4
##### Sample Output 2 :
    3 9 12 6 32 4 11 5 19 
    2 1 4 3 
    
Answer: [Code]()
