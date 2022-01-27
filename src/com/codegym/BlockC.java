package com.codegym;

import java.io.Serializable;

public class BlockC extends Candidature implements Serializable {
    private String examSubject;

    public BlockC(int examID, String name, String address, String priorityArea, String examSubject) {
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
