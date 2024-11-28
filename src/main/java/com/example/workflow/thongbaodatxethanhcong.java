package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class thongbaodatxethanhcong implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String totalcost = (String)execution.getVariable("totalcost");
        String payment = (String) execution.getVariable("payment");
        int quantity = (int) execution.getVariable("quantity");

        System.out.println("Xác nhận đặt xe thành công");
        System.out.println("Số vé đã đặt là: " + quantity);
        System.out.println("Tổng tiền cần phải thanh toán là: " + totalcost);
        System.out.println("Quý khách đã lựa chọn phương thức thanh toán là: " + payment);
        if(payment.equals("Chuyển khoản ngân hàng")){
            System.out.println("Quý khách vui lòng thực hiện thanh toán trực tuyến.");
        }else if(payment.equals("Tiền mặt")){
            System.out.println("Quý khách vui lòng đến quầy để thực hiện thanh toán.");
        }
        System.out.println("Xin cảm ơn và hẹn gặp lại quý khách!");

    }
}