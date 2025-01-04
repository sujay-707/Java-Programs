import java.util.Scanner;

public class LinearSer {

    public void searchLin(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a number from array elements ");
        int key = sc.nextInt();
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Key element found at index/postion " + i);
                return;
            }
        }
        System.out.println("key element which you are searching does not exist in array");
        
    }

    public void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinearSer ls = new LinearSer();
        int arr[] = {5 ,4, 3, 2, 1};
        ls.printArray(arr);
        ls.searchLin(arr);

        
    }
    
}
