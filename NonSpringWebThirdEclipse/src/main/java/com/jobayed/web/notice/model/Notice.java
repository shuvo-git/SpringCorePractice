package com.jobayed.web.notice.model;

import com.jobayed.web.notice.validation.ValidEmail;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Notice {
    private int id;
    @Size(min = 4, max = 100, message = "Name must be between 4 and 100 characters")
    private String name;

    @NotBlank(message = "Should not be blank")
    @NotEmpty(message = "should not be empty")
    @ValidEmail
    private String email;

    @Size(min = 1, max = 100, message = "Text must be between 1 and 100 characters")
    private String text;

    public Notice() {
    }

    public Notice(int id, String name, String email, String text) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public Notice(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
