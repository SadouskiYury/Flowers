package by.htp.project.flowers.entity.flowers;

public class FlowerImitation extends Flower {
	private String type;

	public FlowerImitation() {
		super();
	};

	public FlowerImitation(String name, String color, int sizeLeaves, double price, String type) {
		super(name, color, sizeLeaves, price);
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
		return "FlowerImitation" + super.toString() + ", type=" + type+"]";
	}

}
