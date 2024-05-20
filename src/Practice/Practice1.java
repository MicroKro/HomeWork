package Practice;

public class Practice1 {
    public static void resurse () {
        int [] recursiv = new int[] {1,2,3,4,5};
        int sum = recurseSum(recursiv, 0);

        System.out.println (sum);
    }
    public static int recurseSum(int[] recursiv, int itemCount) {
        if (itemCount == recursiv.length -1) {
            return recursiv[itemCount];
        }
        int sum = recurseSum(recursiv, itemCount +1) + recursiv[itemCount];
        return sum;
    }
}

