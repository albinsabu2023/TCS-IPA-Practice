## task 1
create a class Course having 
 - courseId (int)
 - courseName (String)
 - courseAdmin (String)
 - quiz(int)
 - handson (int)

all attributes should private 
write constructor and getters and setters for all methods 

## task 2
create a static method findAvgQuiz  with main that take two arguments 
 - array of Course objects
 - a String courseadmin name
 - return integer type average 

    method should return average quiz of the course objects that 
    having course admin name that matches the function argument 

## task 3

create a static method  main findSortedCourse that take two arguments 
- array of course objects 
- a handson integer value 
- return a new  array of type Course 

    method should create a new sorted array on the basis of handson value 
    of each objects in the input array & the handson must be less than function argument handon 
    value 


### TEST CASES 

| CourseId | courseName  | courseAdmin | quiz | handson |
|----------|-------------|-------------|------|---------|
|   111    | Kubernetes  | Nisha       |  40  |  10     |
|   321    | casandra    | Rashmi      |  30  |  15     |
|   457    | apachespark | Nisha       |  30  |  12     |
|   987    | sitecore    | Tirth       |  50  |  20     |


input 
```
111
kubernetes
Nisha
40
10

321
cassandra
Rashmi
30
15

457
appache spark
Nisha
30
12

987
sitecore
tirth
50
20

```
### output 
```

kubernetes
appache spark
cassandra
35

```

note in the given answer I have added the objects manually you have to read the object values using a loop and store it in an array dynamically


