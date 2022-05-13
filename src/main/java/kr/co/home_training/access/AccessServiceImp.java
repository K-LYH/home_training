package kr.co.home_training.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AccessServiceImp implements AccessService{
    @Autowired
    AccessMapper accessMapper;

    @Override
    public void login(HttpSession httpSession, Users users) {
        if (accessMapper.selectId(users) != null) {
            httpSession.setAttribute("id", users.getId());
        } else {
            String msg = "아이디 혹은 비밀번호가 올바르지 않습니다.";
        }
    }

    @Override
    public void logout(HttpSession httpSession) {

    }

    @Override
    public void regist(Users users) {

    }
}
