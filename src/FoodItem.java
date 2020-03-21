import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem implements Cloneable{
    Date dateOfIncome; // дата производства
    short expires; // срок годности
    public FoodItem analog;
    public FoodItem(String name, float price, FoodItem analog, Date
            date, short expires){
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = date;
        this.expires = expires;
    }
    public FoodItem(String name){
        this(name, 0, null, null, (short) 0);
    }
    public FoodItem(String name, float price, short expires){
        this(name,price,null, null, expires);
    }
    @Override
    void printAll() {
        super.printAll();
        System.out.println("Extra options: dateOfIncome: " + dateOfIncome +", " + expires);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoodItem foodItem = (FoodItem) o;
        return expires == foodItem.expires &&
                Objects.equals(dateOfIncome, foodItem.dateOfIncome);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
