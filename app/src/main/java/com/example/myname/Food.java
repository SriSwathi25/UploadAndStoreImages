package com.example.myname;
public class Food {
    private String Number;
    private String Value;
    public Food(){}
   public Food(String Number, String Value){
        this.Number = Number;
        this.Value = Value;
    }

    public String getNumber() {
        return Number;
    }

    public String getValue() {
        return Value;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public void setValue(String value) {
        this.Value = value;
    }
}
