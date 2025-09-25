package ch3;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	// 데이터 저장소
	private List<ProductDTO> productList = new ArrayList<ProductDTO>();
	
	// 상품 추가
	public void save(ProductDTO dto) {
		productList.add(dto);
	}
	
	// 전체 상품 리스트 반환
	public List<ProductDTO> findAll() {
		return productList;
	}

	// 상품 데이터 삭제
	public boolean deleteById(int id) {
		/*
		// for-each .remove
		// 리스트를 직접 삭제하기 때문에 내부적으로 반복자와 리스트 크기가 달라져 오류 발생
		for (ProductDTO dto : productList) {
			if (dto.getId() == id) { // 배열의 id값이 매개변수 id 값과 일치
				productList.remove(dto); //  데이터를 삭제하라
				return true; // 데이터를 삭제하면 return true 반환하고 for문 종료
			}
		}
		*/
		// 삭제 시 인덱스 기반 for 사용. 반복 인덱스를 직접 관리하기 때문에 리스트의 크기가 변해도 안전
		for(int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getId() == id) {
				productList.remove(i);
				return true;
			}
		}
		return false; 
	}

	public ProductDTO selectById(int n) { // 개별 상품 반환
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getId() == n) {
				return productList.get(i);
			}
		}
		return null;
	}

	// 상품 내역 업데이트
	public boolean updateById(int id, String newName, int newQty, int newPrice) { 
		ProductDTO dto = selectById(id);
		if (dto != null) {
			dto.setName(newName);
			dto.setQty(newQty);
			dto.setPrice(newPrice);
			return true;
		} else return false;
	}
}
