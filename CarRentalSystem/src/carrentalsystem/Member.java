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
    private long icNo;
    private long phoneNo;
    private String address;

    public Member() {
        icNo = 0;
        phoneNo = 0;
        address = null;
    }

    public Member(String uid, String name, String pw, String email, long icNo, long phoneNo, String address) {
        super(uid, name, pw, email);
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public Member(String uid) {
        super(uid);
    }
    
    

    public void setIcNo(long icNo) {
        this.icNo = icNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getIcNo() {
        return icNo;
    }

    public long getPhoneNo() {
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
