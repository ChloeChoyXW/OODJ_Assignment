/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author USER
 */
public class Member extends User{
    private String icNo;
    private String phoneNo;
    private String address;

    public Member() {
        icNo = null;
        phoneNo = null;
        address = null;
    }

    public Member(String uid, String name, String pw, String email, String icNo, String phoneNo, String address) {
        super(uid, name, pw, email);
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public Member(String uid) {
        super(uid);
    }
    
    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIcNo() {
        return icNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return this.getUid() + "|" + this.getName() + "|" + this.getPw() + "|" + this.getEmail() + "|" + icNo + "|" + phoneNo + "|" + address;
    } 
  
}
