package by.htp.project.flowers.entity.bouquet.Accesessories;

public class Bow extends Acсesessories {
	private String type;

	public Bow() {

	}

	public Bow(String material, String color, double price, String type) {
		super(material, color, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Acсesessories Bow [type=" + type + super.toString();
	}

}
