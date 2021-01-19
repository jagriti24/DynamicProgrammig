// https://leetcode.com/problems/climbing-stairs/
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step
 

// Constraints:

// 1 <= n <= 45

class ClimbingStairsProblem.java {
    Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
    int x=0;
    
    public int climbStairs(int n) {
        return rec(1,n);
    }
    
    private int rec(int i,int n){
        if(i>=n){
            return 1;
        }
        if(visited.containsKey(i)){
            return visited.get(i);
        }
        
        x = rec(i+1,n) + rec(i+2,n);
        visited.put(i,x);
        return x;
    }
}
