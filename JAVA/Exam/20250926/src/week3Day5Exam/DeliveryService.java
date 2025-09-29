package week3Day5Exam;

import java.util.List;

public class DeliveryService {

	private DeliveryDAO dao;
	private int nextId;

	public DeliveryService(DeliveryDAO dao) {
		this.dao = dao;
		this.nextId = getId();
	}

	// 읽어온 csv 파일에서 가장 큰 id 값 구하기
	private int getId() {
		int max = 0;
		for (DeliveryDTO dto : dao.findAll()) {
			if (dto.getId() > max)
				max = dto.getId();
		}
		return max;
	}

	// 제품 정보 저장
	public void saveAllOrder(String name, int price, int qty, int stock) {

		DeliveryDTO dto = new DeliveryDTO(nextId++, name, price, qty, stock);

		dto.setId(nextId);
		dto.setName(name);
		dto.setPrice(price);
		dto.setQty(qty);
		dto.setStock(stock);

		dao.save(dto);
	}

	// 리스트 null 확인
	public boolean emptyList() {
		return dao.findAll().isEmpty();
	}

	// 모든 제품 리스트 반환
	public List<DeliveryDTO> getAllDelivery() {
		return dao.findAll();
	}

	// id값 리스트 반환
	public DeliveryDTO findDeliveryById(int index) {
		return dao.findById(index);
	}

	// 개별 제품 삭제
	public boolean delDeliveryById(int index) {
		DeliveryDTO dto = dao.findById(index);
		if (dto == null)
			return false;

		boolean result = dao.deleteById(dto);
		if (result)
			dao.writeCsv();

		return result;
	}

	// 개별 제품 수정
	public boolean updateDeliveryById(DeliveryDTO order, String newName, int newPrice, int newQty, int newStock) {
		boolean result = dao.updateById(order, newName, newPrice, newQty, newStock);
		if (result)
			dao.writeCsv();
		return result;
	}

	// 제품 총 가격 조회
	public int getDeliveryTotal() {
		List<DeliveryDTO> item = getAllDelivery();

		int sum = 0;
		for (DeliveryDTO dto : item) {
			sum += dto.getPrice();
		}

		return sum;
	}

	// 제품 총 주문가능 수 조회
	public int getDeliveryqtyCnt() {
		List<DeliveryDTO> item = getAllDelivery();

		int qtyCnt = 0;
		for (DeliveryDTO dto : item) {
			qtyCnt += dto.getQty();
		}

		return qtyCnt;
	}

	// 제품 총 현재 재고 조회
	public int getDeliverystockCnt() {
		List<DeliveryDTO> item = getAllDelivery();

		int stockCnt = 0;
		for (DeliveryDTO dto : item) {
			stockCnt += dto.getStock();
		}

		return stockCnt;
	}
}
