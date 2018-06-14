package com.rvfs.challenge.mcc.appweb.service;

import com.rvfs.challenge.mcc.appweb.dto.UserDTO;

public interface UserService {

    public UserDTO findByUsername(String username);

    public void register(UserDTO userData);
}
