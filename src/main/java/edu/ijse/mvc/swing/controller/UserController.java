package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.UserDto;
import edu.ijse.mvc.swing.model.UserModel;

public class UserController {

    UserModel userModel = new UserModel();

    public boolean searchUser(UserDto userDto) throws Exception{
        return userModel.searchUser(userDto);
    }


}
