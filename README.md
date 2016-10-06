# 538

# Who Keeps the Money you Found on the Floor?:
http://fivethirtyeight.com/features/who-keeps-the-money-you-found-on-the-floor/


You and four statistician colleagues find a $100 bill on the floor of your department’s faculty lounge. None of you have change, so you agree to play a game of chance to divide the money probabilistically. The five of you sit around a table. The game is played in turns. Each turn, one of three things can happen, each with an equal probability: The bill can move one position to the left, one position to the right, or the game ends and the person with the bill in front of him or her wins the game. You have tenure and seniority, so the bill starts in front of you. What are the chances you win the money?


I solved this problem by creating a table object of size n, that tracks the location of the bil and that has methods to pass the bill to the right, left, or to end the game. I then ran a simulation 10000 times, where 1/3 of the time the bill gets passed right, 1/3 left and 1/3 to end, running unil the game ends. Every time player 0 (you) ends up with the bill it counts as a win, any other time it counts as a loss. The final answer comes out to be 45.45% when n=6.
