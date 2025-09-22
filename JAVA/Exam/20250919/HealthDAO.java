package study1;

import java.util.ArrayList;
import java.util.List;

public class HealthDAO {
	private List<HealthDTO> healthList = new ArrayList<HealthDTO>();
	
	public void save(HealthDTO dto) {
		healthList.add(dto);
	}
	
	public List<HealthDTO> findAll() {
		return healthList;
	}
}
