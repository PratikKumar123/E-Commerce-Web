package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.Models.WomenProduct;

public class WomenDao {
	private List<WomenProduct> productList1;

	public List<WomenProduct> getProduct1() {

		WomenProduct p1 = new WomenProduct();
		p1.setWname("PRIYALIFASHION ");
		p1.setWdec(
				"Women Embroidered Viscose Rayon Straight Kurta  (Dark Green) ");
		p1.setWprice(900);
		p1.setWurl(
				"https://rukminim1.flixcart.com/image/832/832/kve530w0/shopsy-kurta/j/y/n/xl-n103-nayera-fashion-original-imag8ayzgxhtq87z.jpeg?q=70");

		WomenProduct p2 = new WomenProduct();
		p2.setWname("wedding Kurti");
		p2.setWdec("Women Printed Viscose Rayon Ethnic Dress  (Purple)");
		p2.setWprice(400);
		p2.setWurl("https://rukminim1.flixcart.com/image/832/832/xif0q/kurta/i/d/n/3xl-nsg-358-saabhi-original-imaghrb4t4wudgfp.jpeg?q=70");

		WomenProduct p3 = new WomenProduct();
		p3.setWname("Muslin Saree  (Black)");
		p3.setWdec(
				"Ombre, Digital Print, Polka Print, Geometric Print, Solid/Plain, Temple Border, Woven Chinnalapattu Organza, Muslin Saree  (Black)");
		p3.setWprice(10112);
		p3.setWurl("https://rukminim1.flixcart.com/image/832/832/kshtxu80/shopsy-sari/s/g/3/free-1077-red-dhnik-creation-unstitched-original-imag6fnksfymhcza.jpeg?q=70");

		WomenProduct p4 = new WomenProduct();
		p4.setWname("Silk Blend Saree");
		p4.setWdec(
				"Printed Bollywood Georgette, Silk Blend Saree  (Yellow)");

		p4.setWprice(6000);
		p4.setWurl("https://rukminim1.flixcart.com/image/832/832/xif0q/sari/a/u/c/free-foil-print-saree-women-thesiya-fab-unstitched-original-imaghsp6pgdcwbbs.jpeg?q=70");

		WomenProduct p5 = new WomenProduct();

		p5.setWname("Cotton Silk Saree");
		p5.setWdec("Striped Dharmavaram Cotton Silk Saree  (Magenta, Beige)");

		p5.setWprice(3000);
		p5.setWurl("https://rukminim1.flixcart.com/image/832/832/kc54ivk0/sari/v/a/4/free-n260aw-wine-villagius-unstitched-original-imaftc8tykjgr5uk.jpeg?q=70");

		WomenProduct p6 = new WomenProduct();

		p6.setWname("Lehenga Choli");
		p6.setWdec(
				"Floral Print Semi Stitched Lehenga Choli  (Blue)");

		p6.setWprice(1000);
		p6.setWurl("https://rukminim1.flixcart.com/image/832/832/kt7jv680/lehenga-choli/f/n/i/free-sleeveless-l8097-fashionuma-original-imag6hxffsx8hkgh.jpeg?q=70");

		WomenProduct p7 = new WomenProduct();
		p7.setWname("Line Gown");
		p7.setWdec(
				"Self Design Cotton Rayon Stitched Flared/A-line Gown  (Purple)");
		p7.setWprice(400);
		p7.setWurl("https://rukminim1.flixcart.com/image/832/832/xif0q/gown/9/5/v/na-l-short-sleeve-stitched-miss-10-miss-clothing-na-original-imagm6t72b5bzzgh.jpeg?q=70");

		productList1 = new ArrayList<WomenProduct>();
		productList1.add(p1);
		productList1.add(p2);
		productList1.add(p3);
		productList1.add(p4);
		productList1.add(p5);
		productList1.add(p6);
		productList1.add(p7);

		return productList1;
	}
}
