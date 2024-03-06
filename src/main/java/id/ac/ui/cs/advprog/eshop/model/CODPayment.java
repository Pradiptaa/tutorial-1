package id.ac.ui.cs.advprog.eshop.model;
import lombok.Getter;
import java.util.Map;

@Getter
public class CODPayment extends Payment {
    public CODPayment(String id, String method, Order order, Map<String, String> paymentData, String status) {
    }

    public CODPayment(String id, String method, Order order, Map<String, String> paymentData) {
    }
}