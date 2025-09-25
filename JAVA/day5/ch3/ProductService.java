package ch3;

import java.util.List;

public class ProductService {
	
	private ProductDAO dao;

	// dao 생성자
	public ProductService(ProductDAO dao) {
		this.dao = dao;
	}

	int nextId = 0; // 상품 id 값
	// 상품 등록
	public void saveAllProduct(String name, int qty, int price) {
		ProductDTO dto = new ProductDTO(nextId++, name, qty, price);
		
		List<ProductDTO> product = getAllProduct();
		
		dto.setId(nextId);
		dto.setName(name);
		dto.setQty(qty);
		dto.setPrice(price);
		
		dao.save(dto); // dao에 있는 save 메서드에서 List에 차곡차곡 저장됨
	}

	// 모든 리스트 출력
	public List<ProductDTO> getAllProduct() {
		return dao.findAll();
	}

	// 개별 상품 조회
	public  ProductDTO findProduct(int n) {
		return dao.selectById(n);
	}

	// 총 상품 갯수 조회
	public int getProductCnt() {
		List<ProductDTO> product = getAllProduct();
		int qtySum = 0 ;
		for (ProductDTO dto : product) {
			qtySum += dto.getQty();
		}
		return qtySum;
	}

	// 총 금액 조회
	public int getProductTotal() {
		List<ProductDTO> product = getAllProduct();
		
		int sum = 0;
		
		for (ProductDTO dto : product) {
			sum += dto.getPrice();
		}
		return sum;
	}

	public boolean deleteRowProduct(int id) {
		return dao.deleteById(id);
	}

	public boolean updateProductById(int id, String newName, int newQty, int newPrice) {
		return dao.updateById(id, newName, newQty, newPrice);
		
	}
	
	
	
	
	

}
