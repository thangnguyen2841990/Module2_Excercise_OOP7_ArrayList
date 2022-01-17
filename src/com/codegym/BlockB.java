package com.codegym;

public class BlockB extends Candidature {
    private String examSubject;

    public BlockB(int examID, String name, String address, String priorityArea, String examSubject) {
        super(examID, name, address, priorityArea);
        this.examSubject = examSubject;
    }


    public String getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(String examSubject) {
        this.examSubject = examSubject;
    }

    @Override
    public String toString() {
        return super.toString() + ", môn thi: "+ this.examSubject;
    }
}
