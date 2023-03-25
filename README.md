
# Discrete Structure Project

This project was done for the Discrete Structure class, it should be noted that this project was totally optional, technically without any instructions.

- The project is a type of calculator that contains many of the topics that have been covered in class.
- The code that is in this repository is entirely mine and has no instructions, by this I mean that there were no instructions for this project only that we had to demonstrate our knowledge about the class.
- The code is quite long because it uses a lot of the *JOptionPane* class.
- Every Selction of the menu contains 3 main choices, I - information about the topic, O - Operations, G - Go back to previous screen or Menu selection

## Demostration video: [Google Drive Link](https://drive.google.com/file/d/1eYDpQos8fQg8KpCSB9nHhCfGl_vj0z0q/view?usp=share_link).

## Documentation

### Methods / Menu Selection: 

- Set Theory
- Pascal Triangle
- Recursion
- Fibonacci Sequence
- Combinantion
- Permutation
- Quit

### Classes:

- Main.java
- Combination_Practice.java
- Fibonacci_Sequence_Operation.java
- Number_System_Operation.java
- Pascal_Triangle_Operation.java
- Permutation_Operation.java
- Recursion_Operation.java
- Set_Theory_Operation.java
- Wiki_Discrete.java

    - Where the information it's read from
    - You may need to change the file location in order to run de program and have the info display
### Set Theory

- Contains Information about set theory and it's history

- Operations:

    - Union union of set
    - Intersection of set
    - Difference of set
- Each operation can perfom with a maximun of 4 sets

    - Input: it has to be with comma to divide, no space
    
    - ex: a,b,c,1,2,3 or hi,bye,123,45
        -
    
### Pascal Triangle

- Contains information about Pascal Triangle & History

- Create a Pascal triangle  with the amount of line that you want 

    - The triangle does not display correctly because since it's not printing in the cosole, it's printing in a JOptionPane dialog box, so content may differ.


### Recursion

- Can Display some background Information about Recursion
- Every Operation it's done recursively 
- Operations
    - 
    Tower Of Hanoi
    Factorial
    GCD (Greatest Common Divisor)
    LCM (Least Common Multiple)
#### Tower Of Hanoi:
- Genrates the steps you need to do in order to solve your tower of hanaoi
- Promtp the user for the amount of this in their game, and base on that, tells you where to move each piece

#### Factorial
- Prompt the user for a number and it give the factorial version of that number

#### GCD 
- Prompt the user for multiples number, each divided by comman except the last the one, and return the GCD

#### LCM
- Prompt the user for multiples number, each divided by comman except the last the one, and return the LCM
### Fibonacci Sequence

- Contains background information of the Fibonacci Sequence
- Promts the user for a number, and base of that, generates the sequence, ex: if the user enters 6, then 6 Fibonacci number will be generates
- The true goal of this operation was to recieve two integers and starting from their generate at least 12 number, so that it don't always start at 0, 1, the user was supposed to have more control, but fail to this...
### Combination
- Contains information of Combinatorics
The porpuse of this topic was to make a mini game to test your combinatorics skills, the program would randomly choose a number between 1-4, each number represnts a different problem, and each problem generate different numbers every time you run the funciont, and the answer change as well in orde to match the new data

Because of lack of time, I could not finish the function, so you can only play with on question, the question generate different number everytime you run the game, at first you could get 12, the next time maybe 6, the next time maybe 15, every time different number

if you enter the solution correctly it congratulate you and explain the result
if you were not correct it give you 3 opportunities to enter the right answer, else give you the answer + the explanation
### Permutation
- Contains background Information

- Promt the user for a combination of character, without space, no comma, and return a combination of all posible Permutation

    - ex: ABC or 1234

if you enter 3 character the permutation of 3 is 6, you will be 6 different combination, where orders matter   



### Quit

Just Quit the program...
