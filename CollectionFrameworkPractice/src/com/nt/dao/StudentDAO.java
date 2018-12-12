package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nt.bean.StudentBean;

public class StudentDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query = null;

	public StudentDAO() {
		try {
			// Establish the connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create DriverManager class object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
			// create query object
			query = "select * from student1 where course=?";
			// create prepearedStatemet object
			ps = con.prepareStatement(query);

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// create method for retrieving student information from the DataBase table
	public ArrayList getStudents(String course) {

		ArrayList<Object> al = new ArrayList<>();

		try {
			// set the values to the query params
			ps.setString(1, course);
			// execute the query
			rs = ps.executeQuery();
			while (rs.next()) {
				StudentBean sb = new StudentBean();
				sb.setSno(rs.getInt(1));
				sb.setSname(rs.getString(2));
				sb.setCourse(rs.getString(3));
				sb.setFees(rs.getDouble(4));

				al.add(sb);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(con!=null) {
					con.close();
				}
				}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return al;
	}
}
