package ecommerceproject;

import java.util.ArrayList;
import java.util.Date;

public class User{
    
    private String username,name,surname,password,email,homeAddress,workAddress;
    private Date birthDay;
    private ArrayList<CreditCard> usersCreditCards;
    private ArrayList<Product> orderedProducts,favouriteProducts;
    private Test testUser;
    
    public User(String username, String name, String surname, String password, String email, String homeAddress, String workAddress, Date birthDay, Test testUser) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.birthDay = birthDay;
        this.orderedProducts = new ArrayList<Product>();
        this.favouriteProducts = new ArrayList<Product>();
        this.usersCreditCards = new ArrayList<CreditCard>();
        this.testUser = testUser;
        testUser.userCreated((name + " " +  surname).toUpperCase(),email,username,homeAddress,workAddress);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
    public CreditCard getCreditCardByIndex(int index) {
        return this.usersCreditCards.get(index);
    }
    
    public ArrayList <Product> getOrderedProducts() {
        return this.orderedProducts;
    }
    
    public ArrayList <Product> getFavouriteProducts(){
        return favouriteProducts;
    }
    
    //adding credit card
    public void addCreditCard(CreditCard c) {
        int i = 0;
        boolean notAdded = true;
        while(notAdded && (i < usersCreditCards.size())) //while loop is more effective in this situation 
        {
            if(c.equals(usersCreditCards.get(i))){
                notAdded = false;
            }
            else
            {
                i++;
            }
        }
        if(notAdded)
        {
            this.usersCreditCards.add(c);
        }
        else
        {
            System.out.println("USER @" + this.username + " HAVE ADD CREDIT CARD |**** **** **** " + 
                Integer.toString(usersCreditCards.get(i).getCardNumber()).substring(Integer.toString(usersCreditCards.get(i).getCardNumber()).length() - 4,
                        Integer.toString(usersCreditCards.get(i).getCardNumber()).length())
                            + "| TO CREDIT CARDS LIST BEFORE.");
            System.out.println("---------------------------------------------------------");
        }
    }
    
    // buyProduct method
    public void buyProduct(Product p, int amount){
        p.reduceTheAmount(amount);
        this.orderedProducts.add(p);
    }
    
    // addFavouriteProducts method
    public void addFavouriteProducts(Product p) {
        int i = 0;
        boolean notAdded = true;
        while(notAdded && (i < favouriteProducts.size())) //while loop is more effective in this situation 
        {
            if(p.equals(favouriteProducts.get(i))){
                notAdded = false;
            }
            else
            {
                i++;
            }
        }
        if(notAdded)
        {
            this.favouriteProducts.add(p);
        }
        else
        {
            System.out.println("USER @" + this.username + " HAVE ADD PRODUCT |" + p.getProductName().toUpperCase() + "| TO FAVOURITE LIST BEFORE.");
            System.out.println("---------------------------------------------------------");
        }
    }
    
    // it writes all user's attributes
    public void writeAllAtts() {
        //fav products if else statement
        System.out.printf("%42s",(this.name +" " + this.surname).toUpperCase() + " (" + this.username + ")");
        System.out.print("\n*********************************************************");
        
        if (favouriteProducts.size() > 0) {
            System.out.println("\n@" + this.username + "'s FAVOURITE PRODUCTS (" + favouriteProducts.size() + ")");
            
            for(int i = 0; favouriteProducts.size() > i ; i++) {   
                System.out.print( (i + 1) + "." + favouriteProducts.get(i).getProductName().toUpperCase() );
            }  
        }
        else {
            System.out.print("\n@" + this.username + " HASN'T ADDED ANY PRODUCT TO FAVOURITES YET.");
        }
        System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
         
        //ordered products if else statement
        if (orderedProducts.size() > 0) {
            System.out.print("\n@" + this.username + "'s ORDERED PRODUCTS (" + orderedProducts.size() + ")\n");
            for(int i = 0; orderedProducts.size() > i ; i++) {   
                System.out.print( (i + 1) + "." + orderedProducts.get(i).getProductName().toUpperCase() + "\n");
            }
        }
        else {            
            System.out.println("\n@" + this.username + " HASN'T ORDERED THE PRODUCT YET.");
        }
        System.out.print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        // credit card atts
        if (usersCreditCards.size() > 0) {
            System.out.print("\n@" + this.username + "'s CREDIT CARDS (" + usersCreditCards.size() + ")\n");
            for(int i = 0; usersCreditCards.size() > i ; i++) {   
                System.out.print( (i + 1) + ". **** **** **** " + 
                        Integer.toString(usersCreditCards.get(i).getCardNumber()).substring(Integer.toString(usersCreditCards.get(i).getCardNumber()).length() - 4 ,
                                Integer.toString(usersCreditCards.get(i).getCardNumber()).length()) + "\n");
            }
        }
        else {            
            System.out.println("\n@" + this.username + " HASN'T ADDED A CREDIT CARD YET.");
        }
         System.out.println("---------------------------------------------------------");
    }
}