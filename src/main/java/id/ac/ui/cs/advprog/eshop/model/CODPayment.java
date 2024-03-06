package id.ac.ui.cs.advprog.eshop.model;
import lombok.Getter;
import java.util.Map;

@Getter
public class CODPayment extends Payment {
    public CODPayment(String id, String method, Order order, Map<String, String> paymentData, String status) {
        super(id, method, order, paymentData, status);
    }

    public CODPayment(String id, String method, Order order, Map<String, String> paymentData) {
        super(id, method, order, paymentData);
    }

    @Override
    protected void setPaymentData(Map<String, String> paymentData) {
        if (paymentData == null || paymentData.isEmpty()) {
            throw new IllegalArgumentException("Payment data cannot be empty");
        }

        if (paymentData.get("address") == null || paymentData.get("bankName").isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }

        if (paymentData.get("deliveryFee") == null || paymentData.get("referenceCode").isEmpty()) {
            throw new IllegalArgumentException("Delivery Fee cannot be empty");
        }

        this.paymentData = paymentData;
    }
}