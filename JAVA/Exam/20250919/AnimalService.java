package study1;

import java.util.List;

public class AnimalService {
	private AnimalDAO dao;
	
	public AnimalService(AnimalDAO dao) {
		this.dao = dao;
	}
	
	public List<AnimalDTO> getAnimalDTO() {
		return dao.findAll();
	}
	
	public void addAnimal(String id, String userName, String animalName, int animalAge, int phoneNum) {
		AnimalDTO dto = new AnimalDTO(id, userName, animalName, animalAge, phoneNum);
		dao.save(dto);
	}
}
