// A somple example of recursion
class Fractorial {
    // This is a recursive fuction
    int factR(int n) {
        int result = 1;
        if(n==1) return 1;
        System.out.println("With factR method: current n is: " + n);
        System.out.println("With factR method ~before~: current result is: " + result);
        result = factR(n-1) * n;
        System.out.println("With factR method ~after~: current result is: " + result);
        return result;
    }

    // This is an iterative equivalent
    int factI(int n) {
        int t, result;
        result = 1;

        for(t = 1; t <= n; t++) result *= t;
        return result;
    }
}

class Recursion {
    public static void main(String args[]) {
        Fractorial f = new Fractorial();

        System.out.println("Fractional using resursive method.");
        System.out.println("Fractional of 5 is: " + f.factR(5));
        //System.out.println("Fractional of 3 is: " + f.factR(4));
        //System.out.println("Fractional of 3 is: " + f.factR(5));

        System.out.println("\n");

        System.out.println("Fractional using iterative method.");
        System.out.println("Fractional of 3 is: " + f.factI(3));
        //System.out.println("Fractional of 3 is: " + f.factI(4));
        //System.out.println("Fractional of 3 is: " + f.factI(5));
    }
}

// Explanation for Recursion: http://www.flag.com.tw/book/cento-5105.asp?bokno=F2733&id=981

/*

    Fractional using resursive method.
    With factR method: current n is: 5
    With factR method ~before~: current result is: 1
    With factR method: current n is: 4
    With factR method ~before~: current result is: 1
    With factR method: current n is: 3
    With factR method ~before~: current result is: 1
    With factR method: current n is: 2
    With factR method ~before~: current result is: 1
    With factR method ~after~: current result is: 2
    With factR method ~after~: current result is: 6
    With factR method ~after~: current result is: 24
    With factR method ~after~: current result is: 120
    Fractional of 5 is: 120


    Fractional using iterative method.
    Fractional of 3 is: 6

*/
