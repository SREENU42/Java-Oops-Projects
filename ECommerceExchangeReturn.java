// ✅ Program 5: E-commerce Return / Exchange System
// Classes:
// Request (parent)
// field: productName
// method: processRequest()
// ReturnRequest (child)
// reason: "defective"
// overrides processRequest()
// ExchangeRequest (child)
// newSize: L or XL
// overrides processRequest()
// ✅ Use reference of Request but object of child → polymorphism.

class Request{
    String productName;
    Request(String productName){
        this.productName=productName;
    }
    void processRequest(){
        System.out.println("Product Name:"+productName);
    }
}
class ReturnRequest extends Request{
    ReturnRequest(String productName){
        super(productName);
    }
    @Override 
    void processRequest(){
        System.out.println("Return Request for :"+productName);
        System.out.println("Reason:Product is Defective");
    }
}
class ExchangeRequest extends Request{
    String newSize;
    ExchangeRequest(String productName,String newSize){
        super(productName);
        this.newSize=newSize;
    }
    @Override
    void processRequest(){
        System.out.println("Exchange Request for:"+productName);
        System.out.println("New Size :"+newSize);
    }
}
class ECommerceExchangeReturn{
    public static void main(String []args){
        Request r1=new ReturnRequest("Shoes");
        Request r2=new ExchangeRequest("T-shirt","Xl");
        r1.processRequest();
        System.out.println(----------------------);
        r2.processRequest();
    }
}