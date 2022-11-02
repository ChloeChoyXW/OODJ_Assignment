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
public class MemberPayment {
    private String uid;    
    private long cardNo;
    private int cvv;
    private YearMonth expiryDate;

    public MemberPayment() {
        uid = null;
        cardNo = 0;
        cvv = 0;
        expiryDate = null;
    }

    public MemberPayment(String uid, long cardNo, int cvv, YearMonth expiryDate) {
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

    public long getCardNo() {
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
