package day5;

import java.util.List;

public class StudentService {
	
	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}
	
	public List<StudentDTO> getAllmember() {
		return dao.findAll();
	}
	
	public void addStudent(String name, int num, String dep, int age) {
		StudentDTO dto = new StudentDTO(name, num, dep, age);
		dao.save(dto);
	}
	
}
