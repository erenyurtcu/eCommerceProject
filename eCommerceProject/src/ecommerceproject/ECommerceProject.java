package ecommerceproject;
 
import java.util.Date;
import java.util.ArrayList;

public class ECommerceProject {
    
    public static void main(String[] args) {
        
        // one test object is enough
        Test test = new Test(); 
        
        // users' birthdays
        Date bDay1 = new Date (1995,12,18);
        Date bDay2 = new Date (1999,1,22);
        Date bDay3 = new Date (2002,7,9);
        
        // credit cards' expiration dates
        Date cDate1_1 = new Date (2028,1,19);
        Date cDate1_2 = new Date (2027,8,11);
        Date cDate2 = new Date (2025,5,21);
        Date cDate3 = new Date (2029,7,6);
        
        // product objects
        Product p1 = new Product ("pen","blue","statıonery",25,5,test);
        Product p2 = new Product ("phone","whıte","technology",10,2,test);
        Product p3 = new Product ("dress","green","clothıng",80,1,test);
        
        // user objects
        User u1 = new User ("mustafaguler","mustafa","guler","mgl123","mguler@gmail.com","kastamonu","ızmır",bDay1,test);
        User u2 = new User ("erenyurtcuuu","eren","yurtcu","20032023.tr","erenyurtcu@gmail.com","manısa","ıstanbul",bDay2,test);
        User u3 = new User ("selink","selın","kaya","sk.02.07selin","skaya@gmail.com","aydın","ankara",bDay3,test);

        // credit card objects
        CreditCard c1_1 = new CreditCard (455356875,778,cDate1_1,u1,test);
        CreditCard c1_2 = new CreditCard (894645668,258,cDate1_2,u1,test);
        CreditCard c2 = new CreditCard (1589685358,311,cDate2,u2,test);
        CreditCard c3 = new CreditCard (432899871,935,cDate3,u3,test);
        
        // order objects
        // u1's orders and favourites
        Order o1_1 = new Order(u1,p1,c1_1,6,test);
        Order o1_2 = new Order(u1,p3,c1_1,3,test);
        Order o1_3 = new Order(u1,p1,c1_2,4,test);
        
        u1.addFavouriteProducts(p2);
        u1.addFavouriteProducts(p2);
        
        // u2's orders and favourites
        Order o2_1 = new Order(u2,p2,c2,6,test);
        Order o2_2 = new Order(u2,p1,c2,8,test);
        Order o2_3 = new Order(u2,p1,c2,100,test); // it is not allowed because of stock
        
        u2.addFavouriteProducts(p3);
        
        // u3's orders and favourites
        Order o3_1 = new Order(u3,p3,c3,10,test);
        Order o3_2 = new Order(u3,p3,c3,15,test);
        
        u3.addFavouriteProducts(p2);
        u3.addFavouriteProducts(p1);
        
        // if you want to see user's all attributes, you can call writeAllAtts method from User class.
        
        u1.writeAllAtts();
        u2.writeAllAtts();
        u3.writeAllAtts();
    }
    
}
