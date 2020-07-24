package com.mobiusvision.qrcode.entity;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Objects;

public class WxSignVo implements Serializable {
    private String appId;
    private Long timestamp;
    private String nonceStr;
    private String signature;
    private String ticket;

    public String getAppId() {
        return this.appId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getTicket() {
        return this.ticket;
    }

    public WxSignVo setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public WxSignVo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public WxSignVo setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
        return this;
    }

    public WxSignVo setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public WxSignVo setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    public String toString() {
        return "WxSignVo(appId=" + this.getAppId() + ", timestamp=" + this.getTimestamp() + ", nonceStr=" + this.getNonceStr() + ", signature=" + this.getSignature() + ", ticket=" + this.getTicket() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WxSignVo)) {
            return false;
        } else {
            WxSignVo other = (WxSignVo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$appId = this.getAppId();
                    Object other$appId = other.getAppId();
                    if (this$appId == null) {
                        if (other$appId == null) {
                            break label71;
                        }
                    } else if (this$appId.equals(other$appId)) {
                        break label71;
                    }

                    return false;
                }

                Object this$timestamp = this.getTimestamp();
                Object other$timestamp = other.getTimestamp();
                if (this$timestamp == null) {
                    if (other$timestamp != null) {
                        return false;
                    }
                } else if (!this$timestamp.equals(other$timestamp)) {
                    return false;
                }

                label57: {
                    Object this$nonceStr = this.getNonceStr();
                    Object other$nonceStr = other.getNonceStr();
                    if (this$nonceStr == null) {
                        if (other$nonceStr == null) {
                            break label57;
                        }
                    } else if (this$nonceStr.equals(other$nonceStr)) {
                        break label57;
                    }

                    return false;
                }

                Object this$signature = this.getSignature();
                Object other$signature = other.getSignature();
                if (this$signature == null) {
                    if (other$signature != null) {
                        return false;
                    }
                } else if (!this$signature.equals(other$signature)) {
                    return false;
                }

                Object this$ticket = this.getTicket();
                Object other$ticket = other.getTicket();
                if (this$ticket == null) {
                    if (other$ticket == null) {
                        return true;
                    }
                } else if (this$ticket.equals(other$ticket)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WxSignVo;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $appId = this.getAppId();
//        int result = result * 59 + ($appId == null ? 43 : $appId.hashCode());
//        Object $timestamp = this.getTimestamp();
//        result = result * 59 + ($timestamp == null ? 43 : $timestamp.hashCode());
//        Object $nonceStr = this.getNonceStr();
//        result = result * 59 + ($nonceStr == null ? 43 : $nonceStr.hashCode());
//        Object $signature = this.getSignature();
//        result = result * 59 + ($signature == null ? 43 : $signature.hashCode());
//        Object $ticket = this.getTicket();
//        result = result * 59 + ($ticket == null ? 43 : $ticket.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {

        return Objects.hash(appId, timestamp, nonceStr, signature, ticket);
    }

    @ConstructorProperties({"appId", "timestamp", "nonceStr", "signature", "ticket"})
    public WxSignVo(String appId, Long timestamp, String nonceStr, String signature, String ticket) {
        this.appId = appId;
        this.timestamp = timestamp;
        this.nonceStr = nonceStr;
        this.signature = signature;
        this.ticket = ticket;
    }

    public WxSignVo() {
    }
}

