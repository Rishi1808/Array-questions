public class binarySearch1
{
   public  static int binarySearch(int[] arr,int item)
   {
   int low=0;
   int high= arr.length-1;
   while (low<=high)
   {
       int mid=low+((high-low))/2;
       if(arr[mid]==item)
           return mid;
       else if (arr[mid]<item) {
           low=mid+1;

       }
       else
       {
           high=mid;
       }

   }
  return -1;

   }

    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,6));
   }
}
