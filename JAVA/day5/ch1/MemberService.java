package ch1;

import java.util.List;

// 중간 관리자 역할 : 회원 등록, 조회 구현
public class MemberService {
	
	private MemberDAO dao;

	/*
	 * 의존성 주입
	 * 필요 객체를 직접 만들지 않고 외부에서 가져와 넣는 것
	 * 외부에서 가져와 내부 변수로 저장 시 교체 용이, Service 클래스도 
	 * 어떤 DAO인지는 알지 못함
	 * */
	
	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}
	
	// DAO(저장소)에 저장된 전체 회원 반환
	// controller에서 2번 회원 출력을 누르면 이 값을 반환해줌
	public List<MemberDTO> getAllmember() {
		return dao.findAll();
	}
	
	// 리스트 추가를 위한 구체적인 회원 등록
	// controller에서 입력 받은 걸 등록 동작
	// 내가 입력받은걸 매개변수를 통해서 함수 안으로 들어옴
	// 저장하는 곳은 dao.save에서 동작
	public void addMember(String name, String id, String email) {
		// 회원 정보를 받음
		MemberDTO dto = new MemberDTO(name, id, email);
		// dao에게 넘겨줌
		dao.save(dto);
	}
	
}
