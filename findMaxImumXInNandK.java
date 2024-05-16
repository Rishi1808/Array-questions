public class findMaxImumXInNandK
{
    public static int find(int n,int k)
    {
        int ans=-1;
        int low=0;
        int high=n;

        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(Math.pow(mid,k)<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(find(169,3));
    }
}
