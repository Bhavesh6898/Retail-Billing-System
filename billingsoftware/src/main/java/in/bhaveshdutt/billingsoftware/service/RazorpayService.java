package in.bhaveshdutt.billingsoftware.service;

import com.razorpay.RazorpayException;

import in.bhaveshdutt.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;

}
