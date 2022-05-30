package com.generation.model;

import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        int StudentId;
        String name;
                Student(int studentId, String name) {
                    this.studentId =  studentId;

    }
        String id = "111";
        String Student = "Jean";
        String email = "jean@gmail.com";
        String date = "01/01/2001";
        String Student1 = "Bryan";
        String id1 = "222";
        String email1 = "bryangmail.com";
        String date1 = "02/02/2001";







    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO

        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
