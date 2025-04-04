package secao12;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class appEnum {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		//Conversão de String para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("Delivered"); //usa valueOf para a conversão
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
