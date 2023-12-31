package techhubmvccurd1.com.techhub.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import techhubmvccurd1.com.techhub.model.UserModel;




@Repository
public class UserRepository {

	@Autowired
	JdbcTemplate template;
	
	
	public int insertData(final String name, final String salary,final String deg,final  String address) {
	
		int k=template.update("insert into user values('0',?,?,?,?)",new PreparedStatementSetter(){

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, name);
				ps.setString(2, salary);
				ps.setString(3, deg);
				ps.setString(4, address);
				
			}
			
		});
		
		
		
		return k;
	}


	public List<UserModel> selectData() {
		
		List<UserModel> list=new ArrayList<UserModel>();
		
		list=template.query("select * from user",new RowMapper<UserModel>() {

			@Override
			public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UserModel model=new UserModel();
					model.setId(rs.getInt(1));
					model.setName(rs.getString(2));
					model.setSalary(rs.getString(3));
					model.setDeg(rs.getString(4));
					model.setAddress(rs.getString(5));
					
				return model;
			}
		});
		
		return list;
	}


	public int deleteEmp(int id) {
		
		int k=template.update("delete from user where id=?",new Object[] {id});
		
		return k;
	}


	public boolean finalUpdate(final int id,final String name, final String salary, final String deg, final String address) {

		int k=template.update("update user set name=?,salary=?,deg=?,address=? where id=?", new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1,name);	
				ps.setString(2, salary);
				ps.setString(3, deg);
				ps.setString(4, address);
				ps.setInt(5, id);
			}
		});
		
		return k>0?true:false;
	}


	public List<UserModel> searchData(String nameOrContact) {
		
          List<UserModel> list=new ArrayList<UserModel>();
		
		list=template.query("select * from user where name like '%"+nameOrContact+"%'",new RowMapper<UserModel>() {

			@Override
			public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UserModel model=new UserModel();
					model.setId(rs.getInt(1));
					model.setName(rs.getString(2));
					model.setSalary(rs.getString(3));
					model.setDeg(rs.getString(4));
					model.setAddress(rs.getString(5));
					
				return model;
			}
		});
		
		return list;
	}

}
