/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.model.constraints.PNRReturnURL;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 主动/自动投标response
 *
 * @author rooseek
 */
public class TenderResponse extends BaseResponse {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @Size(min = 18, max = 18)
    private String TrxId;

    @PNRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @PNRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    public TenderResponse() {
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getTrxId() {
        return TrxId;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
