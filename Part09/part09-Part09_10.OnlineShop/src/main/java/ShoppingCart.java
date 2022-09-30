import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  private Map<String, Item> shoppingCart;
  public ShoppingCart(){
    this.shoppingCart= new HashMap<>();
  }
  public void add(String product, int price) {
    if (shoppingCart.containsKey(product)) {
      Item newItem = shoppingCart.get(product);
      newItem.increaseQuantity();
      shoppingCart.put(product, newItem);
    } else {
      shoppingCart.put(product, new Item(product, 1, price));
    }

  }
  public int price(){
    int totalPrice=0;
    for(Item item: shoppingCart.values())
      totalPrice+= item.price();
    return totalPrice;
  }
  public void print() {
    for (Item item : shoppingCart.values()) {
      System.out.println(item);
    }
  }
}
