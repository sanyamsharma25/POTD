class Solution {
    static int threeSumClosest(int[] arr, int target) {
        // code here
        
        
        int n=arr.length;
        Arrays.sort(arr);
        int minsum=arr[0]+arr[1]+arr[n-1];
        for(int i=0;i<n-2;i++){
            int start=i+1;
            int end=n-1;
            
            while(start<end){
                int sum=arr[i]+arr[start]+arr[end];
                int diff=Math.abs(sum-target);
                if(diff<Math.abs(minsum-target)){
                    minsum=sum;
                }
                else if(diff==Math.abs(minsum-target) && sum>minsum){
                    minsum=sum;
                }
                if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return minsum;
    }
}