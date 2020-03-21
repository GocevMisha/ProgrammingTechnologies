import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem genericItemOne = new GenericItem();
        genericItemOne.ID = 1;
        genericItemOne.name = "first";
        genericItemOne.price = 1.1F;
        genericItemOne.category = Category.DRESS;
        genericItemOne.printAll();
        GenericItem genericItemTwo = new GenericItem();
        genericItemTwo.ID = 2;
        genericItemTwo.name = "second";
        genericItemTwo.price = 2.2F;
        genericItemTwo.category = Category.FOOD;
        genericItemTwo.printAll();
        GenericItem genericItemThree = new GenericItem();
        genericItemThree.ID = 3;
        genericItemThree.name = "third";
        genericItemThree.price = 3.3F;
        genericItemThree.category = Category.GENERAL;
        genericItemThree.printAll();
        FoodItem foodItem = new FoodItem("food");
        foodItem.ID = 4;
        foodItem.price = 4.4f;
        foodItem.category = Category.FOOD;
        foodItem.dateOfIncome = new Date();
        foodItem.expires = 4;
        TechicalItem techicalItem= new TechicalItem();
        techicalItem.ID = 5;
        techicalItem.name = "techical";
        techicalItem.price = 5.5f;
        techicalItem.category = Category.DRESS;
        techicalItem.warrantyTime = 3;
        GenericItem [] mas = {foodItem, techicalItem};
        for(GenericItem item: mas){
            item.printAll();
        }
        FoodItem foodItemTwo = new FoodItem("foodTwo");
        foodItemTwo.ID = 6;
        foodItemTwo.price = 6.6f;
        foodItemTwo.category = Category.FOOD;
        foodItemTwo.dateOfIncome = new Date();
        foodItemTwo.expires = 6;
        System.out.println(foodItem.equals(foodItemTwo));
        FoodItem foodItemThree = (FoodItem) foodItem.clone();
        System.out.println(foodItem.equals(foodItemThree));
        System.out.println(foodItemThree.toString());

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem foodItemStringer = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItemStringer.printAll();
    }
}
