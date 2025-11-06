// ✅ Program 2: Food Delivery Order Tracking
// Classes:
// Order (parent)
// fields: orderId, orderAmount
// method: generateBill()
// ZomatoOrder (child)
// delivery charge: 30
// overrides generateBill()
// SwiggyOrder (child)
// delivery charge: 20
// overrides generateBill()
// ✅ Demonstrate run-time polymorphism using array of parent type.

class Order{
    String orderId;
    double orderAmount;
    
    Order(String orderId, double orderAmount){
        this.orderId=orderId;
        this.orderAmount=orderAmount;
    }
    void generateBill(){
        System.out.println("OrderId :"+orderId);
        System.out.println("OrderAmount :"+orderAmount);
    }
}
class ZomatoOrder extends Order{
    int deliveryCharge;
    ZomatoOrder(String orderId,double orderAmount,int deliveryCharge){
        super(orderId,orderAmount);
        this.deliveryCharge=deliveryCharge;
    }
    @Override
    void generateBill(){
        super.generateBill();
        System.out.println("Delivery Charge :"+deliveryCharge);
        System.out.println("Total Amount:"+(orderAmount+deliveryCharge));
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
class SwiggiOrder extends Order{
    int deliveryCharge;
    SwiggiOrder(String orderId,double orderAmount,int deliveryCharge){
        super(orderId,orderAmount);
        this.deliveryCharge=deliveryCharge;
    }
    @Override
    void generateBill(){
        super.generateBill();
        System.out.println("SwiggiOrder deiliveryCharge: "+deliveryCharge);
        System.out.println("Total Amount: "+(orderAmount+deliveryCharge));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
class FoodDeliveryOrderTraking{
    public static void main(String []args){
       Order[] orders={
           new ZomatoOrder("A1",500.0,30),
           new SwiggiOrder("A2",550.0,20)
       };
       for(Order o:orders){
           o.generateBill();
       }
    }
}