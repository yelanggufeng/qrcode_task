package com.mobiusvision.qrcode.entity.mysql;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mobiusvision.qrcode.entity.BpOrderBarcode;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.Objects;

@TableName("BP_ORDER_BARCODE")
public class mysql_BP_ORDER_BARCODE extends BpOrderBarcode {
    private int OB_ID;
    private String OB_UUID;
    private int OB_SEQUENCE;
    private LocalDateTime OB_SORT_DATE;
    private String OB_CIG_DERIVE_CODE;
    private String OB_CUSTOM_INFO;
    private String OB_RETAILER_CODE;
    private String OB_BCIG_BARCODE;
    private int OB_TOTAL_SEQUENCE;
    private String OB_LOCK_STEP;
    private String OB_LOCK_STATUS;
    @TableId
    private String ID;

    public int getOB_ID() {
        return this.OB_ID;
    }

    public String getOB_UUID() {
        return this.OB_UUID;
    }

    public int getOB_SEQUENCE() {
        return this.OB_SEQUENCE;
    }

    public LocalDateTime getOB_SORT_DATE() {
        return this.OB_SORT_DATE;
    }

    public String getOB_CIG_DERIVE_CODE() {
        return this.OB_CIG_DERIVE_CODE;
    }

    public String getOB_CUSTOM_INFO() {
        return this.OB_CUSTOM_INFO;
    }

    public String getOB_RETAILER_CODE() {
        return this.OB_RETAILER_CODE;
    }

    public String getOB_BCIG_BARCODE() {
        return this.OB_BCIG_BARCODE;
    }

    public int getOB_TOTAL_SEQUENCE() {
        return this.OB_TOTAL_SEQUENCE;
    }

    public String getOB_LOCK_STEP() {
        return this.OB_LOCK_STEP;
    }

    public String getOB_LOCK_STATUS() {
        return this.OB_LOCK_STATUS;
    }

    public String getID() {
        return this.ID;
    }

