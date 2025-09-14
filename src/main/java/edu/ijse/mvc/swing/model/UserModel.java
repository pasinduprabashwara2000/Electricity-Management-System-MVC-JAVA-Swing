package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {

    public boolean searchUser(UserDto userDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT user_name = ? AND password = ? WHERE role = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,userDto.getName());
        st.setString(2,userDto.getPassword());
        st.setString(3,userDto.getRole());

        try {
            ResultSet rst = st.executeQuery();
            return rst.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
