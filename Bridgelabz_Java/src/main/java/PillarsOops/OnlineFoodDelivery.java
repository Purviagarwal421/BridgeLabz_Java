package PillarsOops;

/*
Description: Create an online food delivery system:
- Define an abstract class FoodItem with fields like itemName, price, and quantity.
- Add abstract methods calculateTotalPrice() and a concrete method getItemDetails().
- Create subclasses VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges for non-veg items.
- Implement an interface Discountable with methods applyDiscount() and getDiscountDetails().
- Use encapsulation to restrict modifications to order details.
- Demonstrate polymorphism to process different food items in a single order.
*/

import java.util.ArrayList;

interface Discountable {
    double applyDiscount();

    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "Vegetarian item discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity,
                      double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-vegetarian item discount: 5%";
    }
}

public class OnlineFoodDelivery {
    public static void processOrder(ArrayList<FoodItem> items) {
        double orderTotal = 0;

        for (FoodItem item : items) {
            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();

                System.out.println(
                        discountable.getDiscountDetails());
                System.out.println("Discount: " + discount);
            }

            double finalPrice = totalPrice - discount;
            orderTotal += finalPrice;

            System.out.println("Final Item Price: " + finalPrice);
            System.out.println("----------------------");
        }

        System.out.println("Final Order Total: " + orderTotal);
    }

    public static void main(String[] args) {
        ArrayList<FoodItem> items = new ArrayList<>();

        items.add(new VegItem("Paneer Pizza", 250, 2));
        items.add(new NonVegItem("Chicken Burger", 180, 2, 30));

        processOrder(items);
    }
}