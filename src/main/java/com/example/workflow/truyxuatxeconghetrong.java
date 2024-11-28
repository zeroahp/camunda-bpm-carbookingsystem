package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class truyxuatxeconghetrong implements JavaDelegate {
    private static final tempQuantity tempQuantity = new tempQuantity();

    public void execute(DelegateExecution execution) throws Exception {
        String username = (String) execution.getVariable("username");
        String bustype = (String) execution.getVariable("bustype");
        String busroute = (String) execution.getVariable("busroute");
        String phonenumber = (String) execution.getVariable("phonenumber");
        String schedule = (String) execution.getVariable("schedule");
        int quantity = (int) execution.getVariable("quantity");

        if(schedule != null && schedule.equals("0h-5h")){
            tempQuantity.setTempQuantity(quantity);
            execution.setVariable("quantity", 0);
        }else {
            if(quantity != 0){
                execution.setVariable("quantity", quantity);
            }else {
                execution.setVariable("quantity", tempQuantity.getTempQuantity());
                tempQuantity.setTempQuantity(0);
            }
        }

        System.out.println("Xin chào: " +username);
        System.out.println("Bạn đã chọn loại xe: " +bustype + ", cho tuyến đường: " + busroute);
        System.out.println("Khung giờ: " + schedule);
    }
}
