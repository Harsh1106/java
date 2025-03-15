public class HouseRobber4 {
    public static boolean valid(int nums[],int mid,int k)
    {
        int c=0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]<=mid)
            {
                c++;
                i+=2;
            }
            else
            {
                i++;
            }
            if(c==k)
            return true;
        }
        return false;
    }
    public static int minCapability(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int low=min,high=max;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(valid(nums,mid,k))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,9};
        int k = 2;
        System.out.println(minCapability(nums, k));
    }
}
