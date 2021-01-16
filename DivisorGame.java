//https://leetcode.com/problems/divisor-game/

// Alice and Bob take turns playing a game, with Alice starting first.

// Initially, there is a number N on the chalkboard.  On each player's turn, that player makes a move consisting of:

// Choosing any x with 0 < x < N and N % x == 0.
// Replacing the number N on the chalkboard with N - x.
// Also, if a player cannot make a move, they lose the game.

// Return True if and only if Alice wins the game, assuming both players play optimally.

 

// Example 1:

// Input: 2
// Output: true
// Explanation: Alice chooses 1, and Bob has no more moves.
// Example 2:

// Input: 3
// Output: false
// Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.

class Solution {
    public boolean divisorGame(int N) {
      int x = recurssive(1,N);
     return (x%2==0) ? false:true;
    }
    
    private int recurssive(int c, int N){
        
        // System.out.println(N);
        if(N==1 || c>=N){
            return 0;
        }
        
        if(N%c==0){
            return  1 + recurssive(1,N-c);
        }
        else{
            return recurssive(c++,N);
        }
    }
}
