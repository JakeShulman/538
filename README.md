# 538

**Who Keeps the Money you Found on the Floor?:**
http://fivethirtyeight.com/features/who-keeps-the-money-you-found-on-the-floor/


You and four statistician colleagues find a $100 bill on the floor of your department’s faculty lounge. None of you have change, so you agree to play a game of chance to divide the money probabilistically. The five of you sit around a table. The game is played in turns. Each turn, one of three things can happen, each with an equal probability: The bill can move one position to the left, one position to the right, or the game ends and the person with the bill in front of him or her wins the game. You have tenure and seniority, so the bill starts in front of you. What are the chances you win the money?


I solved this problem by creating a table object of size n, that tracks the location of the bil and that has methods to pass the bill to the right, left, or to end the game. I then ran a simulation 10000 times, where 1/3 of the time the bill gets passed right, 1/3 left and 1/3 to end, running unil the game ends. Every time player 0 (you) ends up with the bill it counts as a win, any other time it counts as a loss. The final answer comes out to be 45.45% when n=6.

This code is run by WhoKeepsTheMoney.java which calls Table.java.


**Will Someone be Sitting in your Seat**
http://fivethirtyeight.com/features/will-someone-be-sitting-in-your-seat-on-the-plane/

There’s an airplane with 100 seats, and there are 100 ticketed passengers each with an assigned seat. They line up to board in some random order. However, the first person to board is the worst person alive, and just sits in a random seat, without even looking at his boarding pass. Each subsequent passenger sits in his or her own assigned seat if it’s empty, but sits in a random open seat if the assigned seat is occupied. What is the probability that you, the hundredth passenger to board, finds your seat unoccupied?

This was a really fun problem to solve, especially since the answer is so suprising! I first solve this problem with statistics, but to double check made this simulation. The sim works by instantiating a list [0,99] which it then shuffles to assign everyone their seats. I then created an array to represent the actual seats and if they are filled. A random location of this array is changed to a 1, to represent that it was taken. Each passenger then goes and sits if their seat if they can, changing their value in the plane array to a 1, or if not, they randomly choose a random seat. The method to run this returns true if the last person's seat is open, and false if not. I run this simulation 10000 times to find the percent chance the last person's seat is available. The answer is that 50% of the time it will be open. 

This code is run by Airplane.java


