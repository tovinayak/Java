##### Problem Description:
    You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search 
    this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In 
    case the element is not present in the array/list, then return -1.
##### Input format : 
    The first line contains an Integer 'N' which denotes the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
    Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..
    All the 't' lines henceforth, will take the value of X to be searched for in the array/list.
##### Output Format : 
    For each test case, print the index at which X is present, -1 otherwise.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^4
    0 <= N <= 10^6
    0 <= X <= 10^9
    Time Limit: 1 sec
 ##### Sample Input 1:
    7
    1 3 7 9 11 12 45
    1
    3
##### Sample Output 1:
    1
##### Sample Input 2:
    7
    1 2 3 4 5 6 7
    2
    9
    7
##### Sample Output 2:
    -1
    6
    
Answer: [Code]()

##### Problem Description:
    Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
##### Note:
    Change in the input array/list itself. You don't need to return or print the elements.
##### Input format : 
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
##### Output format :
    For each test case, print the elements of the array/list in sorted order separated by a single space.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    Time Limit: 1 sec
##### Sample Input 1:
    1
    7
    2 13 4 1 3 6 28
##### Sample Output 1:
    1 2 3 4 6 13 28
##### Sample Input 2:
    2
    5
    9 3 6 2 0
    4
    4 3 2 1
##### Sample Output 2:
    0 2 3 6 9
    1 2 3 4
    
Answer: [Code]()

##### Problem Description:
    Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
##### Note:
    Change in the input array/list itself. You don't need to return or print the elements.
##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.
##### Output Format : 
    For each test case, print the elements of the array/list in sorted order separated by a single space.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    Time Limit: 1 sec
##### Sample Input 1:
    1
    7
    2 13 4 1 3 6 28
##### Sample Output 1:
    1 2 3 4 6 13 28
##### Sample Input 2:
    2
    5
    9 3 6 2 0
    4
    4 3 2 1
##### Sample Output 2:
    0 2 3 6 9
    1 2 3 4 
    
Answer:[Code]()

##### Problem Description:
    You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such 
    that the third array is also sorted.
##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the first array/list.
    Second line contains 'N' single space separated integers representing the elements of the first array/list.
    Third line contains an integer 'M' representing the size of the second array/list.
    Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
##### Output Format : 
    For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.
    Output for every test case will be printed in a separate line.
##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    0 <= M <= 10^5
    Time Limit: 1 sec 
##### Sample Input 1 : 
    1
    5
    1 3 4 7 11
    4
    2 4 6 13
##### Sample Output 1 :
    1 2 3 4 4 6 7 11 13 
##### Sample Input 2 : 
    2
    3
    10 100 500
    7
    4 7 9 25 30 300 450
    4
    7 45 89 90
    0
##### Sample Output 2 :
    4 7 9 10 25 30 100 300 450 500
    7 45 89 90
    
Answer:[Code]()
