package com.mobiusvision.qrcode.entity;

import java.beans.ConstructorProperties;
import java.util.Objects;

public class QrcodeCheck {

    private Integer checkTimes;
    private String qrcode;
    private Tobacco tobacco;
    private ViCustmsg viCustmsg;

    public Integer getCheckTimes() {
        return this.checkTimes;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public Tobacco getTobacco() {
        return this.tobacco;
    }

    public ViCustmsg getViCustmsg() {
        return this.viCustmsg;
    }

    public QrcodeCheck setCheckTimes(Integer checkTimes) {
        this.checkTimes = checkTimes;
        return this;
    }

    public QrcodeCheck setQrcode(String qrcode) {
        this.qrcode = qrcode;
        return this;
    }

    public QrcodeCheck setTobacco(Tobacco tobacco) {
        this.tobacco = tobacco;
        return this;
    }

    public QrcodeCheck setViCustmsg(ViCustmsg viCustmsg) {
        this.viCustmsg = viCustmsg;
        return this;
    }

    public String toString() {
        return "QrcodeCheck(checkTimes=" + this.getCheckTimes() + ", qrcode=" + this.getQrcode() + ", tobacco=" + this.getTobacco() + ", viCustmsg=" + this.getViCustmsg() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof QrcodeCheck)) {
            return false;
        } else {
            QrcodeCheck other = (QrcodeCheck)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$checkTimes = this.getCheckTimes();
                    Object other$checkTimes = other.getCheckTimes();
                    if (this$checkTimes == null) {
                        if (other$checkTimes == null) {
                            break label59;
                        }
                    } else if (this$checkTimes.equals(other$checkTimes)) {
                        break label59;
                    }

                    return false;
                }

                Object this$qrcode = this.getQrcode();
                Object other$qrcode = other.getQrcode();
                if (this$qrcode == null) {
                    if (other$qrcode != null) {
                        return false;
                    }
                } else if (!this$qrcode.equals(other$qrcode)) {
                    return false;
                }

                Object this$tobacco = this.getTobacco();
                Object other$tobacco = other.getTobacco();
                if (this$tobacco == null) {
                    if (other$tobacco != null) {
                        return false;
                    }
                } else if (!this$tobacco.equals(other$tobacco)) {
                    return false;
                }

                Object this$viCustmsg = this.getViCustmsg();
                Object other$viCustmsg = other.getViCustmsg();
                if (this$viCustmsg == null) {
                    if (other$viCustmsg != null) {
                        return false;
                    }
                } else if (!this$viCustmsg.equals(other$viCustmsg)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof QrcodeCheck;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $checkTimes = this.getCheckTimes();
//        int result = result * 59 + ($checkTimes == null ? 43 : $checkTimes.hashCode());
//        Object $qrcode = this.getQrcode();
//        result = result * 59 + ($qrcode == null ? 43 : $qrcode.hashCode());
//        Object $tobacco = this.getTobacco();
//        result = result * 59 + ($tobacco == null ? 43 : $tobacco.hashCode());
//        Object $viCustmsg = this.getViCustmsg();
//        result = result * 59 + ($viCustmsg == null ? 43 : $viCustmsg.hashCode());
//        return result;
//    }
    @Override
    public int hashCode() {

        return Objects.hash(checkTimes, qrcode, tobacco, viCustmsg);
    }

    @ConstructorProperties({"checkTimes", "qrcode", "tobacco", "viCustmsg"})
    public QrcodeCheck(Integer checkTimes, String qrcode, Tobacco tobacco, ViCustmsg viCustmsg) {
        this.checkTimes = checkTimes;
        this.qrcode = qrcode;
        this.tobacco = tobacco;
        this.viCustmsg = viCustmsg;
    }

    public QrcodeCheck() {
    }
}
