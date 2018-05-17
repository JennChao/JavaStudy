/*
    Call this program SwitchDemo.
    This program is used to understand how switch works in java.

*/

class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for (i=1; i<=5; i++) {
            switch(i) {
                case 1:
                case 2:
                case 3: System.out.println("i is 1, 2, or 3.");
                    break;
                case 4: 
                    System.out.println("i is 4");
                    break;
                default:
                    System.out.println("i is 5, default case.");
            }

        }
    }
}