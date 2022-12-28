package com.example.sms;

import com.aliyuncs.exceptions.ClientException;
import com.example.sms.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmsApplicationTests {

    @Autowired
    private SmsService service;

    @Test
    void contextLoads() throws ClientException {
        String code = String.valueOf((int) (Math.random() * 10000 + 10000)).substring(1);
        service.sendSms("15159292762",code);
    }

}
