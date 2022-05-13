package kr.co.home_training.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/home_training")
public class AccessController {
    @Autowired
    AccessService accessService;

    @GetMapping("/login")
    public ModelAndView Login() {
        ModelAndView mav = new ModelAndView("/login");
        return mav;
    }

    @PostMapping("/login")
    public ModelAndView Login(Users users, HttpSession httpSession) {
        ModelAndView mav = new ModelAndView("/login");
        return null;
    }
}
