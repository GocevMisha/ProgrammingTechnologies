package billing.stocklist;

import java.util.Objects;

public class TechicalItem extends GenericItem implements Cloneable{
    private short warrantyTime; // гарантийный срок (суток)

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Extra options: warrantyTime: " + warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TechicalItem that = (TechicalItem) o;
        return warrantyTime == that.warrantyTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), warrantyTime);
    }

    @Override
    public String toString() {
        return "billing.stocklist.TechicalItem{" +
                "warrantyTime=" + warrantyTime +
                ", ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", category=" + getCategory() +
                '}';
    }
}
