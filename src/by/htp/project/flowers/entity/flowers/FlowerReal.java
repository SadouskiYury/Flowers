package by.htp.project.flowers.entity.flowers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FlowerReal extends Flower {
	private String smell;
	private Date dateCut;

	public FlowerReal() {
		super();
	}

	public FlowerReal(String name, String color, int sizeLeaves, double price, String smell, Date dateCut) {
		super(name, color, sizeLeaves, price);
		this.smell = smell;
		this.dateCut = dateCut;
	}

	public String getSmell() {
		return smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

	public Date getDateCut() {
		return dateCut;
	}

	public void setDateCut(Date dateCut) {
		this.dateCut = dateCut;
	}

	@Override
	public String toString() {
		return "FlowerReal" + super.toString() + ", smell=" + smell + ", dateCut="
				+ new SimpleDateFormat("dd.MM.yy").format(dateCut) + "]";
	}

}
