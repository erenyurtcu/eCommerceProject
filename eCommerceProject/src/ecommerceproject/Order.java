package ecommerceproject;

import java.util.Date;

public class Order{
    
    private User orderer;
    private Product orderedProduct;
    private CreditCard usedCreditCard;
    private int orderedAmount;
    private Test testOrder;

    public Order(User orderer, Product orderedProduct, CreditCard usedCreditCard, int orderedAmount, Test  testOrder){
        this.orderer = orderer;
        this.orderedProduct = orderedProduct;
        this.usedCreditCard = usedCreditCard;
        this.orderedAmount = orderedAmount;
        this.testOrder =  testOrder;
        orderProduct();
    }
    
    // if the the amount to be ordered is more than the stock amount, this is not allowed
    public boolean checkProductStockInformation(){
        if(orderedProduct.getProductStockInformation() < this.orderedAmount)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void orderProduct(){
        if (this.orderedAmount <= 0)
        {
            System.out.println("USER @" + this.orderer.getUsername() + " HAS ENTERED INVALID AMOUNT NUMBER.");
            System.out.println("---------------------------------------------------------");
        }
        else if(!(checkProductStockInformation())){
            System.out.println("USER @" + this.orderer.getUsername() + " HAS ENTERED AMOUNT NUMBER GREATER THAN STOCK FOR PRODUCT |" + this.orderedProduct.getProductName().toUpperCase() + "|.");
            System.out.println("---------------------------------------------------------");
        }
        else if(checkProductStockInformation())
        {
            this.orderer.buyProduct(orderedProduct,orderedAmount);
            this.testOrder.checkBuyProduct(orderedProduct.getProductName(), this.orderer, this.orderedAmount,
                    this.orderedProduct.getProductStockInformation() + orderedAmount,this.orderedProduct.getProductStockInformation(), 
                    Integer.toString(usedCreditCard.getCardNumber()).substring(Integer.toString(usedCreditCard.getCardNumber()).length() - 4,Integer.toString(usedCreditCard.getCardNumber()).length()));
        }
    }

}
