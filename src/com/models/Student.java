package com.models;

public class Student extends Person{
    protected int IDNumber;
    protected double fee;
    protected int grade;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public int getIDNumber(){
        return this.IDNumber;
    }
    public double getFee(){
        return this.fee;
    }
    public int getGrade(){
        return this.grade;
    }

    public void setIDNumber(int idNumber){
        this.IDNumber = idNumber;
    }
    public void setFee(double newFee){
        this.fee = newFee;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
}
