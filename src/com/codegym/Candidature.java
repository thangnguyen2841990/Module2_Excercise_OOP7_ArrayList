package com.codegym;



public class Candidature {
    protected int examID;
    protected String name;
    protected String address;
    protected String priorityArea;

    public Candidature(int examID, String name, String address, String priorityArea) {
        this.examID = examID;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }



    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriorityArea() {
        return priorityArea;
    }

    public void setPriorityArea(String priorityArea) {
        this.priorityArea = priorityArea;
    }

    @Override
    public String toString() {
        return "SBD: " + this.examID + ", Họ và tên: " + this.name + ", địa chỉ: "
                + this.address + ", khu vực ưu tiên: " + this.priorityArea;
    }
}
