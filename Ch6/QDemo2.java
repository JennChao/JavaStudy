/*
    Try This 6-2
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

    // Construct a Queue from a Queue.
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copy elements
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Construct a Queue with initial values.
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
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

    // method elementNum() was added by myself to get the length of queue
    int elementNum(Queue ob) {
        return ob.q.length;
    }
}


// Demonstrate the Queue class.
class QDemo2 {
    public static void main(String args[]) {
        // constrauct 10-element empty array
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // construct queue from array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // put some characters into q1
        for(i = 0; i < q1.elementNum(q1); i++)
            q1.put((char) ('A' + i));

        // construct queue from another queue (object)
        Queue q3 = new Queue(q1);

        // show the queues
        System.out.print("Contents of q1: ");
        for(i = 0; i < q1.elementNum(q1); i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i = 0; i < q2.elementNum(q2); i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i = 0; i < q3.elementNum(q3); i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println("\n");

    }
}

