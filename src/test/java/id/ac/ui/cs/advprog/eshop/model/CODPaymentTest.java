package id.ac.ui.cs.advprog.eshop.model;
import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CODPaymentTest {
    Map<String, String> paymentData;
    private Order order;
    private List<Product> products;

    @BeforeEach
    void setup() {
        this.paymentData = new HashMap<>();

        products = new ArrayList<>();
        Product product1 = new Product();
        product1.setProductId("e45d7d21-fd29-4533-a569-abbe0819579a");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(2);
        products.add(product1);

        Product product2 = new Product();
        product2.setProductId("8a76b99c-a0b3-46d2-a688-4c1831b21119");
        product2.setProductName("Sabun Cap Usep");
        product2.setProductQuantity(1);
        products.add(product2);

        order= new Order(
                "dbd4aff4-9a7f-4603-92c2-eaf529271cc9",
                products,
                1708560000L,
                "Safira Sudrajat"
        );

        paymentData.put("address", "Jakarta");
        paymentData.put("deliveryFee", "1234567890");
    }

    @Test
    void testCreateCODPaymentPendingStatus() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        assertSame(order, payment.getOrder());
        assertEquals(paymentData, payment.getPaymentData());
        assertEquals("e45d7d21-fd29-4533-a569-abbe0819579a", payment.getId());
        assertEquals(PaymentMethod.CASH.getValue(), payment.getMethod());
        assertEquals(PaymentStatus.PENDING.getValue(), payment.getStatus());
    }

    @Test
    void testCreateCODPaymentSuccessStatus() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData,
                PaymentStatus.SUCCESS.getValue()
        );
        assertSame(order, payment.getOrder());
        assertEquals(paymentData, payment.getPaymentData());
        assertEquals("e45d7d21-fd29-4533-a569-abbe0819579a", payment.getId());
        assertEquals(PaymentMethod.CASH.getValue(), payment.getMethod());
        assertEquals(PaymentStatus.SUCCESS.getValue(), payment.getStatus());
    }

    @Test
    void testCreateCODPaymentRejectedStatus() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData,
                PaymentStatus.REJECTED.getValue()
        );
        assertSame(order, payment.getOrder());
        assertEquals(paymentData, payment.getPaymentData());
        assertEquals("e45d7d21-fd29-4533-a569-abbe0819579a", payment.getId());
        assertEquals(PaymentMethod.CASH.getValue(), payment.getMethod());
        assertEquals(PaymentStatus.REJECTED.getValue(), payment.getStatus());
    }

    @Test
    void testCreateCODPaymentInvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData,
                    "MEOW"
            );
        });
    }

    @Test
    void testCreateCODPaymentNullStatus() {
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData,
                    null
            );
        });
    }

    @Test
    void testSetCODPaymentStatStatusToSuccess() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        payment.setStatus(PaymentStatus.SUCCESS.getValue());
        assertEquals(PaymentStatus.SUCCESS.getValue(), payment.getStatus());
    }

    @Test
    void testSetCODPaymentStatStatusToRejected() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        payment.setStatus(PaymentStatus.REJECTED.getValue());
        assertEquals(PaymentStatus.REJECTED.getValue(), payment.getStatus());
    }

    @Test
    void testSetCODPaymentStatStatusToPending() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        payment.setStatus(PaymentStatus.PENDING.getValue());
        assertEquals(PaymentStatus.PENDING.getValue(), payment.getStatus());
    }

    @Test
    void testSetCODPaymentStatStatusToInvalid() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        assertThrows(IllegalArgumentException.class, () -> {
            payment.setStatus("MEOW");
        });
    }

    @Test
    void testSetCODPaymentStatStatusToNull() {
        Payment payment = new CODPayment(
                "e45d7d21-fd29-4533-a569-abbe0819579a",
                PaymentMethod.CASH.getValue(),
                order,
                paymentData
        );
        assertThrows(IllegalArgumentException.class, () -> {
            payment.setStatus(null);
        });
    }

    @Test
    void testCreateCODPaymentWithNullOrder() {
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    null,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithEmptyPaymentData() {
        paymentData.clear();
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithNullPaymentData() {
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    null
            );
        });
    }

    @Test
    void testCreateCODPaymentInvalidAddress() {
        paymentData.put("address", "");
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentInvalidDeliveryFee() {
        paymentData.put("deliveryFee", "");
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithNullAddress() {
        paymentData.put("address", null);
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithNullDeliveryFee() {
        paymentData.put("deliveryFee", null);
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithInvalidAddressAndDeliveryFee() {
        paymentData.put("address", "");
        paymentData.put("deliveryFee", "");
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }

    @Test
    void testCreateCODPaymentWithNullAddressAndDeliveryFee() {
        paymentData.put("address", null);
        paymentData.put("deliveryFee", null);
        assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Payment payment = new CODPayment(
                    "e45d7d21-fd29-4533-a569-abbe0819579a",
                    PaymentMethod.CASH.getValue(),
                    order,
                    paymentData
            );
        });
    }
}