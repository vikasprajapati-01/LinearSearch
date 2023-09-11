import java.util.*;

public class Main
{
    // Linear search means searching an element using a normal single for loop
    static int search(int[] arr, int target)
    {
        int res=0;
        for(int i=0; i<arr.length; i++)  // Search for the element in the loop
        {
            if(arr[i] == target)
            {
                res = 1;
                break;
            }
            else
            {
                res = 0;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
        int target;
        System.out.println("Enter the elment you want to search:");
        target = sc.nextInt();
        int res = search(arr, target);
        
        if(res==1)
        {
            System.out.println("Number " + target + " is present in the array.");
        }
        else
        {
            System.out.println("Number " + target + " is not present in the array.");
        }
    }
}