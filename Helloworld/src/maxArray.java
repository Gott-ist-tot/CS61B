public class maxArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int idx=0;
        int temp=0;
        while(idx<m.length){
            if (m[idx]>=temp){
                temp=m[idx];
            }
            idx=idx+1;
        }
        return temp;
    }
    public static int max_for_loop(int[] m){
        int temp=0;
        for( int idx=0; idx<m.length;idx=idx+1){
            if (m[idx]>=temp){
                temp=m[idx];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max_for_loop(numbers));
    }
}
