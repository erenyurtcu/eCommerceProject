package ecommerceproject;

import java.util.Date;

public class CreditCard {
    
    private int cardNumber,securityCode;
    private Date cardDate;
    private User cardUser;
    private Test testCreditCard;
    
    public CreditCard(int cardNumber, int securityCode, Date cardDate, User cardUser,Test testCreditCard) {
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.cardDate = cardDate;
        this.cardUser = cardUser;
        this.cardUser.addCreditCard(this);
        this.testCreditCard = testCreditCard;
        testCreditCard.creditCardCreated((Integer.toString(cardNumber).substring(Integer.toString(cardNumber).length() - 4, Integer.toString(cardNumber).length())),
                (cardUser.getName() + " "  + cardUser.getSurname()).toUpperCase(),Integer.toString(securityCode).substring(Integer.toString(securityCode).length() - 1),cardDate);
    }
    
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public Date getCardDate() {
        return cardDate;
    }

    public void setCardDate(Date cardDate) {
        this.cardDate = cardDate;
    }

    public User getCardUser() {
        return cardUser;
    }

    public void setCardUser(User cardUser) {
        this.cardUser = cardUser;
    }
}