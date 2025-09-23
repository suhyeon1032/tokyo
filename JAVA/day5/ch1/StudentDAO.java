package ch1;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private List<StudentDTO> studentList = new ArrayList<>();
	
	// 저장
	public void save(StudentDTO dto) {
		studentList.add(dto);
	}
	
	// 조회
	public List<StudentDTO> findAll() {
		return studentList;
	}
}
