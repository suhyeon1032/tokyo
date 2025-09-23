package ch1;

import java.util.ArrayList;
import java.util.List;

// 회원 리스트 저장, 조회
public class MemberDAO {
	
	/*
	 * 순서가 있는 배열로 크기 조절 가능
	 * 
	 * List 컬렉션 객체
	 * 인터페이스
	 * 
	 * ArrayList
	 * 클래스 
	 * 
	 * 
	 * .add(추가), .remove(삭제), size(데이터 갯수), .get(읽기)
	 * 
	 * */
	
	// 회원정보를 순서대로 저장
	private List<MemberDTO> memberList = new ArrayList<>();
	
	// 회원 한 명의 정보를 받아 memberList에 추가
	public void save(MemberDTO dto) { // 함수. 매개변수를 통해서 들어와야함
		memberList.add(dto);
	}
	
	// 회원 리스트 조회를 위해 전체 목록 가져옴
	public List<MemberDTO> findAll() {
		return memberList; // 회원 정보 전체를 호출한 곳으로 반환
	}
	
}
