package kr.co.home_training.access;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Users implements Serializable {
    private String id;
    private String pw;
    private String name;
    private String nickname;

    public Users() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return this.pw;
    }

    public void setNickname (String name) { this.name = name; }

    public String getNickname () { return this.nickname; }
}
