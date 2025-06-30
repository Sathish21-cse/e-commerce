package com.example.e_comerse.Service;

import com.example.e_comerse.Model.userdata;
import com.example.e_comerse.Repository.userdatarepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userdataservice {
    @Autowired
    userdatarepo userData;
    public void registerdetails(String name, long phNo, String password) {
        userdata data=new userdata(password,phNo,name);
        userData.save(data);
    }

    public boolean logincheck(long phNo, String pass) {
        userdata data=new userdata(pass,phNo);
        userdata user=userData.findByPhno(phNo);
        if(user !=null && user.getPassword().equals(pass))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
