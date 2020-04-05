package com.company;

public class Course{
    // TODO: Declare private fields - courseNumber, courseTitle
    private String courseNumber;
    private String courseTitle;

    // TODO: Define mutator methods -
    //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String courseNum){
        this.courseNumber = courseNum;
    }

    public void setCourseTitle(String title){
        this.courseTitle= title;
    }

    // TODO: Define accessor methods -
    //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber(){
        return courseNumber;
    }

    public String getCourseTitle(){
        return courseTitle;
    }

    // TODO: Define printInfo()
    public void printInfo(){
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + getCourseNumber());
        System.out.println("   Course Title: " + getCourseTitle());
    }
}