package study1;

import java.util.List;

public class HealthService {
	private HealthDAO dao;

	public HealthService(HealthDAO dao) {
		this.dao = dao;
	}
	
	public List<HealthDTO> getHealthDTO() {
		return dao.findAll();
	}

	public void addHealth(String userName, int userNum, int beforCal, int afterCal) {
		HealthDTO dto = new HealthDTO(userName, userNum, beforCal, afterCal);
		dao.save(dto);
	}
}
