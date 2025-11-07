// 5️⃣ Product Inventory System
// Task: Create a Product class for e-commerce inventory.
// Requirements:
// Private fields: productId (int), name (String), price (double), quantity (int)
// Getters for all fields, setters for price and quantity only
// Validation: price > 0, quantity >= 0
// Method: purchase(int qty) decreases quantity, cannot go below 0
// Method: restock(int qty) increases quantity

class Product{
    private int productId;
    private String name;
    private double price;
    private int quantity;
    
    Product( int productId, String name,double price,int quantity){
        this.productId=productId;
        this.name=name;
        
            if(price>0){
                this.price=price;
                }else{
                    System.out.println("price on progress;");
                }
            if(quantity>0){
            this.quantity=quantity;
            }else{
                System.out.println("❌ Quantity cannot be negative! Setting quantity to 0.");
                this.quantity=0;
            }
    }
    
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public void setPrice(double price){
        if(price>0){
         this.price=price;   
        }else{
            System.out.println("Price Must be greater than 0");
        }
    }
    public void setQuantity(int quantity){
        if(quantity>=0){
            this.quantity=quantity;
        }else{
            System.out.println("Quantity cannot be negative");
        }
    }
    public void purchase(int qty){
       if(qty>0&&qty<=quantity){
           quantity-=qty;
           System.out.println("Purchased:"+qty+"Remaining Quantity:"+quantity);
       } else{
           System.out.println("You cant't purchase now");
       }
       
    }
    public void restock(int qty){
        if(qty>0){
            quantity+=qty;
            System.out.println("Restocked " + qty + " item(s). Updated quantity: " + quantity);
        }else{
            System.out.println("restock must be positive....");
        }
    }
    public void displayProductDetails(){
        System.out.println("============ProductDetails==========");
        System.out.println("ProductId:"+productId);
        System.out.println("ProductName:"+name);
        System.out.println("Product Price:"+price);
        System.out.println("ProductQuantity:"+quantity);
        System.out.println("======================================");
    }
}
class ProductInventorySystem{
    public static void main (String[] args) {
        Product p=new Product(22,"Vasline",10.0,9);
        p.displayProductDetails();
        
        p.purchase(3);
        p.purchase(8);

        p.restock(5);

        p.setPrice(-100);
        p.setQuantity(-20);

        p.displayProductDetails();
    }
}