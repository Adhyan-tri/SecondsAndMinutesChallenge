public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualChecker(1,1,1));

    }
    public static boolean hasEqualChecker(int a, int b, int c)
    {
        if (a+b==c)
        {
            System.out.println(true);
            return true;
        }


        System.out.println(false);
        return false;
    }

}
