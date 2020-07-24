package com.mobiusvision.qrcode.entity.mysql;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mobiusvision.qrcode.entity.BpOrderCigInfo;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@TableName("BP_ORDER_CIG_INFO")
public class mysql_BP_ORDER_CIG_INFO extends BpOrderCigInfo {
    private BigInteger OCI_ID;
    private String OCI_UUID;
    private String OCI_CIG_BRAND;
    private String OCI_CIG_TRADEMARK;
    private String OCI_IS_ABNORMAL;
    private String OCI_IS_PRINT;
    private int OCI_ORDER_NUM;
    private BigDecimal OCI_ORDER_NUM1;
    private BigDecimal OCI_ACTUAL_PRICE;
    private BigDecimal OCI_STANDERD_PRICE;
    private String OCI_LOCK_STEP;
    private String OCI_LOCK_STATUS;
    private String OCI_CUSTOM_INFO;
    @TableId
    private String ID;

    public BigInteger getOCI_ID() {
        return this.OCI_ID;
    }

    public String getOCI_UUID() {
        return this.OCI_UUID;
    }

    public String getOCI_CIG_BRAND() {
        return this.OCI_CIG_BRAND;
    }

    public String getOCI_CIG_TRADEMARK() {
        return this.OCI_CIG_TRADEMARK;
    }

    public String getOCI_IS_ABNORMAL() {
        return this.OCI_IS_ABNORMAL;
    }

    public String getOCI_IS_PRINT() {
        return this.OCI_IS_PRINT;
    }

    public int getOCI_ORDER_NUM() {
        return this.OCI_ORDER_NUM;
    }

    public BigDecimal getOCI_ORDER_NUM1() {
        return this.OCI_ORDER_NUM1;
    }

    public BigDecimal getOCI_ACTUAL_PRICE() {
        return this.OCI_ACTUAL_PRICE;
    }

    public BigDecimal getOCI_STANDERD_PRICE() {
        return this.OCI_STANDERD_PRICE;
    }

    public String getOCI_LOCK_STEP() {
        return this.OCI_LOCK_STEP;
    }

    public String getOCI_LOCK_STATUS() {
        return this.OCI_LOCK_STATUS;
    }

    public String getOCI_CUSTOM_INFO() {
        return this.OCI_CUSTOM_INFO;
    }

