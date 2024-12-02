package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.text.DecimalFormat;

public class thongbaothanhtoanthatbaivahuydatxe implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {

        int quantity = (int) execution.getVariable("quantity");
        String username = (String) execution.getVariable("username");
        String busroute = (String) execution.getVariable("busroute");
        String phonenumber = (String) execution.getVariable("phonenumber");
        String schedule = (String) execution.getVariable("schedule");

        System.out.println("===================================================================");
        System.out.println("                             HỦY ĐẶT VÉ                           ");
        System.out.println("===================================================================");
        System.out.println("THÔNG BÁO: Quá trình đặt vé đã bị hủy do quý khách không thanh toán.");
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
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Quý khách vui lòng liên hệ lại để đặt vé mới nếu cần.");
        System.out.println("Xin cảm ơn và hẹn gặp lại quý khách!");
        System.out.println("===================================================================");
    }

}
