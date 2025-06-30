package com.example.e_comerse.Repository;

import com.example.e_comerse.Model.userdata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userdatarepo extends JpaRepository<userdata,Integer> {

    userdata findByPhno(long phno);
}
