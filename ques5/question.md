## Task:
You are required to create two classes: Sim and Solution.
- [x] Class 1: Sim 
This class should represent a SIM card with the following attributes:

id (integer): A unique number identifying each SIM.
company (String): The name of the telecom company (e.g., Jio, Airtel).
balance (integer): The balance available on the SIM card (e.g., 500).
ratePerSecond (double): The call rate per second for the SIM card (e.g., 1.32).
circle (String): The geographical region where the SIM is used (e.g., Mumbai).
For each of these attributes, you must provide the getters and setters to allow access and modification.

- [x] Class 2: Solution
In the Solution class, implement a static method called matchAndSort with the following signature:


```java 
public static Sim[] matchAndSort(Sim[] sims, String search_circle, double search_rate)
```
Method Details:
This method will take three inputs:

An array of Sim objects (sims[]).
A String called search_circle, representing the region you are looking for (e.g., Mumbai).
A double called search_rate, representing the maximum call rate allowed (e.g., 3.4).
The method should filter the Sim objects based on:

The circle attribute of each SIM must match the search_circle.
The ratePerSecond of the SIM must be less than or equal to search_rate.
After filtering, the method should sort the filtered SIMs by their balance in descending order (i.e., SIMs with a higher balance should come first).

The method should return the filtered and sorted array of Sim objects.

Input:
First, input the values for four SIM objects, one after the other, in this order:
- [x] id (an integer),
- [x] company (a string),
- [x] balance (an integer),
- [x] ratePerSecond (a double),
- [x] circle (a string).
After that, input the values for:
A String search_circle representing the region to filter by.
A double search_rate representing the maximum allowed rate per second for the SIM cards.
Output:
After filtering and sorting, the program should print the IDs of the resulting SIM cards in the sorted order.



### test case 1
 input 

```
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4
```

output

```
4
3
1
2

```

### test case 2
input
```
5
bsnl
220
1.50
delhi
6
jio
600
2.00
delhi
7
airtel
450
1.75
delhi
8
vodafone
300
3.00
delhi
delhi
2.0


```
output
```


```