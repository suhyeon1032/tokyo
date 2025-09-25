package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateEx {
	public static void main(String[] args) {
		List<ListDTO> list = new ArrayList<ListDTO>();

		list.add(new ListDTO(10, "또라봉"));
		list.add(new ListDTO(20, "또지향"));
		list.add(new ListDTO(30, "또국향"));
		list.add(new ListDTO(40, "또로초"));

		int updateId = 10; // 수정 번호
		String newName = "orange"; // 바꿀 이름

		// 1. 인덱스 for문으로 수정
		System.out.println("== for문으로 수정 ==");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == updateId) {
				list.get(i).setName(newName);
				break;
			}
		}

		System.out.println(list);

		// 2. for-each문으로 수정
		System.out.println("== for-each문으로 수정 ==");
		for (ListDTO dto : list) {
			if (dto.getId() == updateId) {
				dto.setName(newName);
				break;
			}
		}
		System.out.println(list);
		
		// 3. Iterator 수정
		// 순차적으로 꺼낼 수 있게 도와줌
		System.out.println("== Iterator 수정 ==");
		Iterator<ListDTO> it = list.iterator();
		while (it.hasNext()) {
			ListDTO dto = it.next();
			if(dto.getId() == updateId) {
				dto.setName(newName);
				break;
			}
		}
		System.out.println(list);
		
		// 4. Stream 수정
		System.out.println("== Stream 수정 ==");
		list.stream()
			.filter(dto -> dto.getId() == updateId)
			.forEach(dto -> dto.setName(newName)); // dto : 매개변수 dto.setName(newName) : setName이란 값을 실행하겠다.
		System.out.println(list);
	}
}
