package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.StudentBean;
import com.cg.service.IStudentService;

@Controller
public class StudentController
{
@Autowired
IStudentService studentservice;

@RequestMapping("/start")
public String start(Model m)
{
	m.addAttribute("bean", new StudentBean());
	return "studentform";
}

@RequestMapping("/index")
public String index()
{
	return "index";
}

@RequestMapping("/register")
ModelAndView register(@Valid @ModelAttribute("bean")  StudentBean bean,BindingResult result)
{
	if(result.hasErrors())
	{
		return new ModelAndView("studentform");
	}
	studentservice.register(bean);
	return new ModelAndView("studentSuccess","k",bean);
}

@RequestMapping("/find")
ModelAndView findById()
{
	List<StudentBean> list =studentservice.getIds();
	return new ModelAndView("studentFind","k",list);
}

@RequestMapping("/findId")
ModelAndView findId(@RequestParam("studentId") int studentId)
{
	StudentBean bean = studentservice.getById(studentId);
return new ModelAndView("studentSuccess","k",bean);
}

@RequestMapping("/findall.obj")
ModelAndView getAll()
{
	List<StudentBean> studlist = studentservice.getall();
	return new ModelAndView ("studentlist","k1",studlist);
}

@RequestMapping("/findname.obj")
ModelAndView name()
{
	List<StudentBean> list = studentservice.getNames();
	return new ModelAndView("name","k2",list);
}

@RequestMapping("/findname1.obj")
ModelAndView findByName(@RequestParam("studentName") String studentName)
{
	StudentBean bean = studentservice.getByName(studentName);
	return new ModelAndView("studentSuccess","k",bean);
}

@RequestMapping("/delete.obj")
ModelAndView delete()
{
	List<StudentBean> list = studentservice.deleteById();
	return new ModelAndView("delete","k3",list);
}

@RequestMapping("/delete1.obj")
public String deleteById(@RequestParam("studentId") int studentId )
{
	StudentBean bean = studentservice.getById(studentId);
	studentservice.deleteDetails(bean);

	return  "deleteinfo";
}

@RequestMapping("/update.obj")
ModelAndView update()
{
	List<StudentBean> list = studentservice.deleteById();
	return new ModelAndView("update","k3",list);
}

@RequestMapping("/update1.obj")
public ModelAndView updateById(@RequestParam("studentId") int studentId)
{
	StudentBean bean = studentservice.getById(studentId);
	return new ModelAndView("updateForm", "bean", bean);
	
}

@RequestMapping("/doUpdate.obj")
public ModelAndView updateDetails(@Valid @ModelAttribute("bean")  StudentBean bean,BindingResult result)
{
	if(result.hasErrors())
	{
		return new ModelAndView("updateForm");
	}
	StudentBean student = studentservice.updateStudent(bean);
	return new ModelAndView("studentSuccess","k",student);
}

}