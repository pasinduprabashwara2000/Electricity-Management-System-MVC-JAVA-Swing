package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.EmployeeDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeModel {

    public String saveEmployee(EmployeeDto employeeDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO employee VALUES (?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,employeeDto.getEmpID());
        st.setString(2,employeeDto.getName());
        st.setString(3,employeeDto.getAddress());
        st.setInt(4,employeeDto.getContactNo());

        return st.executeUpdate() > 0 ? "Employee Saved Successfully" : "Employee Save Failed";

    }

    public String updateEmployee(EmployeeDto employeeDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE employee SET name = ?, address= ?, contact_no = ? WHERE emp_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,employeeDto.getName());
        st.setString(2,employeeDto.getAddress());
        st.setInt(3,employeeDto.getContactNo());
        st.setString(4,employeeDto.getEmpID());

        return st.executeUpdate() > 0 ? "Employee Updated Successfully" : "Employee Updated Failed";

    }

    public String deleteEmployee(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM employee WHERE emp_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        return st.executeUpdate() > 0 ? "Employee Deleted Successfully" : "Employee Deleted Failed";
    }

    public EmployeeDto searchEmployee(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SEARCH * FROM employee WHERE emp_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        if(rst.next()){
            return new EmployeeDto(
                    rst.getString("emp_id"),
                    rst.getString("name"),
                    rst.getString("address"),
                    rst.getInt("contact_no")
            );
        }

        return null;
    }

    public ArrayList <EmployeeDto> getAllEmployee() throws Exception{

        ArrayList <EmployeeDto> employeeDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM employee";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            employeeDtos.add(new EmployeeDto(
                    rst.getString("emp_id"),
                    rst.getString("name"),
                    rst.getString("address"),
                    rst.getInt("contact_no")
            ));
        }

        return employeeDtos;
    }
}
