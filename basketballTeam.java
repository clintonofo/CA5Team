import java.util.ArrayList;
import java.util.Scanner;
public class basketballTeam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        do {
            System.out.println("Main Menu\n");
            System.out.print("1.) Display All Elements \n");
            System.out.print("2.) Display All Ele.\n");
            System.out.print("3.) Multiplication.\n");
            System.out.print("4.) Division.\n");
            System.out.print("5.) Generate Random Number.\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();


        }

        while (choice > 7);

        switch (choice) {
            case 1:
                ArrayList<team> team = new ArrayList<team>();

                // Initialize an ArrayList with add()
               team.add(new team("John","moons",15000,"ben","sam,","atlanta"));
                team.add(new team("Eoin","rockets",25000,"john","oliver,","san fracnsio"));
                team.add(new team("liam","spices",35000,"ben","sam,","philly"));
                team.add(new team("clinton","ice",5000,"rita","sammy,","la"));
                team.add(new team("allen","lakers",15000,"luke","sam,","la"));
                team.add(new team("barry","warriors",25000,"benson","jamal,","golden state"));
                team.add(new team("lia","clippers",65000,"ella","rio,","charlotte"));
                team.add(new team("rhia","zooms",15000,"lia","clinton,","cleveland"));
                team.add(new team("clinton","heat",10000,"elsa","ronaldo,","chicagi"));
                team.add(new team("demar","raptors",20000,"leon","samuel,","toronto"));

                for(team t: team) {
                    System.out.println(t);  // Will invoke overrided `toString()` method
                }
            case 2:

                };











        }
    }
