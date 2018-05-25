/*
    Try This 5-2
    A queue class for characters.
*/

class Queue {
    // these members are now private
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // the parameterized constructor
    Queue (int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into a queue
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    // get a character from a queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}


// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store alphabet.");

        // put some numbers into bigQ
        for(i=0; i<26; i++)
            bigQ.put((char) ('A' + i));

        // retrive and display elements from bigQ
        System.out.print("Content of bigQ: ");
        for (i=0; i<26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate erros.");
        // Now, use smallQ to generate some errors
        for(i=0; i<5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }

        // System.out.println("See the access modifier error: ");
        // Queue test = new Queue(10);

        // System.out.println("New try to do this: test.q[0] = 99;");
        // test.q[0] = 99;
    }
}

/*

    Jennifers-MacBook-Pro:Ch6 jenniferchao$ javac Queue.java 
    Queue.java:80: error: q has private access in Queue
        test.q[0] = 99;
            ^
    1 error

*/


/*
    Now the following statements are illegal!

    Queue test = new Queue(10);

    test.q[0] = 99; // wrong!
    test.putloc = -100; // this won't work!
*/
