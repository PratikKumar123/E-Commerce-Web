package com.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Models.AddProduct;

public class ProductDao {

	private List<AddProduct> productList;
	
	public List<AddProduct> getProduct(){
		
		AddProduct p1 = new AddProduct();
		p1.setProductId("101");
		p1.setPname("Kurta");
		p1.setPdec("Custom Mirror Embroidered Kurta For Men Indian Kurta wedding Sherwani groom Sherwani Indian wedding Suit kurta for boys ");
		p1.setPgender("Male");
		p1.setPprice(400);
		p1.setPurl("https://rukminim1.flixcart.com/image/300/300/xif0q/kurta/y/x/p/m-kcku-only-kurta-print-orfi-fubar-original-imaggtqrdbhhcfas.jpeg?q=90");
		
		
		
		AddProduct p2 = new AddProduct();
		p2.setProductId("102");
		p2.setPname("wedding kurta");
		p2.setPdec("Handmade chicken carry kurta, wedding kurta,mens kurta,ethnic kurta,men kurta for men,");
		p2.setPgender("Male");
		p2.setPprice(400);
		p2.setPurl("https://i.etsystatic.com/35870620/r/il/af40a9/3953200872/il_794xN.3953200872_4lpu.jpg");
		
		AddProduct p3 = new AddProduct();
		p3.setProductId("103");
		p3.setPname("Iron Man T shirt");
		p3.setPdec("Marvel Iron Man Classic Retro Comic Vintage Cover Graphic T-Shirt Unisex Tee Adult T-shirt Kid Shirt Long Sleeve Sweatshirt Women's Tank");
		p3.setPgender("Male");
		p3.setPprice(10112);
		p3.setPurl("https://i.etsystatic.com/31602485/r/il/16ade1/4068254751/il_794xN.4068254751_n089.jpg");
		
		AddProduct p4 = new AddProduct();
		p4.setProductId("104");
		p4.setPname(" HANSMAYA shirts");
		p4.setPdec("HANDCRAFTED & HAND PRINTED Unisex 100% Organic Cotton Short Sleeve Regular Fit,Summer Clothing, Stylish Shirt, , Elegant Short Sleeve Shirt");
		p4.setPgender("Male");
		p4.setPprice(6000);
		p4.setPurl("https://i.etsystatic.com/37701302/r/il/a707c4/4268628829/il_1140xN.4268628829_tswo.jpg");
		
		
		AddProduct p5 = new AddProduct();
		p5.setProductId("105");
		p5.setPname("Cotton Shrit");
		p5.setPdec("Mens 100% Cotton Short Sleeve regular fit shirt , Indian print , Hand printed .");
		p5.setPgender("Male");
		p5.setPprice(3000);
		p5.setPurl("https://i.etsystatic.com/24764330/r/il/636d14/3491439002/il_794xN.3491439002_t568.jpg");
		
		
		AddProduct p6 = new AddProduct();
		p6.setProductId("106");
		p6.setPname("Elegant Short Sleeve Shirt");
		p6.setPdec("HANDCRAFTED & HAND PRINTED Unisex 100% Organic Cotton Short Sleeve Regular Fit,Summer Clothing, Stylish Shirt, , Elegant Short Sleeve Shirt,");
		p6.setPgender("Male");
		p6.setPprice(1000);
		p6.setPurl("https://i.etsystatic.com/37701302/r/il/ee8cc2/4268615659/il_794xN.4268615659_19vg.jpg");
		
		
		AddProduct p7 = new AddProduct();
		p7.setProductId("107");
		p7.setPname("Casual Beach Shirt");
		p7.setPdec("HANDCRAFTED HAND PRINTED Unisex Shirts Hawaiian Shirt Button Down Shirts Cotton Casual Beach Summer Outfits Cool & Stylish Tropical Wear");
		p7.setPgender("Male");
		p7.setPprice(400);
		p7.setPurl("https://i.etsystatic.com/37701302/r/il/41d0ea/4268187139/il_794xN.4268187139_fm1g.jpg");
		
		productList=new ArrayList<AddProduct>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		
		return productList;
		
		
		
	}
	public AddProduct getprobyId(String prodId)  throws IOException{
		
		for(AddProduct pro : getProduct()) {
			if(pro.getProductId().equals(prodId)) {
				return pro;
			}
		}
		throw new IOException("Product NOT FOUND");
	}
}
