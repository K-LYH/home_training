package kr.co.home_training.access;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

public interface AccessService {
    public void login(HttpSession httpSession, Users users);
    public void logout(HttpSession httpSession);
    public void regist(Users users);
}
