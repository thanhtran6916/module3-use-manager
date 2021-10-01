package com.user.service;

import com.user.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface IUserService extends IGeneralService<User> {
    List<User> getByName(String name);

}
