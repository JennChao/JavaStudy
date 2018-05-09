/*
    Try This 3-3
*/

class Help3 {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;

        for(; ;) {
            do {
                System.out.println("Help on:");
                System.out.println("    1. if");
                System.out.println("    2. switch");
                System.out.println("    3. for");
                System.out.println("    4. while");
                System.out.println("    5. do-while");
                System.out.println("    6. break");
                System.out.println("    7. continue\n");
                System.out.print("Choose one (q to quit): ");

                //choice = (char) System.in.readline();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while( choice < '1' | choice > '7' & choice != 'q' );
            
            if(choice == 'q') break;

            System.out.println('\n');

            switch (choice) {
                case '1':
                    System.out.println("Want to see 'if'");
                    break;
                case '2':
                    System.out.println("Want to see 'switch'");
                    break;
                case '3':
                    System.out.println("Want to see 'for'");
                    break;
                case '4':
                    System.out.println("Want to see 'while'");
                    break;
                case '5':
                    System.out.println("Want to see 'do-while'");
                    break;
                case '6':
                    System.out.println("Want to see 'break'");
                    break;
                case '7':
                    System.out.println("Want to see 'continue'");
                    break;
            }
            System.out.println();
        }
    }
}