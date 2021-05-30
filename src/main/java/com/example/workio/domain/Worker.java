package com.example.workio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ID;
    private String workerName;
    private String workerSurname;
    private int workerAge;

    public int getTalkingSkill() {
        return talkingSkill;
    }

    public void setTalkingSkill(int talkingSkill) {
        this.talkingSkill = talkingSkill;
    }

    public int getExcelSkill() {
        return excelSkill;
    }

    public void setExcelSkill(int excelSkill) {
        this.excelSkill = excelSkill;
    }

    public int getJavaSkill() {
        return javaSkill;
    }

    public void setJavaSkill(int javaSkill) {
        this.javaSkill = javaSkill;
    }

    public int getTranslatingSkill() {
        return translatingSkill;
    }

    public void setTranslatingSkill(int translatingSkill) {
        this.translatingSkill = translatingSkill;
    }

    int talkingSkill;
    int excelSkill;
    int javaSkill;
    int translatingSkill;

    public Worker(){
        super();
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }


    public Worker(Long ID, String workerName, String workerSurname, int workerAge, int talkingSkill, int excelSkill, int javaSkill, int translatingSkill) {
        super();
        this.ID = ID;
        this.workerName = workerName;
        this.workerSurname = workerSurname;
        this.workerAge = workerAge;
        this.talkingSkill = talkingSkill;
        this.excelSkill = excelSkill;
        this.javaSkill = javaSkill;
        this.translatingSkill = translatingSkill;
    }
}
