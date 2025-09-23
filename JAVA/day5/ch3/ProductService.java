package ch3;

import java.util.List;

public class ProductService {
	
	private ProductDAO dao;

	public ProductService(ProductDAO dao) {
		this.dao = dao;
	}

	public void addProduct(String name, int qty, int price) {
		ProductDTO dto = new ProductDTO(name, qty, price);
		
		List<ProductDTO> product = getAllProduct();
		
		int id = product.size()+1;
		
		dto.setId(id);
		dto.setName(name);
		dto.setQty(qty);
		dto.setPrice(price);
		
		dao.save(dto);
	}

	public List<ProductDTO> getAllProduct() {
		return dao.findAll();
	}

	public  ProductDTO findProduct(int n) {
		return dao.findProcudt(n);
	}

	public int getProductCnt() {
		List<ProductDTO> product = getAllProduct();
		int qtySum = 0 ;
		for (ProductDTO dto : product) {
			qtySum += dto.getQty();
		}
		return qtySum;
	}

	public int getProductTotal() {
		List<ProductDTO> product = getAllProduct();
		
		int sum = 0;
		
		for (ProductDTO dto : product) {
			sum += dto.getPrice();
		}
		return sum;
	}
	
	
	
	
	

}
