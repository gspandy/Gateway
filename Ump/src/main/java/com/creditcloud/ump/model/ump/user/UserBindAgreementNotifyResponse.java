/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class UserBindAgreementNotifyResponse extends BaseResponse {
    
    private String user_id;

    public UserBindAgreementNotifyResponse() {
        super(CmdIdRspType.MER_BIND_AGREEMENT_NOTIFY_RSP);
    }
        
    public UserBindAgreementNotifyResponse(String user_id) {
        super(CmdIdRspType.MER_BIND_AGREEMENT_NOTIFY_RSP);
        this.user_id = user_id;
    }
}