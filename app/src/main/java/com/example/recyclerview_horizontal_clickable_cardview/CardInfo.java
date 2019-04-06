package com.example.recyclerview_horizontal_clickable_cardview;

public class CardInfo {
    public String getSocialname() {
        return socialname;
    }

    public void setSocialname(String socialname) {
        this.socialname = socialname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String socialname,username;

    public CardInfo(String socialname,String username) {
        this.socialname = socialname;
        this.username = username;
    }

}
