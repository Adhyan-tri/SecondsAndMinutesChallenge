public class Switch {
    public static void main(String[] args) {
        char charValue='A';
        switch (charValue)
        {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue+ " was found");
                break;
            default:
                System.out.println("Could not find A,B,C,D or E");
                break;
        }
        String month="January";
        switch (month)
        {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
