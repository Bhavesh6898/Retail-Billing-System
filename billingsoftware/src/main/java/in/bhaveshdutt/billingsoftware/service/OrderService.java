package in.bhaveshdutt.billingsoftware.service;

import java.time.LocalDate;
import java.util.List;

import in.bhaveshdutt.billingsoftware.io.OrderRequest;
import in.bhaveshdutt.billingsoftware.io.OrderResponse;
import in.bhaveshdutt.billingsoftware.io.PaymentVerificationRequest;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();

}
