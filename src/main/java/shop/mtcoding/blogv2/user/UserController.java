package shop.mtcoding.blogv2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }
    @GetMapping("/user/updateForm")
    public String userUpdateForm(){
        return "user/updateForm";
    }
}
