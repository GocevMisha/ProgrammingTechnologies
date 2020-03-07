import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem implements Cloneable{
    Date dateOfIncome; // дата производства
    short expires; // срок годности

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
