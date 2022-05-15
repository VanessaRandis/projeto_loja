package lojaProdutos.dadosProdutos;

import java.util.Date;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status_product;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status_product) {
	
		this.id = id;
		this.moment = moment;
		this.status_product = status_product;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus_product() {
		return status_product;
	}
	public void setStatus_product(OrderStatus status_product) {
		this.status_product = status_product;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status_product=" + status_product + "]";
	}
	
	

}
