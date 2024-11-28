package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class thongbaothanhtoanthatbaivahuydatxe implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Do quý khách không thanh toán, quá trình đặt vé sẽ tự động bị hủy bỏ.");
        System.out.println("Hẹn gặp lại quý khách!");

    }
}
