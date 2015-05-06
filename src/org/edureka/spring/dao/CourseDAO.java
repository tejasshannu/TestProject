package org.edureka.spring.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.edureka.spring.model.Course;

public class CourseDAO {		
	
	private DataSource dataSource;	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insertCourse(Course course){
		
		String query = "insert into course (id,title,price) values (?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,course.getCourseId());
            ps.setString(2,course.getCourseTitle());
            ps.setInt(3, course.getPrice());
            int out = ps.executeUpdate();
            if(out !=0){
                System.out.println("Course Added   ");
            }else System.out.println("Error inserting Course");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
		
		
	}

}
