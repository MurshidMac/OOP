package com.models;

public class Person {
    protected String myName ; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female
    public Person(String name, int age, String gender) {
        myName = name; myAge = age ; myGender = gender; }

        public String toString() {
        return myName + ", age: " + myAge + ", gender: " +myGender;
    }
    public String getMyName(){
        return this.myName;
    }
    public int getMyAge(){
        return this.myAge;
    }
    public String getMyGender(){
        return this.myGender;
    }
    public void setMyName(String customName){
        this.myName = customName;
    }
    public void setMyAge(int customAge){
        this.myAge = customAge;
    }
    public void setMyGender(String customGender){
        this.myGender = customGender;
    }
}
