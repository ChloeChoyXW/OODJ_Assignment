/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USER
 */
public class MemberPayment {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
    private String uid;    
    private String cardNo;
    private int cvv;
    private YearMonth expiryDate;

    public MemberPayment() {
        uid = null;
        cardNo = null;
        cvv = 0;
        expiryDate = null;
    }

    public MemberPayment(String uid, String cardNo, int cvv, YearMonth expiryDate) {
        this.uid = uid;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setCardNo(String cardNo) {
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

    public String getCardNo() {
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
        return uid + "|" + cardNo + "|" + cvv + "|" + expiryDate.format(formatter);
    }  
    
}
