Program:


import java.util.*;


public class ChoiceLoop1{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choicetoContinueOrNot;


        while (true) {
            System.out.println("Enter a number to Continue OR 100 to exit");
            choicetoContinueOrNot = sc.nextInt();
            if (choicetoContinueOrNot == 100) {
                break;
            }


            int choice;
            do {
                System.out.println("Please Make a Choice : ");
                System.out.println("1> List of All Current Employees");
                System.out.println("2> List of All Retired Employees");
                System.out.println("3> List of All Departments with Names");
                System.out.println("4> Edit Existing Employee Or Dept");
                System.out.println("5> Terminate Employee or Delete Department");
                System.out.println("6> Display the top 3 highest paid Employees with their Salaries");
                System.out.println("7> Employees Joined in the last 2 Years");
                System.out.println("8> Search For the Employees with same name");
                System.out.println("9> List How many Employees work in Each Department");
                System.out.println("10> Salary of the Department Head in a given Department");
                System.out.println("11> Official Location of the Employee");
                System.out.println("12> Display Qualification Details of a given Employee");
                System.out.println("13> Refresh Digital Signature");
                System.out.println("14> Quit");
                System.out.println();
                System.out.print("Enter Your Choice: ");


                choice = sc.nextInt();


                if (choice < 1 || choice > 14) {
                    System.out.println("Invalid Choice. Please choose between 1-14.");
                }


            } while (choice < 1 || choice > 14);


            switch (choice) {
                case 1:
                    System.out.println("Call Function1 (List Current Employees)");
                    // e.listCurEmp(); // Uncomment when 'e' object is defined
                    break;
                case 2:
                    System.out.println("Call Function2 (List Retired Employees)");
                    break;
                case 3:
                    System.out.println("Call Function3 (List Departments)");
                    break;
                case 4:
                    System.out.println("Call Function4 (Edit Employee/Dept)");
                    break;
                case 5:
                    System.out.println("Terminate Employee/Delete Department");
                    break;
                case 6:
                    System.out.println("Display Top 3 Salaries");
                    break;
                case 7:
                    System.out.println("Employees Joined in Last 2 Years");
                    break;
                case 8:
                    System.out.println("Search Employees with Same Name");
                    break;
                case 9:
                    System.out.println("Employees Count per Department");
                    break;
                case 10:
                    System.out.println("Salary of Department Head");
                    break;
                case 11:
                    System.out.println("Official Location of Employee");
                    break;
                case 12:
                    System.out.println("Qualification Details of Employee");
                    break;
                case 13:
                    System.out.println("Refresh Digital Signature");
                    break;
                case 14:
                    System.out.println("Exiting Menu...");
                    break;
            }


            System.out.println("The Program Ends Over Here----------");
        }


        System.out.println("Exited Successfully. Goodbye!");
        sc.close();
    }
}


Output:


Enter a number to Continue OR 100 to exit
1
Please Make a Choice : 
1> List of All Current Employees
2> List of All Retired Employees
3> List of All Departments with Names
4> Edit Existing Employee Or Dept
5> Terminate Employee or Delete Department
6> Display the top 3 highest paid Employees with their Salaries
7> Employees Joined in the last 2 Years
8> Search For the Employees with same name
9> List How many Employees work in Each Department
10> Salary of the Department Head in a given Department
11> Official Location of the Employee
12> Display Qualification Details of a given Employee
13> Refresh Digital Signature
14> Quit


Enter Your Choice: 2
Call Function2 (List Retired Employees)
The Program Ends Over Here----------
Enter a number to Continue OR 100 to exit
4
Please Make a Choice : 
1> List of All Current Employees
2> List of All Retired Employees
3> List of All Departments with Names
4> Edit Existing Employee Or Dept
5> Terminate Employee or Delete Department
6> Display the top 3 highest paid Employees with their Salaries
7> Employees Joined in the last 2 Years
8> Search For the Employees with same name
9> List How many Employees work in Each Department
10> Salary of the Department Head in a given Department
11> Official Location of the Employee
12> Display Qualification Details of a given Employee
13> Refresh Digital Signature
14> Quit


Enter Your Choice: 2
Call Function2 (List Retired Employees)
The Program Ends Over Here----------
Enter a number to Continue OR 100 to exit
2
Please Make a Choice : 
1> List of All Current Employees
2> List of All Retired Employees
3> List of All Departments with Names
4> Edit Existing Employee Or Dept
5> Terminate Employee or Delete Department
6> Display the top 3 highest paid Employees with their Salaries
7> Employees Joined in the last 2 Years
8> Search For the Employees with same name
9> List How many Employees work in Each Department
10> Salary of the Department Head in a given Department
11> Official Location of the Employee
12> Display Qualification Details of a given Employee
13> Refresh Digital Signature
14> Quit


Enter Your Choice: 5
Terminate Employee/Delete Department
The Program Ends Over Here----------