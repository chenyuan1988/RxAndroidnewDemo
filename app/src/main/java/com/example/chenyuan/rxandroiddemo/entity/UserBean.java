package com.example.chenyuan.rxandroiddemo.entity;

/**
 * Created by chenyuan  on 2017/10/17.
 */

public class UserBean {

    /**
     * userId : 1
     * nickName : sample string 2
     * realName : sample string 3
     * gender : 4
     * mobile : sample string 5
     * email : sample string 6
     * zfbAccount : sample string 7
     * wxAccount : sample string 8
     * balance : sample string 9
     * integral : 10
     * inviteCode : sample string 11
     * notReadMessageCount : 12
     * userCommunityTel : sample string 13
     */

    private int userId;
    private String nickName;
    private String realName;
    private int gender;
    private String mobile;
    private String email;
    private String zfbAccount;
    private String wxAccount;
    private String balance;
    private int integral;
    private String inviteCode;
    private int notReadMessageCount;
    private String userCommunityTel;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZfbAccount() {
        return zfbAccount;
    }

    public void setZfbAccount(String zfbAccount) {
        this.zfbAccount = zfbAccount;
    }

    public String getWxAccount() {
        return wxAccount;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public int getNotReadMessageCount() {
        return notReadMessageCount;
    }

    public void setNotReadMessageCount(int notReadMessageCount) {
        this.notReadMessageCount = notReadMessageCount;
    }

    public String getUserCommunityTel() {
        return userCommunityTel;
    }

    public void setUserCommunityTel(String userCommunityTel) {
        this.userCommunityTel = userCommunityTel;
    }
}
