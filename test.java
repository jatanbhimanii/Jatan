import java.util.Scanner; 
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter element no. "+(i+1) + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("Total no. of `9's in the array: "+ array_count9(a,n));
        System.out.println("MIRAL JOSHI- 20DCS033");
        sc.close();
    }
    public static int array_count9(int[] a, int n) {
        int cnt=0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]==9)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
