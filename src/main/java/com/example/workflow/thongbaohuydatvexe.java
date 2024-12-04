package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class thongbaohuydatvexe implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("===================================================================");
        System.out.println("                             HỦY ĐẶT VÉ                           ");
        System.out.println("===================================================================");
        System.out.println("THÔNG BÁO: Quá trình đặt vé đã bị hủy.");
        System.out.println("Xin cảm ơn và hẹn gặp lại quý khách!");
        System.out.println("===================================================================");
    }
}
