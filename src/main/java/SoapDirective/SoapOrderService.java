package SoapDirective;

import model.Order;
import model.Product;
import service.CreateOrderRequest;
import service.OrderInfoForApprobation;
import service.ResponseCreateOrder;
import service.ResponseOrderStatus;
import service.TouresBalonService;
import service.UpdateOrderStatus;
import service.ClientStatus;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Random;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/services/orders")
public class SoapOrderService {
	
    @EJB
    private TouresBalonService touresBalonService;

	final  String PLATINO = "PLATINO";
	final  String DORADO = "DORADO";
	final  String PLEATEADO = "PLATEADO";
	final int MONTO = 20000;
	private Random random = new Random();


	public SoapOrderService() {
		super();
	}

	@WebMethod(operationName = "createOrder", action = "createOrder")
	public ResponseCreateOrder createOrder(CreateOrderRequest createOrder)  {
		return handleCreateOrder(createOrder);
	}

	@WebMethod(operationName = "updateOrder", action = "updateOrder")
	public Boolean updateOrder(UpdateOrderStatus updateOrderStatus)  {
		return handleUpdateOrderStatus(updateOrderStatus);
	}

	@WebMethod(operationName = "validateClientStatusOperation", action = "validateClientStatusOperation")
	public Boolean validateClientStatusForOperation(ClientStatus clientStatus)  {
		return handleValidateClientStatus(clientStatus);
	}

	@WebMethod(operationName = "manualOrderValidation", action = "manualOrderValidation")
	public Boolean manualApprobation(OrderInfoForApprobation orderInfoForApprobation)  {
		boolean manualApprobation = random.nextBoolean();
		System.out.println("MANUAL APPROBATION:" + manualApprobation);
		return manualApprobation;
	}

	@WebMethod(operationName = "getProductById", action = "getProductById")
	public Product getProductById(int productId)  {
		return touresBalonService.getProductById(productId);
	}

	@WebMethod(operationName = "getOrderById", action = "getOrderById")
	public ResponseOrderStatus getOrderById(int orderId)  {
		return touresBalonService.getOrderById(orderId);
	}

	@WebMethod(operationName = "requestTransport", action = "requestTransport")
	public int requestTransport(int transportId)  {
		int cualquiera = random.nextInt();
		System.out.println("REQUEST TRASNPORT " + cualquiera);
		return random.nextInt();
	}

	@WebMethod(operationName = "requestHotel", action = "requestHotel")
	public int requestHotel(int hotelId)  {
		int cualquiera = random.nextInt();
		System.out.println("REQUEST HOTEL" + cualquiera);
		return random.nextInt();
	}

	@WebMethod(operationName = "requestEvent", action = "requestEvent")
	public int requestEvent(int eventId)  {
		int cualquiera = random.nextInt();
		System.out.println("REQUEST EVENT " + cualquiera);
		return random.nextInt();
	}

	@WebMethod(operationName = "payProduct", action = "payProduct")
	public int payProduct(int orderId)  {
		int cualquiera = random.nextInt();
		System.out.println("PAY ORDER" + cualquiera);
		return random.nextInt();
	}

	private ResponseCreateOrder handleCreateOrder(CreateOrderRequest createOrder) {
		System.out.println("handleCreateOrder");
		ResponseCreateOrder response = touresBalonService.createOrder(createOrder);
		return response;
	}

	private Boolean handleUpdateOrderStatus(UpdateOrderStatus updateOrderStatus) {
		System.out.println("handleUpdateOrderStatus");
		return  touresBalonService.updateOrderStatus(updateOrderStatus);
	}

	private Boolean handleValidateClientStatus(ClientStatus clientStatus) {
		System.out.println("handleValidateClientStatus");
		boolean result = false;
		if (PLATINO.equals(clientStatus.getTipoCliente())) {
			result = true;
		} else if (DORADO.equals(clientStatus.getTipoCliente()) && clientStatus.getMonto() <= MONTO) {
			result = true;
		}

		System.out.println("ESTADO DE APROBACION: " + result );
		return result;
	}
	 
}
