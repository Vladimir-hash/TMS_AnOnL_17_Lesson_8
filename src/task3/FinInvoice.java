package task3;


import java.util.Date;

//3) Финансовая накладная
//Содержит поля:
//        - Итоговая сумма за месяц
//   - Дата документа
//   - Номер документа
//   - Код департамента
public class FinInvoice extends Document{
    int perMonthValue;
    String departmentCode;
    public FinInvoice(int perMonthValue, Date documentData, int documentNum, String departmentCode) {
        super(documentNum,  documentData);
        this.departmentCode = departmentCode;
        this.perMonthValue = perMonthValue;
    }
    public FinInvoice() {
        this(0, new Date(), 212, "Unknown date");

    }
    public int getDocNumber() {
        return documentNum;
    }

    public Date getDate() {
        return documentData;
    }

}
