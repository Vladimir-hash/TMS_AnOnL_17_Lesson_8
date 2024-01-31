package task3;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Register register = new Register();
            EmployeesContract contract1 = new EmployeesContract(52, new Date(2022, 10, 10), new Date(2019, 9, 3), "Vladimir");

            FinInvoice invoice1 = new FinInvoice(2600, new Date(2018, 9, 9), 1522, "D001");

            SupplyOfGoods supply1 = new SupplyOfGoods( 22, "Electronics", 2121, new Date(2019, 9, 3));

            System.out.println(register.getInfo(contract1));
            System.out.println(register.getInfo(invoice1));
            System.out.println(register.getInfo(supply1));
        }
    }

