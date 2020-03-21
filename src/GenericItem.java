import java.util.Objects;

public class GenericItem implements Cloneable {
    public int ID; // ID товара
    public String name; // Наименование товара
    public float price; //Цена товара
    public Category category;
    public GenericItem analog;
    static int currentID;
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, category: %s \n",ID,name,price, category);
    }
    public GenericItem(){
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        if(analog == null ) return super.clone();
        else return analog.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return ID == that.ID &&
                Float.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name) &&
                category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price, category, analog);
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
