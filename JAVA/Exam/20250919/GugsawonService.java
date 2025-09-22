package study1;

import java.util.List;

public class GugsawonService {
	private GugsawonFoodDAO dao;

	public GugsawonService(GugsawonFoodDAO dao) {
		this.dao = dao;
	}
	
	public List<GugsawonFoodDTO> getGugsawonFoodDTO() {
		return dao.findAll();
	}
	
	public void addGugsawonFood(int foodNum, String foodName, int foodCnt, int day) {
		GugsawonFoodDTO dto = new GugsawonFoodDTO(foodNum, foodName, foodCnt, day);
		dao.save(dto);
	}
}
