package com.imaginea.language.domainmodel;

public class SaleTransaction {
	private long Id;
	private Product product;
	private Sale sale;
	private TimePeriod period;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public TimePeriod getPeriod() {
		return period;
	}

	public void setPeriod(TimePeriod period) {
		this.period = period;
	}

}
