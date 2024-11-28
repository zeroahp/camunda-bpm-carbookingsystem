package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class thongbaokhongcoxe implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String schedule = (String) delegateExecution.getVariable("schedule");
        System.out.println("Xin lỗi quý khách hiện tại khung giờ: " + schedule + " đã hết vé, vui lòng chọn khung giờ khác!");
    }
}
