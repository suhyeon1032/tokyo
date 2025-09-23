package ch2;

import java.util.ArrayList;
import java.util.List;

// 데이터 관리. Service에 데이터 제공
public class ScoreDAO {
	
	// 학생 점수를 순차적으로 저장
	List<ScoreDTO> scoreList = new ArrayList<>();
	
	// 학생 한 명의 정보를 DTO에서 전달받아 List에 추가
	public void save(ScoreDTO dto) {
		scoreList.add(dto);
	}
	
	// 저장된 학생 전체 목록을 호출
	public List<ScoreDTO> findAll() {
		return scoreList;
	}
	
}
