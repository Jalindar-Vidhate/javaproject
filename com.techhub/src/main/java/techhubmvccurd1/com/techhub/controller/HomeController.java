package techhubmvccurd1.com.techhub.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import techhubmvccurd1.com.techhub.model.UserModel;
import techhubmvccurd1.com.techhub.services.UserServices;

@Controller
public class HomeController {

	@Autowired
	UserServices service;
	
	@RequestMapping(value="/")
	public String test() {
		
		
		return "home";
	}
	@RequestMapping(value="/insert")
	public String insertPage() {
		
		
		return "insertView";
	}
	
	@RequestMapping(value="btn")
	public String insertData(HttpServletRequest request,Map map)
	{
		String name=request.getParameter("name");
		String salary=request.getParameter("salary");
		String deg=(String) request.getAttribute("deg");
		String address=request.getParameter("address");
		int k=service.insertData(name,salary,deg,address);
		map.put("msg",k);
		return "status";
				
	}
	
	@RequestMapping("/select")
	public String selectPage(Map map)
	{
		  List<UserModel> model=service.selectData();
		map.put("data", model);
		return "selectView";
	}
	
	@RequestMapping("/delete")
	public String deleteEmp(@RequestParam("empId") Integer id,Map map)
	{
		
		int del=service.deleteEmp(id);
		List<UserModel> model=service.selectData();
		map.put("data", model);
		return "selectView";
	}
	
	@RequestMapping("/update")
	public String updateEmp(@RequestParam("empId") Integer id,@RequestParam("name") String name,@RequestParam("salary") String salary,@RequestParam("deg") String deg,@RequestParam("address") String address,Map map)
	{
		map.put("id", id);
		map.put("name", name);
		map.put("salary",salary);
		map.put("deg", deg);
		map.put("address", address);
		
		return "updateView";
	}
	
	@RequestMapping(value="finalupdate",method=RequestMethod.POST)
	public String finalUpdate(HttpServletRequest request,Map map)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String salary=request.getParameter("salary");
		String deg=request.getParameter("deg");
		String address=request.getParameter("address");
		boolean b=service.finalUpdate(id,name,salary,deg,address);
		if(b)
		{
			List<UserModel> model=service.selectData();
			map.put("data", model);
			return "selectView";
		}
		else
		{
			map.put("msg", "some Problem is here....!");
			return "updateView";
		}
		
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	@ResponseBody
	public String searchData(@RequestParam("name") String name)
	{
		System.out.println(name);
		String str="";
		
		List<UserModel> list =service.searchData(name);
		
		str=str+"<table border=1>";
		for(UserModel model:list)
		{
			str=str+"<tr> <td>"+model.getName()+"</td> <td>"+model.getSalary()+"</td> <td>"+model.getDeg()+"</td> <td>"+model.getAddress()+"</td></tr>";
		}
		str=str+"</table>";
		System.out.println(str);
		return str;
	}
	
}
