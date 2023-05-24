import java.util.Scanner;
import java.io.IOException;
public class grating {

    private static Process exec;
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {{
     try   (Scanner scanner = new Scanner(System.in)) {
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("welcome " + name);
        System.out.println("ok! " +name+ " do you want to play a game 1/2");
         String answer = scanner.nextLine();{
            if (answer.equalsIgnoreCase("yes")){
                System.out.println("great! let's play "+name);
                try {
                    exec = Runtime.getRuntime().exec("java - cp . Anothergame");
                }
            }
            else{
                System.out.println("okay, going back to the first program.");

}
            }
        }

    }
} @Override
    public String toString() {
        return "grating []";
    }
}

   


