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
        FoodItem foodItem = new FoodItem();
        foodItem.ID = 4;
        foodItem.name = "food";
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
        FoodItem foodItemTwo = new FoodItem();
        foodItemTwo.ID = 6;
        foodItemTwo.name = "foodTwo";
        foodItemTwo.price = 6.6f;
        foodItemTwo.category = Category.FOOD;
        foodItemTwo.dateOfIncome = new Date();
        foodItemTwo.expires = 6;
        System.out.println(foodItem.equals(foodItemTwo));
        FoodItem foodItemThree = (FoodItem) foodItem.clone();
        System.out.println(foodItem.equals(foodItemThree));
        System.out.println(foodItemThree.toString());
    }
}
