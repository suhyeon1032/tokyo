package ch4;

import java.util.List;

public class ItemsService {
	
	private ItemsDAO dao;
	private int nextId;

	public ItemsService(ItemsDAO dao) {
		this.dao = dao;
		this.nextId = getId();
	}
	

	// 읽어온 파일에서 가장 큰 상품번호 구하기
	private int getId() {
		int max = 0;
		for(ItemsDTO dto : dao.findAll()) {
			if (dto.getId() > max) max =  dto.getId();
		}
		return max;
	}


	// 상품 등록
	public void saveAllItems(String name, int qty, int price) {
		ItemsDTO dto = new ItemsDTO(nextId++, name, qty, price);
		
		dto.setId(nextId);
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
