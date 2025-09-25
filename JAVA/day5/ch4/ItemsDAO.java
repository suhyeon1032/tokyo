package ch4;

import java.util.ArrayList;
import java.util.List;

public class ItemsDAO {
	// ItemsDTO 데이터 저장소
	private List<ItemsDTO> itemsList = new ArrayList<ItemsDTO>();

	public void save(ItemsDTO dto) {
		itemsList.add(dto);
	}

	public List<ItemsDTO> findAll() {
		return itemsList;
	}

	public ItemsDTO findById(int index) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).getId() == index) {
				return itemsList.get(i);
			}
		}
		return null;
	}

	public boolean delectById(int index) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).getId() == index) {
				itemsList.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updateById(int index, String newName, int newQty, int newPrice) {
		ItemsDTO dto = findById(index);
		if (dto != null) {
			dto.setName(newName);
			dto.setQty(newQty);
			dto.setPrice(newPrice);
			return true;
		} else return false;
	}
	

}
