package com.example.e_comerse.Controller;

import com.example.e_comerse.Model.userdata;
import com.example.e_comerse.Repository.userdatarepo;
import com.example.e_comerse.Service.userdataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class datacontroller {
    @Autowired
    userdatarepo userinfo;
    @Autowired
    userdataservice Userdata;
    @PostMapping("/Register")
            public String registerdetails(@RequestParam("name") String name,@RequestParam("phno") long phno,
                                          @RequestParam("password") String password){

            Userdata.registerdetails(name,phno,password);
        return "Registration successful for: " + name;
    }

    @PostMapping("/Login")
    public String logincheck(@RequestParam("phno") long phno,@RequestParam("password") String pass)
    {
        userdata userInfo=userinfo.findByPhno(phno);
        boolean success=Userdata.logincheck(phno,pass);
        if(success)
        {
            return "login success!  welcome"+userInfo.getName();
        }
        else
        {
            return "redirect:/login.html?error=true";
        }

    }

}
