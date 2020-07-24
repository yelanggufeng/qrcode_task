package com.mobiusvision.qrcode.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Objects;

@TableName("VI_CUSTMSG")
public class ViCustmsg implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("BUSI_ADDR")
    private String busiAddr;
    @TableField("MANAGER")
    private String manager;
    @TableField("LICENSE_CODE")
    private String licenseCode;
    @TableField("CUST_NAME")
    private String custName;
    @TableField("ORDER_TEL")
    private String orderTel;

    public ViCustmsg() {
    }

    public String getBusiAddr() {
        return this.busiAddr;
    }

    public String getManager() {
        return this.manager;
    }

    public String getLicenseCode() {
        return this.licenseCode;
    }

    public String getCustName() {
        return this.custName;
    }

    public String getOrderTel() {
        return this.orderTel;
    }

    public ViCustmsg setBusiAddr(String busiAddr) {
        this.busiAddr = busiAddr;
        return this;
    }

    public ViCustmsg setManager(String manager) {
        this.manager = manager;
        return this;
    }

    public ViCustmsg setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }

    public ViCustmsg setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public ViCustmsg setOrderTel(String orderTel) {
        this.orderTel = orderTel;
        return this;
    }

    public String toString() {
        return "ViCustmsg(busiAddr=" + this.getBusiAddr() + ", manager=" + this.getManager() + ", licenseCode=" + this.getLicenseCode() + ", custName=" + this.getCustName() + ", orderTel=" + this.getOrderTel() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ViCustmsg)) {
            return false;
        } else {
            ViCustmsg other = (ViCustmsg)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$busiAddr = this.getBusiAddr();
                    Object other$busiAddr = other.getBusiAddr();
                    if (this$busiAddr == null) {
                        if (other$busiAddr == null) {
                            break label71;
                        }
                    } else if (this$busiAddr.equals(other$busiAddr)) {
                        break label71;
                    }

                    return false;
                }

                Object this$manager = this.getManager();
                Object other$manager = other.getManager();
                if (this$manager == null) {
                    if (other$manager != null) {
                        return false;
                    }
                } else if (!this$manager.equals(other$manager)) {
                    return false;
                }

                label57: {
                    Object this$licenseCode = this.getLicenseCode();
                    Object other$licenseCode = other.getLicenseCode();
                    if (this$licenseCode == null) {
                        if (other$licenseCode == null) {
                            break label57;
                        }
                    } else if (this$licenseCode.equals(other$licenseCode)) {
                        break label57;
                    }

                    return false;
                }

                Object this$custName = this.getCustName();
                Object other$custName = other.getCustName();
                if (this$custName == null) {
                    if (other$custName != null) {
                        return false;
                    }
                } else if (!this$custName.equals(other$custName)) {
                    return false;
                }

                Object this$orderTel = this.getOrderTel();
                Object other$orderTel = other.getOrderTel();
                if (this$orderTel == null) {
                    if (other$orderTel == null) {
                        return true;
                    }
                } else if (this$orderTel.equals(other$orderTel)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ViCustmsg;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $busiAddr = this.getBusiAddr();
//        int result = result * 59 + ($busiAddr == null ? 43 : $busiAddr.hashCode());
//        Object $manager = this.getManager();
//        result = result * 59 + ($manager == null ? 43 : $manager.hashCode());
//        Object $licenseCode = this.getLicenseCode();
//        result = result * 59 + ($licenseCode == null ? 43 : $licenseCode.hashCode());
//        Object $custName = this.getCustName();
//        result = result * 59 + ($custName == null ? 43 : $custName.hashCode());
//        Object $orderTel = this.getOrderTel();
//        result = result * 59 + ($orderTel == null ? 43 : $orderTel.hashCode());
//        return result;
//    }

    @Override
    public int hashCode() {

        return Objects.hash(busiAddr, manager, licenseCode, custName, orderTel);
    }
}
