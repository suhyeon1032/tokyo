package ch4;

import java.util.Iterator;
import java.util.List;

public class ItemsService {
	
	private ItemsDAO dao;

	public ItemsService(ItemsDAO dao) {
		this.dao = dao;
	}

	// 상품 등록
	int indexId = 0;
	public void saveAllItems(String name, int qty, int price) {
		ItemsDTO dto = new ItemsDTO(indexId++, name, qty, price);
		
		dto.setId(indexId);
		dto.setName(name);
		dto.setQty(qty);
		dto.setPrice(price);
		
		dao.save(dto);
	}
	
	// 전체 상품 리스트 조회
	public List<ItemsDTO> getAllItems() {
		return dao.findAll();
	}

	// 개별 상품 조회
	public ItemsDTO findItemById(int index) {
		return dao.findById(index);
	}

	// 개별 상품 삭제
	public boolean deleteItemById(int index) {
		return dao.delectById(index);
	}

	public boolean updateItemById(int index, String newName, int newQty, int newPrice) {
		return dao.updateById(index, newName, newQty, newPrice);
	}

	// 아이템 총 갯수 조회
	public int getItemsCnt() {
		List<ItemsDTO> item = getAllItems();
		int qtySum = 0;
		for (ItemsDTO dto : item) {
			qtySum += dto.getQty();
		}
		return qtySum;
	}

	// 아이템 총 가격 조회
	public int getItemsTotal() {
		List<ItemsDTO> item = getAllItems();
		
		int sum = 0;
		for (ItemsDTO dto : item) {
			sum += dto.getPrice();
		}
		return sum;
	}
	
	

}
