package com.rvfs.challenge.mcc.appweb.service;

import com.rvfs.challenge.mcc.appweb.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public UserDTO findByUsername(String username) {
        return null;
    }

    @Override
    public void register(UserDTO userData) {

    }


}
