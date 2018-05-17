//Guess the letter game, 4th version.

class DWDemo {
    public static void main( String args[]) 
        throws java.io.IOException {
        
        char ch, ignore, answer = 'k';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it: ");

            // read a character
            ch = (char) System.in.read();
            //System.out.println("before 2nd do-while");
            //System.out.println("ch: " + ch);
            
            do {
                //System.out.println("inside 2nd do-while");
                ignore = (char) System.in.read();
                //System.out.println("ignore: " + ignore);
            } while(ignore != '\n');
            
            //System.out.println("after 2nd do-while");

            if(ch == answer) System.out.println("*** Right ***");
            else {
                System.out.print("... Sorry, you are ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("\n");
            }
        } while(answer != ch);       
    }
}