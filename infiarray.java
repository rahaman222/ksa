package Binarysearch;

public class infiarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=10;
        int start=0;
        int end=1;
        int mid=(start+end)/2;
        while(a[end]<target)
        {
          int newstart=end+1;
          end=end+(end-start+1)*2;
          start=newstart;
        }
        while(start<=end)
        {
            if(a[mid]>target)
            {
                end=mid-1;
            }
            else if(a[mid]<target)
            {
                start=mid+1;
            }
            else{
                System.out.println(mid+1);
                break;
            }
            mid=(start+end)/2;
        }
       
    }
    
}
