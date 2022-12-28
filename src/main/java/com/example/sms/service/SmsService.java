package com.example.sms.service;


import com.aliyuncs.exceptions.ClientException;

public interface SmsService {
    /**
     * 发送短信接口
     * @param phoneNumber
     * @param randomCode
     * @return
     */
    boolean sendSms(String phoneNumber, String randomCode) throws ClientException;
}

