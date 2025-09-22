package study1;

import java.util.ArrayList;
import java.util.List;

public class GugsawonFoodDAO {
	private List<GugsawonFoodDTO> foodList = new ArrayList<>();
	
	public void save(GugsawonFoodDTO dto) {
		foodList.add(dto);
		System.out.println("식자재 정보 등록 완료");
	}
	
	public List<GugsawonFoodDTO> findAll() {
		return foodList;
	}
}