    public String getID() {
        return this.ID;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_ID(BigInteger OCI_ID) {
        this.OCI_ID = OCI_ID;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_UUID(String OCI_UUID) {
        this.OCI_UUID = OCI_UUID;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_CIG_BRAND(String OCI_CIG_BRAND) {
        this.OCI_CIG_BRAND = OCI_CIG_BRAND;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_CIG_TRADEMARK(String OCI_CIG_TRADEMARK) {
        this.OCI_CIG_TRADEMARK = OCI_CIG_TRADEMARK;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_IS_ABNORMAL(String OCI_IS_ABNORMAL) {
        this.OCI_IS_ABNORMAL = OCI_IS_ABNORMAL;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_IS_PRINT(String OCI_IS_PRINT) {
        this.OCI_IS_PRINT = OCI_IS_PRINT;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_ORDER_NUM(int OCI_ORDER_NUM) {
        this.OCI_ORDER_NUM = OCI_ORDER_NUM;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_ORDER_NUM1(BigDecimal OCI_ORDER_NUM1) {
        this.OCI_ORDER_NUM1 = OCI_ORDER_NUM1;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_ACTUAL_PRICE(BigDecimal OCI_ACTUAL_PRICE) {
        this.OCI_ACTUAL_PRICE = OCI_ACTUAL_PRICE;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_STANDERD_PRICE(BigDecimal OCI_STANDERD_PRICE) {
        this.OCI_STANDERD_PRICE = OCI_STANDERD_PRICE;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_LOCK_STEP(String OCI_LOCK_STEP) {
        this.OCI_LOCK_STEP = OCI_LOCK_STEP;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_LOCK_STATUS(String OCI_LOCK_STATUS) {
        this.OCI_LOCK_STATUS = OCI_LOCK_STATUS;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setOCI_CUSTOM_INFO(String OCI_CUSTOM_INFO) {
        this.OCI_CUSTOM_INFO = OCI_CUSTOM_INFO;
        return this;
    }

    public mysql_BP_ORDER_CIG_INFO setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String toString() {
        return "mysql_BP_ORDER_CIG_INFO(OCI_ID=" + this.getOCI_ID() + ", OCI_UUID=" + this.getOCI_UUID() + ", OCI_CIG_BRAND=" + this.getOCI_CIG_BRAND() + ", OCI_CIG_TRADEMARK=" + this.getOCI_CIG_TRADEMARK() + ", OCI_IS_ABNORMAL=" + this.getOCI_IS_ABNORMAL() + ", OCI_IS_PRINT=" + this.getOCI_IS_PRINT() + ", OCI_ORDER_NUM=" + this.getOCI_ORDER_NUM() + ", OCI_ORDER_NUM1=" + this.getOCI_ORDER_NUM1() + ", OCI_ACTUAL_PRICE=" + this.getOCI_ACTUAL_PRICE() + ", OCI_STANDERD_PRICE=" + this.getOCI_STANDERD_PRICE() + ", OCI_LOCK_STEP=" + this.getOCI_LOCK_STEP() + ", OCI_LOCK_STATUS=" + this.getOCI_LOCK_STATUS() + ", OCI_CUSTOM_INFO=" + this.getOCI_CUSTOM_INFO() + ", ID=" + this.getID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof mysql_BP_ORDER_CIG_INFO)) {
            return false;
        } else {
            mysql_BP_ORDER_CIG_INFO other = (mysql_BP_ORDER_CIG_INFO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label171: {
                    Object this$OCI_ID = this.getOCI_ID();
                    Object other$OCI_ID = other.getOCI_ID();
                    if (this$OCI_ID == null) {
                        if (other$OCI_ID == null) {
                            break label171;
                        }
                    } else if (this$OCI_ID.equals(other$OCI_ID)) {
                        break label171;
                    }

                    return false;
                }

                Object this$OCI_UUID = this.getOCI_UUID();
                Object other$OCI_UUID = other.getOCI_UUID();
                if (this$OCI_UUID == null) {
                    if (other$OCI_UUID != null) {
                        return false;
                    }
                } else if (!this$OCI_UUID.equals(other$OCI_UUID)) {
                    return false;
                }

                Object this$OCI_CIG_BRAND = this.getOCI_CIG_BRAND();
                Object other$OCI_CIG_BRAND = other.getOCI_CIG_BRAND();
                if (this$OCI_CIG_BRAND == null) {
                    if (other$OCI_CIG_BRAND != null) {
                        return false;
                    }
                } else if (!this$OCI_CIG_BRAND.equals(other$OCI_CIG_BRAND)) {
                    return false;
                }

                label150: {
                    Object this$OCI_CIG_TRADEMARK = this.getOCI_CIG_TRADEMARK();
                    Object other$OCI_CIG_TRADEMARK = other.getOCI_CIG_TRADEMARK();
                    if (this$OCI_CIG_TRADEMARK == null) {
                        if (other$OCI_CIG_TRADEMARK == null) {
                            break label150;
                        }
                    } else if (this$OCI_CIG_TRADEMARK.equals(other$OCI_CIG_TRADEMARK)) {
                        break label150;
                    }

                    return false;
                }

                label143: {
                    Object this$OCI_IS_ABNORMAL = this.getOCI_IS_ABNORMAL();
                    Object other$OCI_IS_ABNORMAL = other.getOCI_IS_ABNORMAL();
                    if (this$OCI_IS_ABNORMAL == null) {
                        if (other$OCI_IS_ABNORMAL == null) {
                            break label143;
                        }
                    } else if (this$OCI_IS_ABNORMAL.equals(other$OCI_IS_ABNORMAL)) {
                        break label143;
                    }

                    return false;
                }

                label136: {
                    Object this$OCI_IS_PRINT = this.getOCI_IS_PRINT();
                    Object other$OCI_IS_PRINT = other.getOCI_IS_PRINT();
                    if (this$OCI_IS_PRINT == null) {
                        if (other$OCI_IS_PRINT == null) {
                            break label136;
                        }
                    } else if (this$OCI_IS_PRINT.equals(other$OCI_IS_PRINT)) {
                        break label136;
                    }

                    return false;
                }

                if (this.getOCI_ORDER_NUM() != other.getOCI_ORDER_NUM()) {
                    return false;
                } else {
                    label128: {
                        Object this$OCI_ORDER_NUM1 = this.getOCI_ORDER_NUM1();
                        Object other$OCI_ORDER_NUM1 = other.getOCI_ORDER_NUM1();
                        if (this$OCI_ORDER_NUM1 == null) {
                            if (other$OCI_ORDER_NUM1 == null) {
                                break label128;
                            }
                        } else if (this$OCI_ORDER_NUM1.equals(other$OCI_ORDER_NUM1)) {
                            break label128;
                        }

                        return false;
                    }

                    Object this$OCI_ACTUAL_PRICE = this.getOCI_ACTUAL_PRICE();
                    Object other$OCI_ACTUAL_PRICE = other.getOCI_ACTUAL_PRICE();
                    if (this$OCI_ACTUAL_PRICE == null) {
                        if (other$OCI_ACTUAL_PRICE != null) {
                            return false;
                        }
                    } else if (!this$OCI_ACTUAL_PRICE.equals(other$OCI_ACTUAL_PRICE)) {
                        return false;
                    }

                    Object this$OCI_STANDERD_PRICE = this.getOCI_STANDERD_PRICE();
                    Object other$OCI_STANDERD_PRICE = other.getOCI_STANDERD_PRICE();
                    if (this$OCI_STANDERD_PRICE == null) {
                        if (other$OCI_STANDERD_PRICE != null) {
                            return false;
                        }
                    } else if (!this$OCI_STANDERD_PRICE.equals(other$OCI_STANDERD_PRICE)) {
                        return false;
                    }

                    label107: {
                        Object this$OCI_LOCK_STEP = this.getOCI_LOCK_STEP();
                        Object other$OCI_LOCK_STEP = other.getOCI_LOCK_STEP();
                        if (this$OCI_LOCK_STEP == null) {
                            if (other$OCI_LOCK_STEP == null) {
                                break label107;
                            }
                        } else if (this$OCI_LOCK_STEP.equals(other$OCI_LOCK_STEP)) {
                            break label107;
                        }

                        return false;
                    }

                    label100: {
                        Object this$OCI_LOCK_STATUS = this.getOCI_LOCK_STATUS();
                        Object other$OCI_LOCK_STATUS = other.getOCI_LOCK_STATUS();
                        if (this$OCI_LOCK_STATUS == null) {
                            if (other$OCI_LOCK_STATUS == null) {
                                break label100;
                            }
                        } else if (this$OCI_LOCK_STATUS.equals(other$OCI_LOCK_STATUS)) {
                            break label100;
                        }

                        return false;
                    }

                    Object this$OCI_CUSTOM_INFO = this.getOCI_CUSTOM_INFO();
                    Object other$OCI_CUSTOM_INFO = other.getOCI_CUSTOM_INFO();
                    if (this$OCI_CUSTOM_INFO == null) {
                        if (other$OCI_CUSTOM_INFO != null) {
                            return false;
                        }
                    } else if (!this$OCI_CUSTOM_INFO.equals(other$OCI_CUSTOM_INFO)) {
                        return false;
                    }

                    Object this$ID = this.getID();
                    Object other$ID = other.getID();
                    if (this$ID == null) {
                        if (other$ID != null) {
                            return false;
                        }
                    } else if (!this$ID.equals(other$ID)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof mysql_BP_ORDER_CIG_INFO;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $OCI_ID = this.getOCI_ID();
//        int result = result * 59 + ($OCI_ID == null ? 43 : $OCI_ID.hashCode());
//        Object $OCI_UUID = this.getOCI_UUID();
//        result = result * 59 + ($OCI_UUID == null ? 43 : $OCI_UUID.hashCode());
//        Object $OCI_CIG_BRAND = this.getOCI_CIG_BRAND();
//        result = result * 59 + ($OCI_CIG_BRAND == null ? 43 : $OCI_CIG_BRAND.hashCode());
//        Object $OCI_CIG_TRADEMARK = this.getOCI_CIG_TRADEMARK();
//        result = result * 59 + ($OCI_CIG_TRADEMARK == null ? 43 : $OCI_CIG_TRADEMARK.hashCode());
//        Object $OCI_IS_ABNORMAL = this.getOCI_IS_ABNORMAL();
//        result = result * 59 + ($OCI_IS_ABNORMAL == null ? 43 : $OCI_IS_ABNORMAL.hashCode());
//        Object $OCI_IS_PRINT = this.getOCI_IS_PRINT();
//        result = result * 59 + ($OCI_IS_PRINT == null ? 43 : $OCI_IS_PRINT.hashCode());
//        result = result * 59 + this.getOCI_ORDER_NUM();
//        Object $OCI_ORDER_NUM1 = this.getOCI_ORDER_NUM1();
//        result = result * 59 + ($OCI_ORDER_NUM1 == null ? 43 : $OCI_ORDER_NUM1.hashCode());
//        Object $OCI_ACTUAL_PRICE = this.getOCI_ACTUAL_PRICE();
//        result = result * 59 + ($OCI_ACTUAL_PRICE == null ? 43 : $OCI_ACTUAL_PRICE.hashCode());
//        Object $OCI_STANDERD_PRICE = this.getOCI_STANDERD_PRICE();
//        result = result * 59 + ($OCI_STANDERD_PRICE == null ? 43 : $OCI_STANDERD_PRICE.hashCode());
//        Object $OCI_LOCK_STEP = this.getOCI_LOCK_STEP();
//        result = result * 59 + ($OCI_LOCK_STEP == null ? 43 : $OCI_LOCK_STEP.hashCode());
//        Object $OCI_LOCK_STATUS = this.getOCI_LOCK_STATUS();
//        result = result * 59 + ($OCI_LOCK_STATUS == null ? 43 : $OCI_LOCK_STATUS.hashCode());
//        Object $OCI_CUSTOM_INFO = this.getOCI_CUSTOM_INFO();
//        result = result * 59 + ($OCI_CUSTOM_INFO == null ? 43 : $OCI_CUSTOM_INFO.hashCode());
//        Object $ID = this.getID();
//        result = result * 59 + ($ID == null ? 43 : $ID.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {

        return Objects.hash(OCI_ID, OCI_UUID, OCI_CIG_BRAND, OCI_CIG_TRADEMARK, OCI_IS_ABNORMAL, OCI_IS_PRINT, OCI_ORDER_NUM, OCI_ORDER_NUM1, OCI_ACTUAL_PRICE, OCI_STANDERD_PRICE, OCI_LOCK_STEP, OCI_LOCK_STATUS, OCI_CUSTOM_INFO, ID);
    }

    @ConstructorProperties({"OCI_ID", "OCI_UUID", "OCI_CIG_BRAND", "OCI_CIG_TRADEMARK", "OCI_IS_ABNORMAL", "OCI_IS_PRINT", "OCI_ORDER_NUM", "OCI_ORDER_NUM1", "OCI_ACTUAL_PRICE", "OCI_STANDERD_PRICE", "OCI_LOCK_STEP", "OCI_LOCK_STATUS", "OCI_CUSTOM_INFO", "ID"})
    public mysql_BP_ORDER_CIG_INFO(BigInteger OCI_ID, String OCI_UUID, String OCI_CIG_BRAND, String OCI_CIG_TRADEMARK, String OCI_IS_ABNORMAL, String OCI_IS_PRINT, int OCI_ORDER_NUM, BigDecimal OCI_ORDER_NUM1, BigDecimal OCI_ACTUAL_PRICE, BigDecimal OCI_STANDERD_PRICE, String OCI_LOCK_STEP, String OCI_LOCK_STATUS, String OCI_CUSTOM_INFO, String ID) {
        this.OCI_ID = OCI_ID;
        this.OCI_UUID = OCI_UUID;
        this.OCI_CIG_BRAND = OCI_CIG_BRAND;
        this.OCI_CIG_TRADEMARK = OCI_CIG_TRADEMARK;
        this.OCI_IS_ABNORMAL = OCI_IS_ABNORMAL;
        this.OCI_IS_PRINT = OCI_IS_PRINT;
        this.OCI_ORDER_NUM = OCI_ORDER_NUM;
        this.OCI_ORDER_NUM1 = OCI_ORDER_NUM1;
        this.OCI_ACTUAL_PRICE = OCI_ACTUAL_PRICE;
        this.OCI_STANDERD_PRICE = OCI_STANDERD_PRICE;
        this.OCI_LOCK_STEP = OCI_LOCK_STEP;
        this.OCI_LOCK_STATUS = OCI_LOCK_STATUS;
        this.OCI_CUSTOM_INFO = OCI_CUSTOM_INFO;
        this.ID = ID;
    }

    public mysql_BP_ORDER_CIG_INFO() {
    }
}

