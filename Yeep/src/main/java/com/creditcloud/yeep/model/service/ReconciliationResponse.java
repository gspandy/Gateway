/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class ReconciliationResponse extends BaseResponse {
    
    //记录列表
    @NotNull
    private String bizType;
    
    //业务类型,枚举值:
    @NotNull
    private List<record> records;
    
    //易宝收取手续费
    @NotNull
    private String fee;
    
    //商户平台收取分润
    @NotNull
    private String balance;
    
    //业务金额
    @NotNull
    private String amount;

    public ReconciliationResponse() {
    }

    public ReconciliationResponse(String bizType, List<record> records, String fee, String balance, String amount) {
        this.bizType = bizType;
        this.records = records;
        this.fee = fee;
        this.balance = balance;
        this.amount = amount;
    }

    public String getBizType() {
        return bizType;
    }

    @XmlElementWrapper(name="records")
    @XmlElement(name="record") 
    public List<record> getRecords() {
        return records;
    }

    public String getFee() {
        return fee;
    }

    public String getBalance() {
        return balance;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setRecords(List<record> records) {
        this.records = records;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
    
       
}
