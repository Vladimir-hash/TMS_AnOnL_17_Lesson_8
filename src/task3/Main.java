package task3;


import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Register register = new Register();

            Document  contract1 = new EmployeesContract(52, new Date(2022, 10, 10), new Date(2019, 9, 3), "Vladimir");

            Document invoice1 = new FinInvoice(2600, new Date(2018, 9, 9), 1522, "D001");

            Document supply1 = new SupplyOfGoods( 22, "Electronics", 2121, new Date(2019, 9, 3));

        register.getDocumentProps(contract1);
        register.getDocumentProps(invoice1);
        register.getDocumentProps(supply1);

        register.saveDocument(52);
        register.saveDocument(222600); // don't show
        register.saveDocument(22);

        register.displayAllDocuments();
        }
    }

