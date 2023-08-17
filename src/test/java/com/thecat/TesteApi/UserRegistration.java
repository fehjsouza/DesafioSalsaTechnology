package com.thecat.TesteApi;

public class UserRegistration {
    private String email;
    private String appDescription;

    public UserRegistration(String email, String appDescription) {
        this.email = email;
        this.appDescription = appDescription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }
}
