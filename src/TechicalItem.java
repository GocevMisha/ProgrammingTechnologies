import java.util.Objects;

public class TechicalItem extends GenericItem implements Cloneable{
    short warrantyTime; // гарантийный срок (суток)

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
    public String toString() {
        return "TechicalItem{" +
                "warrantyTime=" + warrantyTime +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
