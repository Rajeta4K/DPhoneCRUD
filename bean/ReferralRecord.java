package com.bajaj.bean;

public class ReferralRecord {
    private String name;
    private String email;
    private long id;
    private  int bonusPoint;
    public ReferralRecord (){

    }
    public ReferralRecord(String name, String email, long id, int bonusPoint) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.bonusPoint = bonusPoint;
    }

    @Override
    public String toString() {
        return "ReferralRecord{ id=" + id  +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bonusPoint=" + bonusPoint +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
