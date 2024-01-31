package task3;

public  class Register {
    int documentProps = 0;
    private final Document[] documents = new Document[10];
    public void   getDocumentProps(Document doc) {
        documents[documentProps] = doc;
        documentProps++;
    }
    public void saveDocument(int documentNum) {
        for (Document doc : documents) {
            if (doc != null && doc.getDocumentProps() == documentNum) {
                System.out.println(doc);
                break;
            }
        }
    }
    public String getInfo(Document document) {
        if (document instanceof EmployeesContract) {
            EmployeesContract temp = (EmployeesContract) document;
            return  "Document number: " + temp.getDocNumber() + ":\n Date: " + temp.getDate() + ". Date of the contract ending: " + temp.contractEnding + ". Employee's name: " + temp.name;
        }
        if (document instanceof FinInvoice) {
            FinInvoice temp = (FinInvoice) document;
            return "Document number: " + temp.getDocNumber() + ": \n Date: " + temp.getDate() + ". Per month value: " + temp.perMonthValue + ". Department code: " + temp.departmentCode;
        }

        if (document instanceof SupplyOfGoods) {
            SupplyOfGoods temp = (SupplyOfGoods) document;
            return "Document number: " + temp.getDocNumber() + ": \n Date: " + temp.getDate() + ". Value of goods: " + temp.valueOfGoods + ". Type of goods: " + temp.typeOfGoods;
        }
        return null;
    }
}
