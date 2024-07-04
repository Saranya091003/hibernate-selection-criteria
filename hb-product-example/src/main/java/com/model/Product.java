package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="product")
public class Product {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "sno")
		private int sno;
		@Column(name = "pname")
		private String pname;
		@Column(name = "qty")
		private int qty;
		@Column(name = "price")
		private int price;
		public Product() {}
		public Product(int sno, String pname,  int qty, int price) {
			super();
			this.sno = sno;
			this.pname = pname;
			this.qty = qty;
			this.price = price;
		}
		
		
		public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public int getQty() {
			return qty;
		}
		
		public void setQty() {
			this.qty = qty;
		}
		 
		public int getPrice() {
			return price;
		}
		
		public void setPrice() {
			this.price =price;
		}
}
