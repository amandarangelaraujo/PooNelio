import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.OutsourcedEmployee;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of emmployees");
        int n = sc.nextInt();
       
        List<Employee> lista = new ArrayList<>();

        for (int i = 1; i<=n; i++){
            System.out.print("Outsourced y/n?");
            char Outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(Outsourced == 'n'){
                lista.add(new Employee(name, hour, valuePerHour));
            }
            else{
                System.out.println("adicional charge: ");
                double adicionalCharge = sc.nextDouble();
                lista.add(new OutsourcedEmployee(name, hour, valuePerHour, adicionalCharge));
            }
        }

        System.out.println("PAYMENTS");
        for(Employee c: lista){
            System.out.println(c.getName()+" - $ "+c.payment());
        }
        sc.close();
    }
}
