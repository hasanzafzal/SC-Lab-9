import java.util.*;

class Order
{
    String customerName;
    String restaurantName;
    double orderAmount;

    public Order(String customerName, String restaurantName, double orderAmount)
    {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.orderAmount = orderAmount;
    }
}

class InvoiceService
{
    public void generateInvoice(Order order)
    {
        System.out.println("Invoice generated for " + order.customerName + ": Rs." + order.orderAmount);
    }
}

class NotificationService
{
    public void notifyDriver(String driverName, String message)
    {
        System.out.println("Driver " + driverName + " notified: " + message);
    }
}

class DeliveryService
{
    private InvoiceService invoiceService;
    private NotificationService notificationService;
    public DeliveryService(InvoiceService invoiceService, NotificationService notificationService)
    {
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order, String driverName)
    {
        System.out.println("Processing order for " + order.customerName + "...");
        invoiceService.generateInvoice(order);
        notificationService.notifyDriver(driverName, "New delivery for " + order.restaurantName);
    }
}

public class Task1
{
    public static void main(String[] args)
    {
        Order order = new Order("Hasan", "Chaklala Cantt.", 1950);
        InvoiceService invoice = new InvoiceService();
        NotificationService notifier = new NotificationService();
        DeliveryService delivery = new DeliveryService(invoice, notifier);

        delivery.processOrder(order, "Abdullah");
    }
}