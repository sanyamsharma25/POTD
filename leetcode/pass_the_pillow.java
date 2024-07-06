class Solution {
    public int passThePillow(int n, int time) {
        if(time<n){
            return time+1;
        }
        else{
            int temp=n-1;
            temp=n*2-2;
            int t1=time%temp;
            if(t1<n){
                return t1+1;
            }
            else{
                return n-(t1-n+1);
            }
           
        }
    }
}

