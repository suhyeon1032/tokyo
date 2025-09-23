package ch3;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	List<ProductDTO> productList = new ArrayList<ProductDTO>();
	
	public void save(ProductDTO dto) {
		productList.add(dto);
	}
	
	public List<ProductDTO> findAll() {
		return productList;
	}

	public ProductDTO findProcudt(int n) {
		return productList.get(n);
	}

}
