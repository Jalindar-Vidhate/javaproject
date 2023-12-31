package techhubmvccurd1.com.techhub.services;

import techhubmvccurd1.com.techhub.model.UserModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techhubmvccurd1.com.techhub.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	UserRepository repo;
	
	public int insertData(String name,String salary,String deg,String address)
	{
		
		return repo.insertData(name,salary,deg,address);
	}

	public List<UserModel> selectData() {
		
		
		return repo.selectData();
		
	}

	public int deleteEmp(int id) {
		
		return repo.deleteEmp(id);
	}

	public boolean finalUpdate(int id,String name, String salary, String deg, String address) {

		
		return repo.finalUpdate(id,name,salary,deg,address);
		
	}

	public List<UserModel> searchData(String nameOrContact) {
		
		return repo.searchData(nameOrContact);
	}
}
