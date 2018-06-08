package by.htp.project.flowers.entity.flowers;

import by.htp.project.flowers.entity.bouquet.BouquetPart;

public class Flower extends BouquetPart {
	private String name;
	protected int sizeLeaves;

	public Flower() {

	}

	public Flower(String name, String color, int sizeLeaves, double price) {
		super(price, color);
		this.name = name;
		this.sizeLeaves = sizeLeaves;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getSizeLeaves() {
		return sizeLeaves;
	}

	public void setSizeLeaves(int sizeLeaves) {
		this.sizeLeaves = sizeLeaves;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", sizeLeaves=" + sizeLeaves + super.toString();
	}

}
