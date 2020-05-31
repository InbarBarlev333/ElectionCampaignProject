package USER;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Set;


import model.UserRepository;

import model.campaign_manager;
import model.city_headquarter_manager;
import model.members_of_the_party;
import model.technical_support;
import model.telephone_receptionist;
import model.volunteers;

public class main {
    public static void main(String[] args) throws Exception {

        int Type_Of_User ;
        System.out.println("Welcome:)");
        System.out.println(" what type of user would you like to add?\n" + "1.campaign manager\n" +"2.city's headquarter manager\n" + "3.members of the party\n"
                + "4.technical support\n" +"5.telephone receptionist\n"  +"6.volunteers\n" );
        Scanner scanner = new Scanner(System.in);
        Type_Of_User=scanner.nextInt();


        switch (Type_Of_User) {
            case 1:
                UserRepository userRepository1 = new campaign_manager();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();

                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            System.out.print("Write your Email: ");
                            String email= scanner.nextLine();
                            System.out.print("Write your name_of_party: ");
                            String name_of_party= scanner.nextLine();
                            userRepository1.add(User.campaign_manager);
                            break;
                        case "2":
                            Set<User> users = userRepository1.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }


                    break;}
            case 2:
                UserRepository  userRepository2  = new city_headquarter_manager();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();
                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            userRepository2.confirm( User.city_headquarter_manager);
                            break;
                        case "2":
                            Set<User> users = userRepository2.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }


                    break;}
            case 3:
                UserRepository userRepository3 = new members_of_the_party();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();
                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            System.out.print("Write your Email: ");
                            String email= scanner.nextLine();
                            System.out.print("Write your name_of_party: ");
                            String name_of_party= scanner.nextLine();
                            userRepository3.confirm(User.members_of_the_party);
                            break;
                        case "2":
                            Set<User> users = userRepository3.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }

                    break;}
            case 4:
                UserRepository userRepository4 = new technical_support();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();
                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            System.out.print("Write your Email: ");
                            String email= scanner.nextLine();
                            System.out.print("Write your name_of_party: ");
                            String name_of_party= scanner.nextLine();
                            userRepository4.confirm(User.technical_support);
                            break;
                        case "2":
                            Set<User> users = userRepository4.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }

                    break;}
            case 5:
                UserRepository userRepository5 = new telephone_receptionist();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();
                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            System.out.print("Write your Email: ");
                            String email= scanner.nextLine();
                            System.out.print("Write your name_of_party: ");
                            String name_of_party= scanner.nextLine();
                            userRepository5.confirm(User.telephone_receptionist);
                            break;
                        case "2":
                            Set<User> users = userRepository5.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }

                    break;}
            case 6:
                UserRepository userRepository6 =new volunteers ();
                while (true) {
                    System.out.println("Welcome:)");
                    System.out.println(" Add new user");
                    System.out.println("Q. Exit");

                    String selectedOption = scanner.nextLine();
                    switch (selectedOption) {
                        case "1":
                            System.out.print("Write your id (number): ");
                            String id = scanner.nextLine();
                            System.out.print("Write your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Write your password: ");
                            String password= scanner.nextLine();
                            System.out.print("Write your Email: ");
                            String email= scanner.nextLine();
                            System.out.print("Write your name_of_party: ");
                            String name_of_party= scanner.nextLine();
                            userRepository6.confirm(User.volunteers);
                            break;
                        case "2":
                            Set<User> users = userRepository6.findAll();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        case "Q":
                        case "q":
                        default:
                            System.out.println("Goodbye ");
                            System.exit(0);
                    }

                    break;}


                System.out.println(" Add new user");
                System.out.println("Q. Exit");


        }
    }

}
