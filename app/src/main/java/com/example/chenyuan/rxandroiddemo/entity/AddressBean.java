package com.example.chenyuan.rxandroiddemo.entity;

/**
 * Created by chenyuan  on 2017/10/17.
 */

public class AddressBean {

    /**
     * id : 1
     * roomId : 2
     * addressFullName : sample string 3
     * receiver : sample string 4
     * receiverTel : sample string 5
     * isDefault : true
     */

    private int id;
    private int roomId;
    private String addressFullName;
    private String receiver;
    private String receiverTel;
    private boolean isDefault;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getAddressFullName() {
        return addressFullName;
    }

    public void setAddressFullName(String addressFullName) {
        this.addressFullName = addressFullName;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
}
