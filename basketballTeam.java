import java.util.*;

public class basketballTeam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        do {
            System.out.println("Main Menu\n");
            System.out.print("1.) Display All Elements \n");
            System.out.print("2.) Choose key\n");
            System.out.print("3.) Multiplication.\n");
            System.out.print("4.) Division.\n");
            System.out.print("5.) Generate Random Number.\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();


        }

        while (choice > 7);
        if (choice == 1) {

            ArrayList<team> team = new ArrayList<team>();

            // Initialize an ArrayList with add()
            team.add(new team("John", "moons", 15000, "ben", "sam,", "atlanta"));
            team.add(new team("Eoin", "rockets", 25000, "john", "oliver,", "san fracnsio"));
            team.add(new team("liam", "spices", 35000, "ben", "sam,", "philly"));
            team.add(new team("clinton", "ice", 5000, "rita", "sammy,", "la"));
            team.add(new team("allen", "lakers", 15000, "luke", "sam,", "la"));
            team.add(new team("barry", "warriors", 25000, "benson", "jamal,", "golden state"));
            team.add(new team("lia", "clippers", 65000, "ella", "rio,", "charlotte"));
            team.add(new team("rhia", "zooms", 15000, "lia", "clinton,", "cleveland"));
            team.add(new team("clinton", "heat", 10000, "elsa", "ronaldo,", "chicagi"));
            team.add(new team("demar", "raptors", 20000, "leon", "samuel,", "toronto"));

            for (team t : team) {
                System.out.println(t);  // Will invoke overrided `toString()` method
            }
        } else if (choice == 2) {
            HashMap<String, team> bballTeam = new HashMap<String, team>();
            team t1 = new team("John", "moons", 15000, "ben", "sam,", "atlanta");
            team t2 = new team("Eoin", "rockets", 25000, "john", "oliver,", "san fracnsio");
            team t3 = new team("liam", "spices", 35000, "ben", "sam,", "philly");
            team t4 = new team("clinton", "ice", 5000, "rita", "sammy,", "la");
            team t5 = new team("allen", "lakers", 15000, "luke", "sam,", "la");
            team t6 = new team("barry", "warriors", 25000, "benson", "jamal,", "golden state");
            team t7 = new team("lia", "clippers", 65000, "ella", "rio,", "charlotte");
            team t8 = new team("rhia", "zooms", 15000, "lia", "clinton,", "cleveland");
            team t9 = new team("clinton", "heat", 10000, "elsa", "ronaldo,", "chicagi");
            team t10 = new team("demar", "raptors", 20000, "leon", "samuel,", "toronto");


            // Add keys and values (Country, City)
            bballTeam.put(t1.getPlayerName(), t1);
            bballTeam.put(t2.getPlayerName(), t2);
            bballTeam.put(t3.getPlayerName(), t3);
            bballTeam.put(t4.getPlayerName(), t4);
            bballTeam.put(t5.getPlayerName(), t5);
            bballTeam.put(t6.getPlayerName(), t6);
            bballTeam.put(t7.getPlayerName(), t7);
            bballTeam.put(t8.getPlayerName(), t8);
            bballTeam.put(t9.getPlayerName(), t9);
            bballTeam.put(t10.getPlayerName(), t10);


            String choice2 = "";
            while (!choice2.equalsIgnoreCase("back")) {
                System.out.println("Choose Key 1 - john");
                System.out.println("Choose Key 2 - eoin");
                System.out.println("Choose Key 3 - liam");
                System.out.println("Choose Key 4 - clinton");
                System.out.println("Choose Key 5 - allen");
                System.out.println("Choose Key 6 - barry");
                System.out.println("Choose Key 7 - lia");
                System.out.println("Choose Key 8 - rhia");
                System.out.println("Choose Key 9 - clinton");
                System.out.println("Choose Key 10 - demar");
                System.out.println("back - back");

                choice2 = input.nextLine();

                if (choice2.equalsIgnoreCase("john")) {

                    System.out.println(bballTeam.get(t1.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("eoin")) {
                    System.out.println(bballTeam.get(t2.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("liam")) {
                    System.out.println(bballTeam.get(t3.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("clinton")) {
                    System.out.println(bballTeam.get(t4.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("allen")) {
                    System.out.println(bballTeam.get(t5.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("barry")) {
                    System.out.println(bballTeam.get(t6.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("lia")) {
                    System.out.println(bballTeam.get(t7.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("rhia")) {
                    System.out.println(bballTeam.get(t8.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("clinton")) {
                    System.out.println(bballTeam.get(t9.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("demar")) {
                    System.out.println(bballTeam.get(t10.getPlayerName()));
                } else if (choice2.equalsIgnoreCase("back")) {
                    break;

                } else {
                    System.out.println("Wrong input");
                }


            }
            ;


        } else if (choice == 3) {
            TreeMap<Long, team> teamMap = new TreeMap<>();
            teamMap.put(200L, new team("John", "moons", 15000, "ben", "sam,", "atlanta"));
            teamMap.put(300L, new team("Eoin", "rockets", 25000, "john", "oliver,", "san fracnsio"));
            teamMap.put(400L, new team("liam", "spices", 35000, "ben", "sam,", "philly"));
            teamMap.put(120L, new team("clinton", "ice", 5000, "rita", "sammy,", "la"));
            teamMap.put(220L, new team("allen", "lakers", 15000, "luke", "sam,", "la"));
            teamMap.put(110L, new team("barry", "warriors", 25000, "benson", "jamal,", "golden state"));
            teamMap.put(209L, new team("lia", "clippers", 65000, "ella", "rio,", "charlotte"));
            teamMap.put(234L, new team("rhia", "zooms", 15000, "lia", "clinton,", "cleveland"));
            teamMap.put(112L, new team("clinton", "heat", 10000, "elsa", "ronaldo,", "chicagi"));
            teamMap.put(609L, new team("demar", "raptors", 20000, "leon", "samuel,", "toronto"));

            System.out.println("TreeMap");
            Set<Long> keySet = teamMap.keySet();

            for (Long TheKey : keySet) {
                team t = teamMap.get(TheKey);
                System.out.println(" Key:  " + TheKey + ", PlayerNsme:  " + t.getPlayerName() + ", teamName :" + t.getTeamName()
                        + ", salary:" + t.getSalary() + ", manager:" + t.getManager() + ", coach:" + t.getCoach() + ", city : " + t.getCity());


            }
        }
    }
}


