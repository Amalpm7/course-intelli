package com.example.coursebackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseModel {

    @Id
    @GeneratedValue
    private int Id;
    private String course_name;
    private String description;
    private String type;
    private String duration;

    public CourseModel(int id, String course_name, String description, String type, String duration) {
        Id = id;
        this.course_name = course_name;
        this.description = description;
        this.type = type;
        this.duration = duration;
    }

    public CourseModel() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
