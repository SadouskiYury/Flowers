package by.htp.project.flowers.entity.bouquet;

import java.util.Arrays;
import java.util.Date;

import by.htp.project.flowers.entity.flowers.Flower;
import by.htp.project.flowers.entity.flowers.FlowerReal;

public class Bouquet {
	private BouquetPart[] bouquets;
	private int q = 0;
	private int size;

	public Bouquet() {

	}

	public Bouquet(int size) {
		bouquets = new BouquetPart[size];
		this.size = size;
	}

	public BouquetPart[] getBouquet() {
		return bouquets;
	}

	public BouquetPart getItem(int i) {
		return bouquets[i];
	}

	public void setBouquet(BouquetPart[] bouquet) {
		this.bouquets = bouquet;
	}

	@Override
	public String toString() {
		return "Bouquet [bouquet=" + Arrays.toString(bouquets) + "]";
	}

	public double getPrice() {
		double x = 0;
		for (int i = 0; i < bouquets.length; i++) {
			x += bouquets[i].getPrice();
		}
		return x;
	}

	public void showBouquet() {
		for (int i = 0; i < bouquets.length; i++) {
			System.out.print(bouquets[i] + "\n");
		}
		System.out.println();
	}

	public BouquetPart[] findeFlowerSizeLeavesBetween(int x, int y) {
		int count = 0;
		for (int e = 0; e < bouquets.length; e++) {
			if (bouquets[e] instanceof Flower) {
				if (((Flower) bouquets[e]).getSizeLeaves() > x && ((Flower) bouquets[e]).getSizeLeaves() < y) {
					count++;
				}
			}
		}
		BouquetPart[] findFlower = new BouquetPart[count];
		int j = 0;
		for (int i = 0; i < bouquets.length; i++) {
			if (bouquets[i] instanceof Flower) {
				if (((Flower) bouquets[i]).getSizeLeaves() > x && ((Flower) bouquets[i]).getSizeLeaves() < y) {
					findFlower[j] = bouquets[i];
					j++;
				}
			}
		}
		return findFlower;
	}

	public void addBouquetPart(BouquetPart name) {
		if (q < bouquets.length)
			bouquets[q] = (BouquetPart) name;
		q++;

	}

	public void sortBouquet() {
		for (int i = 0; i < bouquets.length; i++) {
			for (int j = i + 1; j < bouquets.length; j++) {
				if (bouquets[j].getClass().equals(FlowerReal.class)) {

					if (((FlowerReal) bouquets[j]).getDateCut()
							.compareTo(((FlowerReal) bouquets[i]).getDateCut()) < 0) {

						BouquetPart[] tmp = new BouquetPart[1];
						tmp[0] = bouquets[i];
						bouquets[i] = bouquets[j];
						bouquets[j] = tmp[0];

					}
				}
			}
		}
	}
}
