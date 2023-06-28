package ecommerceproject;

import java.util.Date;

public class Test {
    
    public void userCreated(String nameSurname, String email, String userName, String homeAddress, String workAddress){
        System.out.println("USER |" + nameSurname + "| HAS BEEN CREATED.");
        System.out.println("*********************************************************");
        System.out.println("NAME & SURNAME: " + nameSurname + "\nUSERNAME: " + userName +  "\nE-MAIL: " + email);
        System.out.println("HOME ADDRESS: " + homeAddress.toUpperCase());
        System.out.println("WORK ADDRESS: " + workAddress.toUpperCase());
        System.out.println("---------------------------------------------------------");
    }
    
    public void creditCardCreated(String creditCardNumber, String ownerName, String secCode,Date cardDate){
        System.out.println("CARD NUMBER |**** **** **** " + creditCardNumber  + "| HAS BEEN CREATED.");
        System.out.println("*********************************************************");
        System.out.println("CARD USER: " + ownerName);
        System.out.println("CREDIT CARD NUMBER: **** **** **** " + creditCardNumber);
        System.out.println("CREDIT CARD SECURITY CODE: **" + secCode);
        System.out.println("CREDIT CARD EXPIRATION DATE: " + cardDate.getDate() + "." + cardDate.getMonth() + "." + cardDate.getYear());
        System.out.println("---------------------------------------------------------");
    }
    
    public void productCreated(String productName, String productColor, String productCategory, int productWeight, int productStockInformation){
        System.out.println("PRODUCT |" + productName  + "| HAS BEEN CREATED.");
        System.out.println("*********************************************************");
        System.out.println("PRODUCT NAME: " + productName.toUpperCase());
        System.out.println("PRODUCT COLOR: " + productColor.toUpperCase());
        System.out.println("PRODUCT CATEGORY: " + productCategory.toUpperCase());
        System.out.println("PRODUCT WEIGHT: " + productWeight + " KG");
        System.out.println("PRODUCT STOCK: " + productStockInformation);
        System.out.println("---------------------------------------------------------");
    }
    
    public void checkBuyProduct(String productName, User user,int orderedAmount, int beforeStockInformation,int afterStockInformation, String usedCreditCardNumber){
        System.out.println(("PRODUCT |" + productName + "| ORDER HAS BEEN RECEIVED BY |" + user.getName() + " " + user.getSurname() +  "|.").toUpperCase());
        System.out.println("*********************************************************");
        System.out.println(("ORDERER: " + (user.getName() + " " + user.getSurname()).toUpperCase()));
        System.out.println("ORDERER USERNAME: " + user.getUsername());
        System.out.println("ORDERED PRODUCT: " + productName.toUpperCase() + "\nORDER AMOUNT: " + orderedAmount);
        System.out.println("PRODUCT STOCK BEFORE ORDER: " + beforeStockInformation + "\nPRODUCT STOCK AFTER ORDER: " + afterStockInformation);
        System.out.println("USED CREDIT CARD NUMBER IN ORDER: **** **** **** " +  usedCreditCardNumber);
        System.out.println("---------------------------------------------------------");
    }
}
