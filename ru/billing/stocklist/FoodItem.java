package billing.stocklist;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem implements Cloneable{
    private Date dateOfIncome; // дата производства
    private short expires; // срок годности

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public FoodItem(String name, float price, FoodItem analog, Date
            date, short expires){
        this.setName(name);
        this.setPrice(price);
        this.setAnalog(analog);
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
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires, getAnalog());
    }

    @Override
    public String toString() {
        return "billing.stocklist.FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                ", ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", category=" + getCategory() +
                '}';
    }
}
