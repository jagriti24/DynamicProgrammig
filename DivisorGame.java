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
