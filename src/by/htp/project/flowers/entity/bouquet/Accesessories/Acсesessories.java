package by.htp.project.flowers.entity.bouquet.Accesessories;

import by.htp.project.flowers.entity.bouquet.BouquetPart;

public class Acсesessories extends BouquetPart {
	private String material;

	public Acсesessories() {
		super();
	}

	public Acсesessories(String material, String color, double price) {
		super(price, color);
		this.material = material;

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return ", material=" + material + super.toString() + "]";
	}

}
