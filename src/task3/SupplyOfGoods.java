package task3;

import java.util.Date;

public class SupplyOfGoods extends Document{
    public String typeOfGoods;
    public int valueOfGoods;
    public SupplyOfGoods(int documentNum,String typeOfGoods, int valueOfGoods, Date documentData) {
        super(documentNum, documentData);
        this.typeOfGoods = typeOfGoods;
        this.valueOfGoods = valueOfGoods;
    }
    public SupplyOfGoods() {
        this(521, "Unknown goods", 2300, new Date());
    }
    public int getDocNumber() {
        return documentNum;
    }

    public Date getDate() {
        return documentData;
    }
}

