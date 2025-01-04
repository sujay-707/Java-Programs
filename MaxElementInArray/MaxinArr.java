public class MaxinArr {
    public static void printArrElements(int arr[])
    {
        for(int i=0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void findMax(int arr[]) {
        int maxNum = arr[0];
        int maxIdx =0;
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i] > maxNum)
            {
                maxNum = arr[i];
                maxIdx = i;
            }
        }
        System.out.println(maxNum + " Found at position "+maxIdx);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 60, 5, 6, 9 };
        // MaxinArr max = new MaxinArr();
        printArrElements(arr);
        System.out.println("The max element from above array element is ");
       findMax(arr);
        
    }

}
