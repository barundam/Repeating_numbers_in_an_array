import java.util.Scanner;

public class repeating_nos {
    public static void main(String args[])
    {
        int i,count,j,s=0;
        int[] arr = new int[100];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i] != -1)
            {
                count = 0;
                for(j=i+1;j<n;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count = 1;
                        arr[j] = -1;
                    }
                }
                if(count == 1)
                    s=s+count;
            }
        }
        System.out.println(s);

    }
}
