package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DelEx {

	public static void main(String[] args) {

		List<ListDTO> list = new ArrayList<ListDTO>();

		list.add(new ListDTO(10, "또라봉"));
		list.add(new ListDTO(20, "또지향"));
		list.add(new ListDTO(30, "또국향"));
		list.add(new ListDTO(40, "또로초"));

		int deleteId = 30; // 삭제할 번호

		// 1. 인덱스 기반 for문 삭제
		System.out.println("== for문 삭제 ==");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == deleteId) {
				list.remove(i);
				break;
			}
		}
		System.out.println(list);

		list.clear();

		list.add(new ListDTO(10, "또라봉"));
		list.add(new ListDTO(20, "또지향"));
		list.add(new ListDTO(30, "또국향"));
		list.add(new ListDTO(40, "또로초"));

		// 2. Iterator 삭제
		// List 같은 여러 데이터를 순차적으로 꺼낼 수 있게 도와주는 객체
		System.out.println("== Iterator 삭제 ==");
		Iterator<ListDTO> it = list.iterator();
		while (it.hasNext()) { // 다음 값이 있으면
			if (it.next().getId() == deleteId) { // 아이디 값을 가져오겠다
				it.remove();
			}
		}

		System.out.println(list);

		list.clear();

		list.add(new ListDTO(10, "또라봉"));
		list.add(new ListDTO(20, "또지향"));
		list.add(new ListDTO(30, "또국향"));
		list.add(new ListDTO(40, "또로초"));

		// 3. Stream 삭제 .removeIf()
		/*
		 * Stream
		 * List, Set, 배열 등 여러 데이터를 반복문 없이 처리 할 수 있도록 도와줌
		 * 메서드 체이닝 .method1().method2()
		 * 
		 * .filter(); 걸러냄
		 * .map(); 값 변환
		 * .forEach(); 각 요소들의 반복
		 * .findFirst(); 첫번째 값만 반환
		 * .sorted(); 정렬
		 * .collect(); 여러 데이터를 모아 새로운 컬랙션으로 반환
		 * */
		System.out.println("== Stream 삭제 ==");
		// 람다식 : 이름없는 함수로 한 줄로 표현, 매개변수 -> { 실행문 }
		list.removeIf(n -> n.getId() == deleteId);

		System.out.println(list);

		list.clear();
		
		list.add(new ListDTO(10, "또라봉"));
		list.add(new ListDTO(20, "또지향"));
		list.add(new ListDTO(30, "또국향"));
		list.add(new ListDTO(40, "또로초"));
		
		// 4. Stream + collect = 원본리스트는 그래도 두고 새로운 리스트로 반환
		System.out.println("== Stream + collect ==");
		List<ListDTO> newList = list.stream().filter(n -> n.getId() != deleteId)
				.toList();
				// n -> n.getId 리스트를 순회하면서
				// != deleteId : deleteId 와 같지 않은 값들을
				// .toList() : newList에 새로운 list로 모으겠다
		
		System.out.println("newlist = " + newList);
		System.out.println("list = " + list);
		
		
	}

}
