package view;

import controller.SupporterController;

import java.io.IOException;
import java.util.Scanner;

public class SupporterView {

    private SupporterController supportercontroller;

    public SupporterView() throws IOException, ClassNotFoundException {
        supportercontroller = new SupporterController();
    }

    public static void main(String[] args) throws Exception {
        SupporterView welcomeHit = new SupporterView();
        welcomeHit.Supporterscliimpl();
    }


    public void Supporterscliimpl() throws Exception {
        System.out.println("Welcome to Supporter's managing page");
        System.out.println("Options:");
        System.out.println("1.Show all suppoters");
        System.out.println("2.Add new supporter");
        System.out.println("3.Delete supporter");
        System.out.println("4.Find supporter");
        System.out.println("5.Edit supporter");
        System.out.println("6.back to menu");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine() ){
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    this.showsupporter();
                    break;
                case "2":
                    this.addsupporter();
                    break;
                case "3":
                    this.deletesupporter();
                    break;
                case "4":
                    this.findsupporter();
                    break;
                case "5":
                    this.editsupporter();
                    break;
                case "6":
                    ProgramView view1=new ProgramView();
                    view1.WelcomeProgram();
                    break;
                case "q":
                case "Q":
                default:
                    ProgramView view12=new ProgramView();
                    view12.WelcomeProgram();


                    scanner.close();

            }
        }


    }


    public void addsupporter(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter supporter's name:");
            String name = scanner.nextLine();
            System.out.println("Enter supporter's city");
            String city = scanner.nextLine();
            System.out.println("Enter supporter's telephone");
            String Telephone = scanner.nextLine();
            supportercontroller.addSupoorter(name, city, Telephone);
            System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
            String what = scanner.nextLine();
            if(what.equals("yes")) {
                Supporterscliimpl();
            }
            else
            {
                addsupporter();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void showsupporter() throws Exception {
        supportercontroller.showSupporter();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
        String what = scanner.nextLine();
        if(what.equals("yes")) {
            Supporterscliimpl();
        }
        else
        {
            showsupporter();
        }
    }

    public void deletesupporter() throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter supporter's id:");
            int supporterid = Integer.parseInt(scanner.nextLine());
            supportercontroller.deletesupporter(supporterid);
            System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
            String what = scanner.nextLine();
            if(what.equals("yes")) {
                Supporterscliimpl();
            }
            else
            {
                deletesupporter();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void findsupporter() throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1.find by city? ");
            System.out.println("2.find by name?");
            System.out.println("3.find by telephone?");
            System.out.println("4.come back to supporter's menu");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("Enter the city please ");
                    String city = scanner.nextLine();
                    supportercontroller.findsupporter(command,city);
                    break;
                case "2":
                    System.out.println("Enter the name please");
                    String name = scanner.nextLine();
                    supportercontroller.findsupporter(command,name);
                    break;
                case "3":
                    System.out.println("Enter the telephone please");
                    String telephone = scanner.nextLine();
                    supportercontroller.findsupporter(command,telephone);
                    break;
                case  "5":
                    Supporterscliimpl();
                default:
                    Supporterscliimpl();
            }
            System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
            String what = scanner.nextLine();
            if(what.equals("yes")) {
                Supporterscliimpl() ;
            }
            else
            {
                findsupporter();
            }

        }
    }


    public void editsupporter() throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1.edit by city? ");
            System.out.println("2.edit by name?");
            System.out.println("3.edit by telephone?");
            System.out.println("4.come back to supporter's menu");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("Enter supporters id please ");
                    int idcity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter supporters new city please ");
                    String newcity = scanner.nextLine();
                    supportercontroller.editsupporter(command, idcity, newcity);
                    System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
                    String what = scanner.nextLine();
                    if(what.equals("yes")) {
                        Supporterscliimpl();
                    }
                    else
                    {
                        editsupporter();
                    }
                case "2":
                    System.out.println("Enter supporters id please ");
                    int idname = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter supporters new name please ");
                    String newname = scanner.nextLine();
                    supportercontroller.editsupporter(command, idname, newname);
                    System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
                    String what1 = scanner.nextLine();
                    if(what1.equals("yes")) {
                         Supporterscliimpl();
                    }
                    else
                    {
                        editsupporter();
                    }
                case "3":
                    System.out.println("Enter supporters id please ");
                    int idtelephone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter supporters new telephone please ");
                    String newtelephone = scanner.nextLine();
                    supportercontroller.editsupporter(command, idtelephone, newtelephone);
                    System.out.println("Want to return to Supporters menu ? yes/no" + " yes- return no-repeat this action");
                    String what2 = scanner.nextLine();
                    if(what2.equals("yes")) {
                       Supporterscliimpl();
                    }
                    else
                    {
                       editsupporter();
                    }
                case "4":
                    Supporterscliimpl();
                default:
                    Supporterscliimpl();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
