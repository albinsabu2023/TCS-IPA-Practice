# Step 1: Create the CricketPlayer class
### Attributes: The CricketPlayer class has the following attributes:

- [X] id (int): Unique identification number for the player.
- [X] name (String): Name of the player.
- [X] iccRanking (int): ICC ranking of the player.
- [X] matchesPlayed (int): Number of matches the player has played.
- [X] runs (int): Total runs scored by the player.

All these fields should be private, which means they can only be accessed or modified through methods like getters and setters.

``` Constructor ```: We’ll define a constructor that initializes all these fields when a CricketPlayer object is created.

``` Setters ```: Since the fields are private, we will create setter methods that allow us to set or modify the values of these fields.

# Step 2: Create the Solution Class
### Now we need a class called Solution that will accept an array of CricketPlayer objects and an input value. Here's what this class needs to do:

Filter the players who have played more matches than the input value.

Calculate the average runs per match for each filtered player 
``` (average = runs / matchesPlayed).```

Assign grades:

If the average is between 70 and 90, assign the grade "A".
If the average is between 50 and 70, assign the grade "B".
return an array of grades ;
Finally, print   grade.


## Test cases


ID	Name  Ranking	MatchesPlayed	Runs
100	Sachin	5	       150          13000
101	Sehwag	4	       120        	10000
103	Dhoni	7	       110	        7000
104	Kohli	15	        57	        4400


### input 

```
100
Sachin
5
150
13000
101
sehwag
4
120
10000
103
Dhoni
7
110
7000
104
kohli
15
57
4400
100

```

## output

```

grade A
grade A
grade B

```

