package com.example.workflow;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.text.DecimalFormat;

public class thongbaodatvexethanhcong implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        int quantity = (int) execution.getVariable("quantity");
        double totalcost = (double) execution.getVariable("totalcost") * quantity;
        DecimalFormat df = new DecimalFormat("#,##0.000");
        String formattedTotalCost = df.format(totalcost);

        String payment = (String) execution.getVariable("payment");
        String username = (String) execution.getVariable("username");
        String busroute = (String) execution.getVariable("busroute");
        String phonenumber = (String) execution.getVariable("phonenumber");
        String schedule = (String) execution.getVariable("schedule");

        System.out.println("===================================================================");
        System.out.println("                       ĐẶT VÉ XE THÀNH CÔNG                       ");
        System.out.println("===================================================================");
        System.out.println("THÔNG BÁO: Quý khách đã đặt xe thành công!");
        System.out.println();
        System.out.println("Thông tin khách hàng:");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("| %-20s | %-40s |\n", "Họ tên", username);
        System.out.printf("| %-20s | %-40s |\n", "Số điện thoại", phonenumber);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Thông tin chuyến đi:");
        System.out.printf("| %-20s | %-40s |\n", "Tuyến xe", busroute);
        System.out.printf("| %-20s | %-40s |\n", "Khung giờ", schedule);
        System.out.printf("| %-20s | %-40d |\n", "Số vé đã đặt", quantity);
        System.out.printf("| %-20s | %-40s |\n", "Tổng tiền", formattedTotalCost + " VND");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("| %-20s | %-40s |\n", "Phương thức thanh toán", payment);
        System.out.println("-------------------------------------------------------------------");

        if ("Chuyển khoản ngân hàng".equals(payment)) {
            System.out.println("Quý khách vui lòng thực hiện thanh toán trực tuyến.");
        } else if ("Tiền mặt".equals(payment)) {
            System.out.println("Quý khách vui lòng đến quầy để thực hiện thanh toán.");
        }

        System.out.println();
        System.out.println("Xin cảm ơn và hẹn gặp lại quý khách!");
        System.out.println("===================================================================");
    }
}

