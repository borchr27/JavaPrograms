package com.company;

public class OfferedCourse extends Course {
    // TODO: Declare private fields - instructorName, term, classTime
    private String instructorName;
    private String term;
    private String classTime;

    // TODO: Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()
    public void setInstructorName(String name){
        this.instructorName = name;
    }

    public void setTerm(String termInfo){
        this.term = termInfo;
    }

    public void setClassTime(String time){
        this.classTime = time;
    }

    // TODO: Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()
    public String getInstructorName(){
        return instructorName;
    }

    public String getTerm(){
        return term;
    }

    public String getClassTime(){
        return  classTime;
    }

}