package by.htp.project.flowers.run;

import java.util.Date;

import by.htp.project.flowers.entity.bouquet.Bouquet;
import by.htp.project.flowers.entity.bouquet.BouquetPart;
import by.htp.project.flowers.entity.bouquet.Accesessories.Acсesessories;
import by.htp.project.flowers.entity.bouquet.Accesessories.Bow;
import by.htp.project.flowers.entity.bouquet.Accesessories.Pack;
import by.htp.project.flowers.entity.bouquet.Accesessories.Tape;
import by.htp.project.flowers.entity.flowers.Flower;
import by.htp.project.flowers.entity.flowers.FlowerImitation;
import by.htp.project.flowers.entity.flowers.FlowerReal;

public class Main {

	public static void main(String[] args) {

		/*
		 * Цветочница. Определить иерархию цветов. Создать несколько объек- тов-цветов.
		 * Собрать букет (используя аксессуары) с определением его стоимости. Провести
		 * сортировку цветов в букете на основе уровня све- жести. Найти цветок в
		 * букете, соответствующий заданному диапазону длин стеблей
		 */

		@SuppressWarnings("deprecation")
		Flower real = new FlowerReal("Rose", "red", 8, 10.00, "vanil", new Date(2018, 4, 25));
		@SuppressWarnings("deprecation")
		Flower real1 = new FlowerReal("Gvozdika", "white", 7, 8.00, "smoke", new Date(18, 4, 7));
		@SuppressWarnings("deprecation")
		Flower real2 = new FlowerReal("Hrizantema", "pink", 3, 11.00, "honey", new Date(18, 2, 20));
		Flower im = new FlowerImitation("Romaska", "white", 7, 3.00, "short");
		Flower im1 = new FlowerImitation("Grass", "green", 17, 1.00, "high");
		Acсesessories a = new Tape("sintetic", "purple", 0.75, 55);
		Acсesessories a1 = new Bow("cotton", "blue", 0.15, "simple");
		Acсesessories a2 = new Pack("papery", "clear", 0.25, "big");

		Bouquet flower = new Bouquet(8);
		flower.addBouquetPart(real);
		flower.addBouquetPart(real1);
		flower.addBouquetPart(real2);
		flower.addBouquetPart(im);
		flower.addBouquetPart(im1);
		flower.addBouquetPart(a);
		flower.addBouquetPart(a1);
		flower.addBouquetPart(a2);
		flower.showBouquet();

		BouquetPart[] find = flower.findeFlowerSizeLeavesBetween(3, 10);
		Bouquet findSize = new Bouquet();
		findSize.setBouquet(find);
		findSize.showBouquet();

		flower.sortBouquet();
		flower.showBouquet();

	}

}
