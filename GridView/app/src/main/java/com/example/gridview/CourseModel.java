package com.example.gridview;

public class CourseModel {
    public CourseModel(int course_image, String course_name) {
        this.course_image = course_image;
        this.course_name = course_name;
    }

    private int course_image;
    private String course_name;

    public int getCourse_image() {
        return course_image;
    }

    public void setCourse_image(int course_image) {
        this.course_image = course_image;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
