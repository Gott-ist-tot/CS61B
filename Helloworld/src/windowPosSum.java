public class windowPosSum {
    public static void WindowPosSum(int[] a, int n) {
        int array_sum=0;
        int array_value=0;
        for (int i = 0; i < a.length; i = i + 1) {
            array_sum = 0;
            if (a[i]<0){
                continue;
            }
            if (i == a.length-1) {
                break;
            }
            for (int j = i; j <= i+n; j = j + 1) {
                if (j==a.length){
                    break;
                }
                array_value = a[j];

                array_sum += array_value;
            }
            a[i] = array_sum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        WindowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