    public mysql_BP_ORDER_BARCODE setOB_ID(int OB_ID) {
        this.OB_ID = OB_ID;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_UUID(String OB_UUID) {
        this.OB_UUID = OB_UUID;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_SEQUENCE(int OB_SEQUENCE) {
        this.OB_SEQUENCE = OB_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_SORT_DATE(LocalDateTime OB_SORT_DATE) {
        this.OB_SORT_DATE = OB_SORT_DATE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_CIG_DERIVE_CODE(String OB_CIG_DERIVE_CODE) {
        this.OB_CIG_DERIVE_CODE = OB_CIG_DERIVE_CODE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_CUSTOM_INFO(String OB_CUSTOM_INFO) {
        this.OB_CUSTOM_INFO = OB_CUSTOM_INFO;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_RETAILER_CODE(String OB_RETAILER_CODE) {
        this.OB_RETAILER_CODE = OB_RETAILER_CODE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_BCIG_BARCODE(String OB_BCIG_BARCODE) {
        this.OB_BCIG_BARCODE = OB_BCIG_BARCODE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_TOTAL_SEQUENCE(int OB_TOTAL_SEQUENCE) {
        this.OB_TOTAL_SEQUENCE = OB_TOTAL_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_LOCK_STEP(String OB_LOCK_STEP) {
        this.OB_LOCK_STEP = OB_LOCK_STEP;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setOB_LOCK_STATUS(String OB_LOCK_STATUS) {
        this.OB_LOCK_STATUS = OB_LOCK_STATUS;
        return this;
    }

    public mysql_BP_ORDER_BARCODE setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String toString() {
        return "mysql_BP_ORDER_BARCODE(OB_ID=" + this.getOB_ID() + ", OB_UUID=" + this.getOB_UUID() + ", OB_SEQUENCE=" + this.getOB_SEQUENCE() + ", OB_SORT_DATE=" + this.getOB_SORT_DATE() + ", OB_CIG_DERIVE_CODE=" + this.getOB_CIG_DERIVE_CODE() + ", OB_CUSTOM_INFO=" + this.getOB_CUSTOM_INFO() + ", OB_RETAILER_CODE=" + this.getOB_RETAILER_CODE() + ", OB_BCIG_BARCODE=" + this.getOB_BCIG_BARCODE() + ", OB_TOTAL_SEQUENCE=" + this.getOB_TOTAL_SEQUENCE() + ", OB_LOCK_STEP=" + this.getOB_LOCK_STEP() + ", OB_LOCK_STATUS=" + this.getOB_LOCK_STATUS() + ", ID=" + this.getID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof mysql_BP_ORDER_BARCODE)) {
            return false;
        } else {
            mysql_BP_ORDER_BARCODE other = (mysql_BP_ORDER_BARCODE)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getOB_ID() != other.getOB_ID()) {
                return false;
            } else {
                label129: {
                    Object this$OB_UUID = this.getOB_UUID();
                    Object other$OB_UUID = other.getOB_UUID();
                    if (this$OB_UUID == null) {
                        if (other$OB_UUID == null) {
                            break label129;
                        }
                    } else if (this$OB_UUID.equals(other$OB_UUID)) {
                        break label129;
                    }

                    return false;
                }

                if (this.getOB_SEQUENCE() != other.getOB_SEQUENCE()) {
                    return false;
                } else {
                    label121: {
                        Object this$OB_SORT_DATE = this.getOB_SORT_DATE();
                        Object other$OB_SORT_DATE = other.getOB_SORT_DATE();
                        if (this$OB_SORT_DATE == null) {
                            if (other$OB_SORT_DATE == null) {
                                break label121;
                            }
                        } else if (this$OB_SORT_DATE.equals(other$OB_SORT_DATE)) {
                            break label121;
                        }

                        return false;
                    }

                    Object this$OB_CIG_DERIVE_CODE = this.getOB_CIG_DERIVE_CODE();
                    Object other$OB_CIG_DERIVE_CODE = other.getOB_CIG_DERIVE_CODE();
                    if (this$OB_CIG_DERIVE_CODE == null) {
                        if (other$OB_CIG_DERIVE_CODE != null) {
                            return false;
                        }
                    } else if (!this$OB_CIG_DERIVE_CODE.equals(other$OB_CIG_DERIVE_CODE)) {
                        return false;
                    }

                    label107: {
                        Object this$OB_CUSTOM_INFO = this.getOB_CUSTOM_INFO();
                        Object other$OB_CUSTOM_INFO = other.getOB_CUSTOM_INFO();
                        if (this$OB_CUSTOM_INFO == null) {
                            if (other$OB_CUSTOM_INFO == null) {
                                break label107;
                            }
                        } else if (this$OB_CUSTOM_INFO.equals(other$OB_CUSTOM_INFO)) {
                            break label107;
                        }

                        return false;
                    }

                    Object this$OB_RETAILER_CODE = this.getOB_RETAILER_CODE();
                    Object other$OB_RETAILER_CODE = other.getOB_RETAILER_CODE();
                    if (this$OB_RETAILER_CODE == null) {
                        if (other$OB_RETAILER_CODE != null) {
                            return false;
                        }
                    } else if (!this$OB_RETAILER_CODE.equals(other$OB_RETAILER_CODE)) {
                        return false;
                    }

                    label93: {
                        Object this$OB_BCIG_BARCODE = this.getOB_BCIG_BARCODE();
                        Object other$OB_BCIG_BARCODE = other.getOB_BCIG_BARCODE();
                        if (this$OB_BCIG_BARCODE == null) {
                            if (other$OB_BCIG_BARCODE == null) {
                                break label93;
                            }
                        } else if (this$OB_BCIG_BARCODE.equals(other$OB_BCIG_BARCODE)) {
                            break label93;
                        }

                        return false;
                    }

                    if (this.getOB_TOTAL_SEQUENCE() != other.getOB_TOTAL_SEQUENCE()) {
                        return false;
                    } else {
                        label85: {
                            Object this$OB_LOCK_STEP = this.getOB_LOCK_STEP();
                            Object other$OB_LOCK_STEP = other.getOB_LOCK_STEP();
                            if (this$OB_LOCK_STEP == null) {
                                if (other$OB_LOCK_STEP == null) {
                                    break label85;
                                }
                            } else if (this$OB_LOCK_STEP.equals(other$OB_LOCK_STEP)) {
                                break label85;
                            }

                            return false;
                        }

                        Object this$OB_LOCK_STATUS = this.getOB_LOCK_STATUS();
                        Object other$OB_LOCK_STATUS = other.getOB_LOCK_STATUS();
                        if (this$OB_LOCK_STATUS == null) {
                            if (other$OB_LOCK_STATUS != null) {
                                return false;
                            }
                        } else if (!this$OB_LOCK_STATUS.equals(other$OB_LOCK_STATUS)) {
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
    }

    protected boolean canEqual(Object other) {
        return other instanceof mysql_BP_ORDER_BARCODE;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        int result = result * 59 + this.getOB_ID();
//        Object $OB_UUID = this.getOB_UUID();
//        result = result * 59 + ($OB_UUID == null ? 43 : $OB_UUID.hashCode());
//        result = result * 59 + this.getOB_SEQUENCE();
//        Object $OB_SORT_DATE = this.getOB_SORT_DATE();
//        result = result * 59 + ($OB_SORT_DATE == null ? 43 : $OB_SORT_DATE.hashCode());
//        Object $OB_CIG_DERIVE_CODE = this.getOB_CIG_DERIVE_CODE();
//        result = result * 59 + ($OB_CIG_DERIVE_CODE == null ? 43 : $OB_CIG_DERIVE_CODE.hashCode());
//        Object $OB_CUSTOM_INFO = this.getOB_CUSTOM_INFO();
//        result = result * 59 + ($OB_CUSTOM_INFO == null ? 43 : $OB_CUSTOM_INFO.hashCode());
//        Object $OB_RETAILER_CODE = this.getOB_RETAILER_CODE();
//        result = result * 59 + ($OB_RETAILER_CODE == null ? 43 : $OB_RETAILER_CODE.hashCode());
//        Object $OB_BCIG_BARCODE = this.getOB_BCIG_BARCODE();
//        result = result * 59 + ($OB_BCIG_BARCODE == null ? 43 : $OB_BCIG_BARCODE.hashCode());
//        result = result * 59 + this.getOB_TOTAL_SEQUENCE();
//        Object $OB_LOCK_STEP = this.getOB_LOCK_STEP();
//        result = result * 59 + ($OB_LOCK_STEP == null ? 43 : $OB_LOCK_STEP.hashCode());
//        Object $OB_LOCK_STATUS = this.getOB_LOCK_STATUS();
//        result = result * 59 + ($OB_LOCK_STATUS == null ? 43 : $OB_LOCK_STATUS.hashCode());
//        Object $ID = this.getID();
//        result = result * 59 + ($ID == null ? 43 : $ID.hashCode());
//        return result;
//    }
    @Override
    public int hashCode() {

        return Objects.hash(OB_ID, OB_UUID, OB_SEQUENCE, OB_SORT_DATE, OB_CIG_DERIVE_CODE, OB_CUSTOM_INFO, OB_RETAILER_CODE, OB_BCIG_BARCODE, OB_TOTAL_SEQUENCE, OB_LOCK_STEP, OB_LOCK_STATUS, ID);
    }

    @ConstructorProperties({"OB_ID", "OB_UUID", "OB_SEQUENCE", "OB_SORT_DATE", "OB_CIG_DERIVE_CODE", "OB_CUSTOM_INFO", "OB_RETAILER_CODE", "OB_BCIG_BARCODE", "OB_TOTAL_SEQUENCE", "OB_LOCK_STEP", "OB_LOCK_STATUS", "ID"})
    public mysql_BP_ORDER_BARCODE(int OB_ID, String OB_UUID, int OB_SEQUENCE, LocalDateTime OB_SORT_DATE, String OB_CIG_DERIVE_CODE, String OB_CUSTOM_INFO, String OB_RETAILER_CODE, String OB_BCIG_BARCODE, int OB_TOTAL_SEQUENCE, String OB_LOCK_STEP, String OB_LOCK_STATUS, String ID) {
        this.OB_ID = OB_ID;
        this.OB_UUID = OB_UUID;
        this.OB_SEQUENCE = OB_SEQUENCE;
        this.OB_SORT_DATE = OB_SORT_DATE;
        this.OB_CIG_DERIVE_CODE = OB_CIG_DERIVE_CODE;
        this.OB_CUSTOM_INFO = OB_CUSTOM_INFO;
        this.OB_RETAILER_CODE = OB_RETAILER_CODE;
        this.OB_BCIG_BARCODE = OB_BCIG_BARCODE;
        this.OB_TOTAL_SEQUENCE = OB_TOTAL_SEQUENCE;
        this.OB_LOCK_STEP = OB_LOCK_STEP;
        this.OB_LOCK_STATUS = OB_LOCK_STATUS;
        this.ID = ID;
    }

    public mysql_BP_ORDER_BARCODE() {
    }
}

