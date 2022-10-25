/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.time.YearMonth;

/**
 *
 * @author USER
 */
public class memberPayment {
    private String uid;    
    private int cardNo;
    private int cvv;
    private YearMonth expiryDate;

    public memberPayment() {
        uid = null;
        cardNo = 0;
        cvv = 0;
        expiryDate = null;
    }

    public memberPayment(String uid, int cardNo, int cvv, YearMonth expiryDate) {
        this.uid = uid;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setExpiryDate(YearMonth expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getUid() {
        return uid;
    }

    public int getCardNo() {
        return cardNo;
    }

    public int getCvv() {
        return cvv;
    }

    public YearMonth getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return uid + "|" + cardNo + "|" + cvv + "|" + expiryDate;
    }
    
    
    
}
