import java.util.Arrays;

public class SphenicNumberExample {
    static boolean arr[] = new boolean[10000];

    static void findPrime() {
        Arrays.fill(arr, true);
        for (int p = 2; p * p < 10000; p++) {
            if (arr[p]) {
                for (int i = p * 2; i < 10000; i = i + p)
                    arr[i] = false;
            }
        }
    }

    static int isSphenic(int N) {
        int[] arr1 = new int[8];
        int count = 0;
        int j = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && count < 8) {
                count++;
                arr1[j++] = i;
            }
        }
        if (count == 8 && (arr[arr1[1]] && arr[arr1[2]] && arr[arr1[3]]))
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        findPrime();
        int n = 250;
        int result = isSphenic(n);
        if (result == 1)
            System.out.println("Yes, the given number is sphenic.");
        else
            System.out.println("No, the given number is not a sphenic.");
        System.out.println("passed");
    }
}
