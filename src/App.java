import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee>  employees = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            sc.nextLine();
            Double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                sc.nextLine();
                Double addtionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,addtionalCharge);
                employees.add(employee);
            }
            else{
                Employee employee = new Employee(name, hours, valuePerHour );
                employees.add(employee);
            }
        }   
        
        System.out.println("PAYMENTS: ");
        for(Employee emp : employees){
            System.out.println(emp);
        }

        }

    }

