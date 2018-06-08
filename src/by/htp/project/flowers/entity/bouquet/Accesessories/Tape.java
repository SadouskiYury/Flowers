package by.htp.project.flowers.entity.bouquet.Accesessories;

public class Tape extends Acсesessories {
	private int lengh;

	public Tape() {

	}

	public Tape(String material, String color, double price, int lengh) {
		super(material, color, price);
		this.lengh = lengh;
	}

	public int getLengh() {
		return lengh;
	}

	public void setLengh(int lengh) {
		this.lengh = lengh;
	}

	@Override
	public String toString() {
		return "Acсesessories Tape[lengh=" + lengh + super.toString();
	}

}
