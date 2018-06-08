package by.htp.project.flowers.entity.bouquet.Accesessories;

public class Pack extends Acсesessories {
	private String size;

	public Pack() {

	}

	public Pack(String material, String color, double price, String size) {
		super(material, color, price);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Acсesessories Pack [size=" + size + super.toString();
	}

}
