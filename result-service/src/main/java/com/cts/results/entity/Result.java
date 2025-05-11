package com.cts.results.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result {

    @Id
    @Column(name = "hall_ticket_number", length = 20)
    private String hallTicketNumber;

    @Column(name = "student_name", length = 100)
    private String studentName;

    private int telugu;
    private int hindi;
    private int english;
    private int mathematics;
    private int science;
    private int social;

    // Getters and Setters

    public String getHallTicketNumber() {
        return hallTicketNumber;
    }

    public void setHallTicketNumber(String hallTicketNumber) {
        this.hallTicketNumber = hallTicketNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTelugu() {
        return telugu;
    }

    public void setTelugu(int telugu) {
        this.telugu = telugu;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }
}
