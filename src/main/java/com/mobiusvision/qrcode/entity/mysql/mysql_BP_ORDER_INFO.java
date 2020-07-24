package com.mobiusvision.qrcode.entity.mysql;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mobiusvision.qrcode.entity.BpOrderInfo;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@TableName("BP_ORDER_INFO")
public class mysql_BP_ORDER_INFO extends BpOrderInfo {
    private BigInteger OI_ID;
    private String OI_UUID;
    private String OI_B_CODE;
    private String OI_B_TYPE;
    private String OI_ISCHANGE_SLINE;
    private String OI_DL_CODE;
    private String OI_DL_NAME;
    private String OI_SLINE_CODE;
    private String OI_SLINE_NAME;
    private int OI_SEQUENCE;
    private String OI_CODE;
    private String OI_RETAILER_CODE;
    private String OI_RETAILER_NAME;
    private LocalDateTime OI_DATE;
    private LocalDateTime OI_SORT_DATE;
    private String OI_CIG_FLAG;
    private int OI_ALL_NUM;
    private int OI_NORMAL_NUM;
    private String OI_CUSTOM_INFO;
    private int OI_CHECK_NUM;
    private int OI_SEND_NUM;
    private int OI_PRINT_NUM;
    private int OI_RESEL_ORDER_NUM;
    private LocalDateTime OI_START_TIME;
    private LocalDateTime OI_END_TIME;
    private String OI_STATE;
    private String OI_SEND_STATE;
    private LocalDateTime OI_SELF_UPDATE_TIME;
    private LocalDateTime OI_SUB_UPDATE_TIME;
    private String OI_B_UUID;
    private String OI_DL_UUID;
    private int OI_SELF_SEQUENCE;
    private BigDecimal OI_ALL_NUM1;
    private int OI_SELF_BATCH_SEQUENCE;
    private BigInteger OI_TOTAL_SEQUENCE;
    private int OI_ILLEGALITY_NUM;
    private int OI_SECOND_NUM;
    private String OI_COMMERCE_CODE;
    private String OI_COMMERCE_NAME;
    private LocalDateTime OI_LOCAL_START_TIME;
    private LocalDateTime OI_STANDARD_START_TIME;
    private String OI_MONITOR_STATUS;
    private String OI_TIME_MONITOR_STATUS;
    private String OI_STANDARD_TIME_TYPE;
    @TableId
    private String ID;

    public BigInteger getOI_ID() {
        return this.OI_ID;
    }

    public String getOI_UUID() {
        return this.OI_UUID;
    }

    public String getOI_B_CODE() {
        return this.OI_B_CODE;
    }

    public String getOI_B_TYPE() {
        return this.OI_B_TYPE;
    }

    public String getOI_ISCHANGE_SLINE() {
        return this.OI_ISCHANGE_SLINE;
    }

    public String getOI_DL_CODE() {
        return this.OI_DL_CODE;
    }

    public String getOI_DL_NAME() {
        return this.OI_DL_NAME;
    }

    public String getOI_SLINE_CODE() {
        return this.OI_SLINE_CODE;
    }

    public String getOI_SLINE_NAME() {
        return this.OI_SLINE_NAME;
    }

    public int getOI_SEQUENCE() {
        return this.OI_SEQUENCE;
    }

    public String getOI_CODE() {
        return this.OI_CODE;
    }

    public String getOI_RETAILER_CODE() {
        return this.OI_RETAILER_CODE;
    }

    public String getOI_RETAILER_NAME() {
        return this.OI_RETAILER_NAME;
    }

    public LocalDateTime getOI_DATE() {
        return this.OI_DATE;
    }

    public LocalDateTime getOI_SORT_DATE() {
        return this.OI_SORT_DATE;
    }

    public String getOI_CIG_FLAG() {
        return this.OI_CIG_FLAG;
    }

    public int getOI_ALL_NUM() {
        return this.OI_ALL_NUM;
    }

    public int getOI_NORMAL_NUM() {
        return this.OI_NORMAL_NUM;
    }

    public String getOI_CUSTOM_INFO() {
        return this.OI_CUSTOM_INFO;
    }

    public int getOI_CHECK_NUM() {
        return this.OI_CHECK_NUM;
    }

    public int getOI_SEND_NUM() {
        return this.OI_SEND_NUM;
    }

    public int getOI_PRINT_NUM() {
        return this.OI_PRINT_NUM;
    }

    public int getOI_RESEL_ORDER_NUM() {
        return this.OI_RESEL_ORDER_NUM;
    }

    public LocalDateTime getOI_START_TIME() {
        return this.OI_START_TIME;
    }

    public LocalDateTime getOI_END_TIME() {
        return this.OI_END_TIME;
    }

    public String getOI_STATE() {
        return this.OI_STATE;
    }

    public String getOI_SEND_STATE() {
        return this.OI_SEND_STATE;
    }

    public LocalDateTime getOI_SELF_UPDATE_TIME() {
        return this.OI_SELF_UPDATE_TIME;
    }

    public LocalDateTime getOI_SUB_UPDATE_TIME() {
        return this.OI_SUB_UPDATE_TIME;
    }

    public String getOI_B_UUID() {
        return this.OI_B_UUID;
    }

    public String getOI_DL_UUID() {
        return this.OI_DL_UUID;
    }

    public int getOI_SELF_SEQUENCE() {
        return this.OI_SELF_SEQUENCE;
    }

    public BigDecimal getOI_ALL_NUM1() {
        return this.OI_ALL_NUM1;
    }

    public int getOI_SELF_BATCH_SEQUENCE() {
        return this.OI_SELF_BATCH_SEQUENCE;
    }

    public BigInteger getOI_TOTAL_SEQUENCE() {
        return this.OI_TOTAL_SEQUENCE;
    }

    public int getOI_ILLEGALITY_NUM() {
        return this.OI_ILLEGALITY_NUM;
    }

    public int getOI_SECOND_NUM() {
        return this.OI_SECOND_NUM;
    }

    public String getOI_COMMERCE_CODE() {
        return this.OI_COMMERCE_CODE;
    }

    public String getOI_COMMERCE_NAME() {
        return this.OI_COMMERCE_NAME;
    }

    public LocalDateTime getOI_LOCAL_START_TIME() {
        return this.OI_LOCAL_START_TIME;
    }

    public LocalDateTime getOI_STANDARD_START_TIME() {
        return this.OI_STANDARD_START_TIME;
    }

    public String getOI_MONITOR_STATUS() {
        return this.OI_MONITOR_STATUS;
    }

    public String getOI_TIME_MONITOR_STATUS() {
        return this.OI_TIME_MONITOR_STATUS;
    }

    public String getOI_STANDARD_TIME_TYPE() {
        return this.OI_STANDARD_TIME_TYPE;
    }

    public String getID() {
        return this.ID;
    }

    public mysql_BP_ORDER_INFO setOI_ID(BigInteger OI_ID) {
        this.OI_ID = OI_ID;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_UUID(String OI_UUID) {
        this.OI_UUID = OI_UUID;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_B_CODE(String OI_B_CODE) {
        this.OI_B_CODE = OI_B_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_B_TYPE(String OI_B_TYPE) {
        this.OI_B_TYPE = OI_B_TYPE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_ISCHANGE_SLINE(String OI_ISCHANGE_SLINE) {
        this.OI_ISCHANGE_SLINE = OI_ISCHANGE_SLINE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_DL_CODE(String OI_DL_CODE) {
        this.OI_DL_CODE = OI_DL_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_DL_NAME(String OI_DL_NAME) {
        this.OI_DL_NAME = OI_DL_NAME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SLINE_CODE(String OI_SLINE_CODE) {
        this.OI_SLINE_CODE = OI_SLINE_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SLINE_NAME(String OI_SLINE_NAME) {
        this.OI_SLINE_NAME = OI_SLINE_NAME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SEQUENCE(int OI_SEQUENCE) {
        this.OI_SEQUENCE = OI_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_CODE(String OI_CODE) {
        this.OI_CODE = OI_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_RETAILER_CODE(String OI_RETAILER_CODE) {
        this.OI_RETAILER_CODE = OI_RETAILER_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_RETAILER_NAME(String OI_RETAILER_NAME) {
        this.OI_RETAILER_NAME = OI_RETAILER_NAME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_DATE(LocalDateTime OI_DATE) {
        this.OI_DATE = OI_DATE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SORT_DATE(LocalDateTime OI_SORT_DATE) {
        this.OI_SORT_DATE = OI_SORT_DATE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_CIG_FLAG(String OI_CIG_FLAG) {
        this.OI_CIG_FLAG = OI_CIG_FLAG;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_ALL_NUM(int OI_ALL_NUM) {
        this.OI_ALL_NUM = OI_ALL_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_NORMAL_NUM(int OI_NORMAL_NUM) {
        this.OI_NORMAL_NUM = OI_NORMAL_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_CUSTOM_INFO(String OI_CUSTOM_INFO) {
        this.OI_CUSTOM_INFO = OI_CUSTOM_INFO;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_CHECK_NUM(int OI_CHECK_NUM) {
        this.OI_CHECK_NUM = OI_CHECK_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SEND_NUM(int OI_SEND_NUM) {
        this.OI_SEND_NUM = OI_SEND_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_PRINT_NUM(int OI_PRINT_NUM) {
        this.OI_PRINT_NUM = OI_PRINT_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_RESEL_ORDER_NUM(int OI_RESEL_ORDER_NUM) {
        this.OI_RESEL_ORDER_NUM = OI_RESEL_ORDER_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_START_TIME(LocalDateTime OI_START_TIME) {
        this.OI_START_TIME = OI_START_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_END_TIME(LocalDateTime OI_END_TIME) {
        this.OI_END_TIME = OI_END_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_STATE(String OI_STATE) {
        this.OI_STATE = OI_STATE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SEND_STATE(String OI_SEND_STATE) {
        this.OI_SEND_STATE = OI_SEND_STATE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SELF_UPDATE_TIME(LocalDateTime OI_SELF_UPDATE_TIME) {
        this.OI_SELF_UPDATE_TIME = OI_SELF_UPDATE_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SUB_UPDATE_TIME(LocalDateTime OI_SUB_UPDATE_TIME) {
        this.OI_SUB_UPDATE_TIME = OI_SUB_UPDATE_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_B_UUID(String OI_B_UUID) {
        this.OI_B_UUID = OI_B_UUID;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_DL_UUID(String OI_DL_UUID) {
        this.OI_DL_UUID = OI_DL_UUID;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SELF_SEQUENCE(int OI_SELF_SEQUENCE) {
        this.OI_SELF_SEQUENCE = OI_SELF_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_ALL_NUM1(BigDecimal OI_ALL_NUM1) {
        this.OI_ALL_NUM1 = OI_ALL_NUM1;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SELF_BATCH_SEQUENCE(int OI_SELF_BATCH_SEQUENCE) {
        this.OI_SELF_BATCH_SEQUENCE = OI_SELF_BATCH_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_TOTAL_SEQUENCE(BigInteger OI_TOTAL_SEQUENCE) {
        this.OI_TOTAL_SEQUENCE = OI_TOTAL_SEQUENCE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_ILLEGALITY_NUM(int OI_ILLEGALITY_NUM) {
        this.OI_ILLEGALITY_NUM = OI_ILLEGALITY_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_SECOND_NUM(int OI_SECOND_NUM) {
        this.OI_SECOND_NUM = OI_SECOND_NUM;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_COMMERCE_CODE(String OI_COMMERCE_CODE) {
        this.OI_COMMERCE_CODE = OI_COMMERCE_CODE;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_COMMERCE_NAME(String OI_COMMERCE_NAME) {
        this.OI_COMMERCE_NAME = OI_COMMERCE_NAME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_LOCAL_START_TIME(LocalDateTime OI_LOCAL_START_TIME) {
        this.OI_LOCAL_START_TIME = OI_LOCAL_START_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_STANDARD_START_TIME(LocalDateTime OI_STANDARD_START_TIME) {
        this.OI_STANDARD_START_TIME = OI_STANDARD_START_TIME;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_MONITOR_STATUS(String OI_MONITOR_STATUS) {
        this.OI_MONITOR_STATUS = OI_MONITOR_STATUS;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_TIME_MONITOR_STATUS(String OI_TIME_MONITOR_STATUS) {
        this.OI_TIME_MONITOR_STATUS = OI_TIME_MONITOR_STATUS;
        return this;
    }

    public mysql_BP_ORDER_INFO setOI_STANDARD_TIME_TYPE(String OI_STANDARD_TIME_TYPE) {
        this.OI_STANDARD_TIME_TYPE = OI_STANDARD_TIME_TYPE;
        return this;
    }

    public mysql_BP_ORDER_INFO setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String toString() {
        return "mysql_BP_ORDER_INFO(OI_ID=" + this.getOI_ID() + ", OI_UUID=" + this.getOI_UUID() + ", OI_B_CODE=" + this.getOI_B_CODE() + ", OI_B_TYPE=" + this.getOI_B_TYPE() + ", OI_ISCHANGE_SLINE=" + this.getOI_ISCHANGE_SLINE() + ", OI_DL_CODE=" + this.getOI_DL_CODE() + ", OI_DL_NAME=" + this.getOI_DL_NAME() + ", OI_SLINE_CODE=" + this.getOI_SLINE_CODE() + ", OI_SLINE_NAME=" + this.getOI_SLINE_NAME() + ", OI_SEQUENCE=" + this.getOI_SEQUENCE() + ", OI_CODE=" + this.getOI_CODE() + ", OI_RETAILER_CODE=" + this.getOI_RETAILER_CODE() + ", OI_RETAILER_NAME=" + this.getOI_RETAILER_NAME() + ", OI_DATE=" + this.getOI_DATE() + ", OI_SORT_DATE=" + this.getOI_SORT_DATE() + ", OI_CIG_FLAG=" + this.getOI_CIG_FLAG() + ", OI_ALL_NUM=" + this.getOI_ALL_NUM() + ", OI_NORMAL_NUM=" + this.getOI_NORMAL_NUM() + ", OI_CUSTOM_INFO=" + this.getOI_CUSTOM_INFO() + ", OI_CHECK_NUM=" + this.getOI_CHECK_NUM() + ", OI_SEND_NUM=" + this.getOI_SEND_NUM() + ", OI_PRINT_NUM=" + this.getOI_PRINT_NUM() + ", OI_RESEL_ORDER_NUM=" + this.getOI_RESEL_ORDER_NUM() + ", OI_START_TIME=" + this.getOI_START_TIME() + ", OI_END_TIME=" + this.getOI_END_TIME() + ", OI_STATE=" + this.getOI_STATE() + ", OI_SEND_STATE=" + this.getOI_SEND_STATE() + ", OI_SELF_UPDATE_TIME=" + this.getOI_SELF_UPDATE_TIME() + ", OI_SUB_UPDATE_TIME=" + this.getOI_SUB_UPDATE_TIME() + ", OI_B_UUID=" + this.getOI_B_UUID() + ", OI_DL_UUID=" + this.getOI_DL_UUID() + ", OI_SELF_SEQUENCE=" + this.getOI_SELF_SEQUENCE() + ", OI_ALL_NUM1=" + this.getOI_ALL_NUM1() + ", OI_SELF_BATCH_SEQUENCE=" + this.getOI_SELF_BATCH_SEQUENCE() + ", OI_TOTAL_SEQUENCE=" + this.getOI_TOTAL_SEQUENCE() + ", OI_ILLEGALITY_NUM=" + this.getOI_ILLEGALITY_NUM() + ", OI_SECOND_NUM=" + this.getOI_SECOND_NUM() + ", OI_COMMERCE_CODE=" + this.getOI_COMMERCE_CODE() + ", OI_COMMERCE_NAME=" + this.getOI_COMMERCE_NAME() + ", OI_LOCAL_START_TIME=" + this.getOI_LOCAL_START_TIME() + ", OI_STANDARD_START_TIME=" + this.getOI_STANDARD_START_TIME() + ", OI_MONITOR_STATUS=" + this.getOI_MONITOR_STATUS() + ", OI_TIME_MONITOR_STATUS=" + this.getOI_TIME_MONITOR_STATUS() + ", OI_STANDARD_TIME_TYPE=" + this.getOI_STANDARD_TIME_TYPE() + ", ID=" + this.getID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof mysql_BP_ORDER_INFO)) {
            return false;
        } else {
            mysql_BP_ORDER_INFO other = (mysql_BP_ORDER_INFO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label463: {
                    Object this$OI_ID = this.getOI_ID();
                    Object other$OI_ID = other.getOI_ID();
                    if (this$OI_ID == null) {
                        if (other$OI_ID == null) {
                            break label463;
                        }
                    } else if (this$OI_ID.equals(other$OI_ID)) {
                        break label463;
                    }

                    return false;
                }

                Object this$OI_UUID = this.getOI_UUID();
                Object other$OI_UUID = other.getOI_UUID();
                if (this$OI_UUID == null) {
                    if (other$OI_UUID != null) {
                        return false;
                    }
                } else if (!this$OI_UUID.equals(other$OI_UUID)) {
                    return false;
                }

                Object this$OI_B_CODE = this.getOI_B_CODE();
                Object other$OI_B_CODE = other.getOI_B_CODE();
                if (this$OI_B_CODE == null) {
                    if (other$OI_B_CODE != null) {
                        return false;
                    }
                } else if (!this$OI_B_CODE.equals(other$OI_B_CODE)) {
                    return false;
                }

                label442: {
                    Object this$OI_B_TYPE = this.getOI_B_TYPE();
                    Object other$OI_B_TYPE = other.getOI_B_TYPE();
                    if (this$OI_B_TYPE == null) {
                        if (other$OI_B_TYPE == null) {
                            break label442;
                        }
                    } else if (this$OI_B_TYPE.equals(other$OI_B_TYPE)) {
                        break label442;
                    }

                    return false;
                }

                label435: {
                    Object this$OI_ISCHANGE_SLINE = this.getOI_ISCHANGE_SLINE();
                    Object other$OI_ISCHANGE_SLINE = other.getOI_ISCHANGE_SLINE();
                    if (this$OI_ISCHANGE_SLINE == null) {
                        if (other$OI_ISCHANGE_SLINE == null) {
                            break label435;
                        }
                    } else if (this$OI_ISCHANGE_SLINE.equals(other$OI_ISCHANGE_SLINE)) {
                        break label435;
                    }

                    return false;
                }

                Object this$OI_DL_CODE = this.getOI_DL_CODE();
                Object other$OI_DL_CODE = other.getOI_DL_CODE();
                if (this$OI_DL_CODE == null) {
                    if (other$OI_DL_CODE != null) {
                        return false;
                    }
                } else if (!this$OI_DL_CODE.equals(other$OI_DL_CODE)) {
                    return false;
                }

                Object this$OI_DL_NAME = this.getOI_DL_NAME();
                Object other$OI_DL_NAME = other.getOI_DL_NAME();
                if (this$OI_DL_NAME == null) {
                    if (other$OI_DL_NAME != null) {
                        return false;
                    }
                } else if (!this$OI_DL_NAME.equals(other$OI_DL_NAME)) {
                    return false;
                }

                label414: {
                    Object this$OI_SLINE_CODE = this.getOI_SLINE_CODE();
                    Object other$OI_SLINE_CODE = other.getOI_SLINE_CODE();
                    if (this$OI_SLINE_CODE == null) {
                        if (other$OI_SLINE_CODE == null) {
                            break label414;
                        }
                    } else if (this$OI_SLINE_CODE.equals(other$OI_SLINE_CODE)) {
                        break label414;
                    }

                    return false;
                }

                label407: {
                    Object this$OI_SLINE_NAME = this.getOI_SLINE_NAME();
                    Object other$OI_SLINE_NAME = other.getOI_SLINE_NAME();
                    if (this$OI_SLINE_NAME == null) {
                        if (other$OI_SLINE_NAME == null) {
                            break label407;
                        }
                    } else if (this$OI_SLINE_NAME.equals(other$OI_SLINE_NAME)) {
                        break label407;
                    }

                    return false;
                }

                if (this.getOI_SEQUENCE() != other.getOI_SEQUENCE()) {
                    return false;
                } else {
                    label399: {
                        Object this$OI_CODE = this.getOI_CODE();
                        Object other$OI_CODE = other.getOI_CODE();
                        if (this$OI_CODE == null) {
                            if (other$OI_CODE == null) {
                                break label399;
                            }
                        } else if (this$OI_CODE.equals(other$OI_CODE)) {
                            break label399;
                        }

                        return false;
                    }

                    label392: {
                        Object this$OI_RETAILER_CODE = this.getOI_RETAILER_CODE();
                        Object other$OI_RETAILER_CODE = other.getOI_RETAILER_CODE();
                        if (this$OI_RETAILER_CODE == null) {
                            if (other$OI_RETAILER_CODE == null) {
                                break label392;
                            }
                        } else if (this$OI_RETAILER_CODE.equals(other$OI_RETAILER_CODE)) {
                            break label392;
                        }

                        return false;
                    }

                    Object this$OI_RETAILER_NAME = this.getOI_RETAILER_NAME();
                    Object other$OI_RETAILER_NAME = other.getOI_RETAILER_NAME();
                    if (this$OI_RETAILER_NAME == null) {
                        if (other$OI_RETAILER_NAME != null) {
                            return false;
                        }
                    } else if (!this$OI_RETAILER_NAME.equals(other$OI_RETAILER_NAME)) {
                        return false;
                    }

                    label378: {
                        Object this$OI_DATE = this.getOI_DATE();
                        Object other$OI_DATE = other.getOI_DATE();
                        if (this$OI_DATE == null) {
                            if (other$OI_DATE == null) {
                                break label378;
                            }
                        } else if (this$OI_DATE.equals(other$OI_DATE)) {
                            break label378;
                        }

                        return false;
                    }

                    label371: {
                        Object this$OI_SORT_DATE = this.getOI_SORT_DATE();
                        Object other$OI_SORT_DATE = other.getOI_SORT_DATE();
                        if (this$OI_SORT_DATE == null) {
                            if (other$OI_SORT_DATE == null) {
                                break label371;
                            }
                        } else if (this$OI_SORT_DATE.equals(other$OI_SORT_DATE)) {
                            break label371;
                        }

                        return false;
                    }

                    Object this$OI_CIG_FLAG = this.getOI_CIG_FLAG();
                    Object other$OI_CIG_FLAG = other.getOI_CIG_FLAG();
                    if (this$OI_CIG_FLAG == null) {
                        if (other$OI_CIG_FLAG != null) {
                            return false;
                        }
                    } else if (!this$OI_CIG_FLAG.equals(other$OI_CIG_FLAG)) {
                        return false;
                    }

                    if (this.getOI_ALL_NUM() != other.getOI_ALL_NUM()) {
                        return false;
                    } else if (this.getOI_NORMAL_NUM() != other.getOI_NORMAL_NUM()) {
                        return false;
                    } else {
                        label354: {
                            Object this$OI_CUSTOM_INFO = this.getOI_CUSTOM_INFO();
                            Object other$OI_CUSTOM_INFO = other.getOI_CUSTOM_INFO();
                            if (this$OI_CUSTOM_INFO == null) {
                                if (other$OI_CUSTOM_INFO == null) {
                                    break label354;
                                }
                            } else if (this$OI_CUSTOM_INFO.equals(other$OI_CUSTOM_INFO)) {
                                break label354;
                            }

                            return false;
                        }

                        if (this.getOI_CHECK_NUM() != other.getOI_CHECK_NUM()) {
                            return false;
                        } else if (this.getOI_SEND_NUM() != other.getOI_SEND_NUM()) {
                            return false;
                        } else if (this.getOI_PRINT_NUM() != other.getOI_PRINT_NUM()) {
                            return false;
                        } else if (this.getOI_RESEL_ORDER_NUM() != other.getOI_RESEL_ORDER_NUM()) {
                            return false;
                        } else {
                            Object this$OI_START_TIME = this.getOI_START_TIME();
                            Object other$OI_START_TIME = other.getOI_START_TIME();
                            if (this$OI_START_TIME == null) {
                                if (other$OI_START_TIME != null) {
                                    return false;
                                }
                            } else if (!this$OI_START_TIME.equals(other$OI_START_TIME)) {
                                return false;
                            }

                            label334: {
                                Object this$OI_END_TIME = this.getOI_END_TIME();
                                Object other$OI_END_TIME = other.getOI_END_TIME();
                                if (this$OI_END_TIME == null) {
                                    if (other$OI_END_TIME == null) {
                                        break label334;
                                    }
                                } else if (this$OI_END_TIME.equals(other$OI_END_TIME)) {
                                    break label334;
                                }

                                return false;
                            }

                            label327: {
                                Object this$OI_STATE = this.getOI_STATE();
                                Object other$OI_STATE = other.getOI_STATE();
                                if (this$OI_STATE == null) {
                                    if (other$OI_STATE == null) {
                                        break label327;
                                    }
                                } else if (this$OI_STATE.equals(other$OI_STATE)) {
                                    break label327;
                                }

                                return false;
                            }

                            Object this$OI_SEND_STATE = this.getOI_SEND_STATE();
                            Object other$OI_SEND_STATE = other.getOI_SEND_STATE();
                            if (this$OI_SEND_STATE == null) {
                                if (other$OI_SEND_STATE != null) {
                                    return false;
                                }
                            } else if (!this$OI_SEND_STATE.equals(other$OI_SEND_STATE)) {
                                return false;
                            }

                            label313: {
                                Object this$OI_SELF_UPDATE_TIME = this.getOI_SELF_UPDATE_TIME();
                                Object other$OI_SELF_UPDATE_TIME = other.getOI_SELF_UPDATE_TIME();
                                if (this$OI_SELF_UPDATE_TIME == null) {
                                    if (other$OI_SELF_UPDATE_TIME == null) {
                                        break label313;
                                    }
                                } else if (this$OI_SELF_UPDATE_TIME.equals(other$OI_SELF_UPDATE_TIME)) {
                                    break label313;
                                }

                                return false;
                            }

                            Object this$OI_SUB_UPDATE_TIME = this.getOI_SUB_UPDATE_TIME();
                            Object other$OI_SUB_UPDATE_TIME = other.getOI_SUB_UPDATE_TIME();
                            if (this$OI_SUB_UPDATE_TIME == null) {
                                if (other$OI_SUB_UPDATE_TIME != null) {
                                    return false;
                                }
                            } else if (!this$OI_SUB_UPDATE_TIME.equals(other$OI_SUB_UPDATE_TIME)) {
                                return false;
                            }

                            label299: {
                                Object this$OI_B_UUID = this.getOI_B_UUID();
                                Object other$OI_B_UUID = other.getOI_B_UUID();
                                if (this$OI_B_UUID == null) {
                                    if (other$OI_B_UUID == null) {
                                        break label299;
                                    }
                                } else if (this$OI_B_UUID.equals(other$OI_B_UUID)) {
                                    break label299;
                                }

                                return false;
                            }

                            Object this$OI_DL_UUID = this.getOI_DL_UUID();
                            Object other$OI_DL_UUID = other.getOI_DL_UUID();
                            if (this$OI_DL_UUID == null) {
                                if (other$OI_DL_UUID != null) {
                                    return false;
                                }
                            } else if (!this$OI_DL_UUID.equals(other$OI_DL_UUID)) {
                                return false;
                            }

                            if (this.getOI_SELF_SEQUENCE() != other.getOI_SELF_SEQUENCE()) {
                                return false;
                            } else {
                                Object this$OI_ALL_NUM1 = this.getOI_ALL_NUM1();
                                Object other$OI_ALL_NUM1 = other.getOI_ALL_NUM1();
                                if (this$OI_ALL_NUM1 == null) {
                                    if (other$OI_ALL_NUM1 != null) {
                                        return false;
                                    }
                                } else if (!this$OI_ALL_NUM1.equals(other$OI_ALL_NUM1)) {
                                    return false;
                                }

                                if (this.getOI_SELF_BATCH_SEQUENCE() != other.getOI_SELF_BATCH_SEQUENCE()) {
                                    return false;
                                } else {
                                    Object this$OI_TOTAL_SEQUENCE = this.getOI_TOTAL_SEQUENCE();
                                    Object other$OI_TOTAL_SEQUENCE = other.getOI_TOTAL_SEQUENCE();
                                    if (this$OI_TOTAL_SEQUENCE == null) {
                                        if (other$OI_TOTAL_SEQUENCE != null) {
                                            return false;
                                        }
                                    } else if (!this$OI_TOTAL_SEQUENCE.equals(other$OI_TOTAL_SEQUENCE)) {
                                        return false;
                                    }

                                    if (this.getOI_ILLEGALITY_NUM() != other.getOI_ILLEGALITY_NUM()) {
                                        return false;
                                    } else if (this.getOI_SECOND_NUM() != other.getOI_SECOND_NUM()) {
                                        return false;
                                    } else {
                                        Object this$OI_COMMERCE_CODE = this.getOI_COMMERCE_CODE();
                                        Object other$OI_COMMERCE_CODE = other.getOI_COMMERCE_CODE();
                                        if (this$OI_COMMERCE_CODE == null) {
                                            if (other$OI_COMMERCE_CODE != null) {
                                                return false;
                                            }
                                        } else if (!this$OI_COMMERCE_CODE.equals(other$OI_COMMERCE_CODE)) {
                                            return false;
                                        }

                                        Object this$OI_COMMERCE_NAME = this.getOI_COMMERCE_NAME();
                                        Object other$OI_COMMERCE_NAME = other.getOI_COMMERCE_NAME();
                                        if (this$OI_COMMERCE_NAME == null) {
                                            if (other$OI_COMMERCE_NAME != null) {
                                                return false;
                                            }
                                        } else if (!this$OI_COMMERCE_NAME.equals(other$OI_COMMERCE_NAME)) {
                                            return false;
                                        }

                                        label252: {
                                            Object this$OI_LOCAL_START_TIME = this.getOI_LOCAL_START_TIME();
                                            Object other$OI_LOCAL_START_TIME = other.getOI_LOCAL_START_TIME();
                                            if (this$OI_LOCAL_START_TIME == null) {
                                                if (other$OI_LOCAL_START_TIME == null) {
                                                    break label252;
                                                }
                                            } else if (this$OI_LOCAL_START_TIME.equals(other$OI_LOCAL_START_TIME)) {
                                                break label252;
                                            }

                                            return false;
                                        }

                                        Object this$OI_STANDARD_START_TIME = this.getOI_STANDARD_START_TIME();
                                        Object other$OI_STANDARD_START_TIME = other.getOI_STANDARD_START_TIME();
                                        if (this$OI_STANDARD_START_TIME == null) {
                                            if (other$OI_STANDARD_START_TIME != null) {
                                                return false;
                                            }
                                        } else if (!this$OI_STANDARD_START_TIME.equals(other$OI_STANDARD_START_TIME)) {
                                            return false;
                                        }

                                        Object this$OI_MONITOR_STATUS = this.getOI_MONITOR_STATUS();
                                        Object other$OI_MONITOR_STATUS = other.getOI_MONITOR_STATUS();
                                        if (this$OI_MONITOR_STATUS == null) {
                                            if (other$OI_MONITOR_STATUS != null) {
                                                return false;
                                            }
                                        } else if (!this$OI_MONITOR_STATUS.equals(other$OI_MONITOR_STATUS)) {
                                            return false;
                                        }

                                        label231: {
                                            Object this$OI_TIME_MONITOR_STATUS = this.getOI_TIME_MONITOR_STATUS();
                                            Object other$OI_TIME_MONITOR_STATUS = other.getOI_TIME_MONITOR_STATUS();
                                            if (this$OI_TIME_MONITOR_STATUS == null) {
                                                if (other$OI_TIME_MONITOR_STATUS == null) {
                                                    break label231;
                                                }
                                            } else if (this$OI_TIME_MONITOR_STATUS.equals(other$OI_TIME_MONITOR_STATUS)) {
                                                break label231;
                                            }

                                            return false;
                                        }

                                        Object this$OI_STANDARD_TIME_TYPE = this.getOI_STANDARD_TIME_TYPE();
                                        Object other$OI_STANDARD_TIME_TYPE = other.getOI_STANDARD_TIME_TYPE();
                                        if (this$OI_STANDARD_TIME_TYPE == null) {
                                            if (other$OI_STANDARD_TIME_TYPE != null) {
                                                return false;
                                            }
                                        } else if (!this$OI_STANDARD_TIME_TYPE.equals(other$OI_STANDARD_TIME_TYPE)) {
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
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof mysql_BP_ORDER_INFO;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $OI_ID = this.getOI_ID();
//        int result = result * 59 + ($OI_ID == null ? 43 : $OI_ID.hashCode());
//        Object $OI_UUID = this.getOI_UUID();
//        result = result * 59 + ($OI_UUID == null ? 43 : $OI_UUID.hashCode());
//        Object $OI_B_CODE = this.getOI_B_CODE();
//        result = result * 59 + ($OI_B_CODE == null ? 43 : $OI_B_CODE.hashCode());
//        Object $OI_B_TYPE = this.getOI_B_TYPE();
//        result = result * 59 + ($OI_B_TYPE == null ? 43 : $OI_B_TYPE.hashCode());
//        Object $OI_ISCHANGE_SLINE = this.getOI_ISCHANGE_SLINE();
//        result = result * 59 + ($OI_ISCHANGE_SLINE == null ? 43 : $OI_ISCHANGE_SLINE.hashCode());
//        Object $OI_DL_CODE = this.getOI_DL_CODE();
//        result = result * 59 + ($OI_DL_CODE == null ? 43 : $OI_DL_CODE.hashCode());
//        Object $OI_DL_NAME = this.getOI_DL_NAME();
//        result = result * 59 + ($OI_DL_NAME == null ? 43 : $OI_DL_NAME.hashCode());
//        Object $OI_SLINE_CODE = this.getOI_SLINE_CODE();
//        result = result * 59 + ($OI_SLINE_CODE == null ? 43 : $OI_SLINE_CODE.hashCode());
//        Object $OI_SLINE_NAME = this.getOI_SLINE_NAME();
//        result = result * 59 + ($OI_SLINE_NAME == null ? 43 : $OI_SLINE_NAME.hashCode());
//        result = result * 59 + this.getOI_SEQUENCE();
//        Object $OI_CODE = this.getOI_CODE();
//        result = result * 59 + ($OI_CODE == null ? 43 : $OI_CODE.hashCode());
//        Object $OI_RETAILER_CODE = this.getOI_RETAILER_CODE();
//        result = result * 59 + ($OI_RETAILER_CODE == null ? 43 : $OI_RETAILER_CODE.hashCode());
//        Object $OI_RETAILER_NAME = this.getOI_RETAILER_NAME();
//        result = result * 59 + ($OI_RETAILER_NAME == null ? 43 : $OI_RETAILER_NAME.hashCode());
//        Object $OI_DATE = this.getOI_DATE();
//        result = result * 59 + ($OI_DATE == null ? 43 : $OI_DATE.hashCode());
//        Object $OI_SORT_DATE = this.getOI_SORT_DATE();
//        result = result * 59 + ($OI_SORT_DATE == null ? 43 : $OI_SORT_DATE.hashCode());
//        Object $OI_CIG_FLAG = this.getOI_CIG_FLAG();
//        result = result * 59 + ($OI_CIG_FLAG == null ? 43 : $OI_CIG_FLAG.hashCode());
//        result = result * 59 + this.getOI_ALL_NUM();
//        result = result * 59 + this.getOI_NORMAL_NUM();
//        Object $OI_CUSTOM_INFO = this.getOI_CUSTOM_INFO();
//        result = result * 59 + ($OI_CUSTOM_INFO == null ? 43 : $OI_CUSTOM_INFO.hashCode());
//        result = result * 59 + this.getOI_CHECK_NUM();
//        result = result * 59 + this.getOI_SEND_NUM();
//        result = result * 59 + this.getOI_PRINT_NUM();
//        result = result * 59 + this.getOI_RESEL_ORDER_NUM();
//        Object $OI_START_TIME = this.getOI_START_TIME();
//        result = result * 59 + ($OI_START_TIME == null ? 43 : $OI_START_TIME.hashCode());
//        Object $OI_END_TIME = this.getOI_END_TIME();
//        result = result * 59 + ($OI_END_TIME == null ? 43 : $OI_END_TIME.hashCode());
//        Object $OI_STATE = this.getOI_STATE();
//        result = result * 59 + ($OI_STATE == null ? 43 : $OI_STATE.hashCode());
//        Object $OI_SEND_STATE = this.getOI_SEND_STATE();
//        result = result * 59 + ($OI_SEND_STATE == null ? 43 : $OI_SEND_STATE.hashCode());
//        Object $OI_SELF_UPDATE_TIME = this.getOI_SELF_UPDATE_TIME();
//        result = result * 59 + ($OI_SELF_UPDATE_TIME == null ? 43 : $OI_SELF_UPDATE_TIME.hashCode());
//        Object $OI_SUB_UPDATE_TIME = this.getOI_SUB_UPDATE_TIME();
//        result = result * 59 + ($OI_SUB_UPDATE_TIME == null ? 43 : $OI_SUB_UPDATE_TIME.hashCode());
//        Object $OI_B_UUID = this.getOI_B_UUID();
//        result = result * 59 + ($OI_B_UUID == null ? 43 : $OI_B_UUID.hashCode());
//        Object $OI_DL_UUID = this.getOI_DL_UUID();
//        result = result * 59 + ($OI_DL_UUID == null ? 43 : $OI_DL_UUID.hashCode());
//        result = result * 59 + this.getOI_SELF_SEQUENCE();
//        Object $OI_ALL_NUM1 = this.getOI_ALL_NUM1();
//        result = result * 59 + ($OI_ALL_NUM1 == null ? 43 : $OI_ALL_NUM1.hashCode());
//        result = result * 59 + this.getOI_SELF_BATCH_SEQUENCE();
//        Object $OI_TOTAL_SEQUENCE = this.getOI_TOTAL_SEQUENCE();
//        result = result * 59 + ($OI_TOTAL_SEQUENCE == null ? 43 : $OI_TOTAL_SEQUENCE.hashCode());
//        result = result * 59 + this.getOI_ILLEGALITY_NUM();
//        result = result * 59 + this.getOI_SECOND_NUM();
//        Object $OI_COMMERCE_CODE = this.getOI_COMMERCE_CODE();
//        result = result * 59 + ($OI_COMMERCE_CODE == null ? 43 : $OI_COMMERCE_CODE.hashCode());
//        Object $OI_COMMERCE_NAME = this.getOI_COMMERCE_NAME();
//        result = result * 59 + ($OI_COMMERCE_NAME == null ? 43 : $OI_COMMERCE_NAME.hashCode());
//        Object $OI_LOCAL_START_TIME = this.getOI_LOCAL_START_TIME();
//        result = result * 59 + ($OI_LOCAL_START_TIME == null ? 43 : $OI_LOCAL_START_TIME.hashCode());
//        Object $OI_STANDARD_START_TIME = this.getOI_STANDARD_START_TIME();
//        result = result * 59 + ($OI_STANDARD_START_TIME == null ? 43 : $OI_STANDARD_START_TIME.hashCode());
//        Object $OI_MONITOR_STATUS = this.getOI_MONITOR_STATUS();
//        result = result * 59 + ($OI_MONITOR_STATUS == null ? 43 : $OI_MONITOR_STATUS.hashCode());
//        Object $OI_TIME_MONITOR_STATUS = this.getOI_TIME_MONITOR_STATUS();
//        result = result * 59 + ($OI_TIME_MONITOR_STATUS == null ? 43 : $OI_TIME_MONITOR_STATUS.hashCode());
//        Object $OI_STANDARD_TIME_TYPE = this.getOI_STANDARD_TIME_TYPE();
//        result = result * 59 + ($OI_STANDARD_TIME_TYPE == null ? 43 : $OI_STANDARD_TIME_TYPE.hashCode());
//        Object $ID = this.getID();
//        result = result * 59 + ($ID == null ? 43 : $ID.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {

        return Objects.hash(OI_ID, OI_UUID, OI_B_CODE, OI_B_TYPE, OI_ISCHANGE_SLINE, OI_DL_CODE, OI_DL_NAME, OI_SLINE_CODE, OI_SLINE_NAME, OI_SEQUENCE, OI_CODE, OI_RETAILER_CODE, OI_RETAILER_NAME, OI_DATE, OI_SORT_DATE, OI_CIG_FLAG, OI_ALL_NUM, OI_NORMAL_NUM, OI_CUSTOM_INFO, OI_CHECK_NUM, OI_SEND_NUM, OI_PRINT_NUM, OI_RESEL_ORDER_NUM, OI_START_TIME, OI_END_TIME, OI_STATE, OI_SEND_STATE, OI_SELF_UPDATE_TIME, OI_SUB_UPDATE_TIME, OI_B_UUID, OI_DL_UUID, OI_SELF_SEQUENCE, OI_ALL_NUM1, OI_SELF_BATCH_SEQUENCE, OI_TOTAL_SEQUENCE, OI_ILLEGALITY_NUM, OI_SECOND_NUM, OI_COMMERCE_CODE, OI_COMMERCE_NAME, OI_LOCAL_START_TIME, OI_STANDARD_START_TIME, OI_MONITOR_STATUS, OI_TIME_MONITOR_STATUS, OI_STANDARD_TIME_TYPE, ID);
    }

    @ConstructorProperties({"OI_ID", "OI_UUID", "OI_B_CODE", "OI_B_TYPE", "OI_ISCHANGE_SLINE", "OI_DL_CODE", "OI_DL_NAME", "OI_SLINE_CODE", "OI_SLINE_NAME", "OI_SEQUENCE", "OI_CODE", "OI_RETAILER_CODE", "OI_RETAILER_NAME", "OI_DATE", "OI_SORT_DATE", "OI_CIG_FLAG", "OI_ALL_NUM", "OI_NORMAL_NUM", "OI_CUSTOM_INFO", "OI_CHECK_NUM", "OI_SEND_NUM", "OI_PRINT_NUM", "OI_RESEL_ORDER_NUM", "OI_START_TIME", "OI_END_TIME", "OI_STATE", "OI_SEND_STATE", "OI_SELF_UPDATE_TIME", "OI_SUB_UPDATE_TIME", "OI_B_UUID", "OI_DL_UUID", "OI_SELF_SEQUENCE", "OI_ALL_NUM1", "OI_SELF_BATCH_SEQUENCE", "OI_TOTAL_SEQUENCE", "OI_ILLEGALITY_NUM", "OI_SECOND_NUM", "OI_COMMERCE_CODE", "OI_COMMERCE_NAME", "OI_LOCAL_START_TIME", "OI_STANDARD_START_TIME", "OI_MONITOR_STATUS", "OI_TIME_MONITOR_STATUS", "OI_STANDARD_TIME_TYPE", "ID"})
    public mysql_BP_ORDER_INFO(BigInteger OI_ID, String OI_UUID, String OI_B_CODE, String OI_B_TYPE, String OI_ISCHANGE_SLINE, String OI_DL_CODE, String OI_DL_NAME, String OI_SLINE_CODE, String OI_SLINE_NAME, int OI_SEQUENCE, String OI_CODE, String OI_RETAILER_CODE, String OI_RETAILER_NAME, LocalDateTime OI_DATE, LocalDateTime OI_SORT_DATE, String OI_CIG_FLAG, int OI_ALL_NUM, int OI_NORMAL_NUM, String OI_CUSTOM_INFO, int OI_CHECK_NUM, int OI_SEND_NUM, int OI_PRINT_NUM, int OI_RESEL_ORDER_NUM, LocalDateTime OI_START_TIME, LocalDateTime OI_END_TIME, String OI_STATE, String OI_SEND_STATE, LocalDateTime OI_SELF_UPDATE_TIME, LocalDateTime OI_SUB_UPDATE_TIME, String OI_B_UUID, String OI_DL_UUID, int OI_SELF_SEQUENCE, BigDecimal OI_ALL_NUM1, int OI_SELF_BATCH_SEQUENCE, BigInteger OI_TOTAL_SEQUENCE, int OI_ILLEGALITY_NUM, int OI_SECOND_NUM, String OI_COMMERCE_CODE, String OI_COMMERCE_NAME, LocalDateTime OI_LOCAL_START_TIME, LocalDateTime OI_STANDARD_START_TIME, String OI_MONITOR_STATUS, String OI_TIME_MONITOR_STATUS, String OI_STANDARD_TIME_TYPE, String ID) {
        this.OI_ID = OI_ID;
        this.OI_UUID = OI_UUID;
        this.OI_B_CODE = OI_B_CODE;
        this.OI_B_TYPE = OI_B_TYPE;
        this.OI_ISCHANGE_SLINE = OI_ISCHANGE_SLINE;
        this.OI_DL_CODE = OI_DL_CODE;
        this.OI_DL_NAME = OI_DL_NAME;
        this.OI_SLINE_CODE = OI_SLINE_CODE;
        this.OI_SLINE_NAME = OI_SLINE_NAME;
        this.OI_SEQUENCE = OI_SEQUENCE;
        this.OI_CODE = OI_CODE;
        this.OI_RETAILER_CODE = OI_RETAILER_CODE;
        this.OI_RETAILER_NAME = OI_RETAILER_NAME;
        this.OI_DATE = OI_DATE;
        this.OI_SORT_DATE = OI_SORT_DATE;
        this.OI_CIG_FLAG = OI_CIG_FLAG;
        this.OI_ALL_NUM = OI_ALL_NUM;
        this.OI_NORMAL_NUM = OI_NORMAL_NUM;
        this.OI_CUSTOM_INFO = OI_CUSTOM_INFO;
        this.OI_CHECK_NUM = OI_CHECK_NUM;
        this.OI_SEND_NUM = OI_SEND_NUM;
        this.OI_PRINT_NUM = OI_PRINT_NUM;
        this.OI_RESEL_ORDER_NUM = OI_RESEL_ORDER_NUM;
        this.OI_START_TIME = OI_START_TIME;
        this.OI_END_TIME = OI_END_TIME;
        this.OI_STATE = OI_STATE;
        this.OI_SEND_STATE = OI_SEND_STATE;
        this.OI_SELF_UPDATE_TIME = OI_SELF_UPDATE_TIME;
        this.OI_SUB_UPDATE_TIME = OI_SUB_UPDATE_TIME;
        this.OI_B_UUID = OI_B_UUID;
        this.OI_DL_UUID = OI_DL_UUID;
        this.OI_SELF_SEQUENCE = OI_SELF_SEQUENCE;
        this.OI_ALL_NUM1 = OI_ALL_NUM1;
        this.OI_SELF_BATCH_SEQUENCE = OI_SELF_BATCH_SEQUENCE;
        this.OI_TOTAL_SEQUENCE = OI_TOTAL_SEQUENCE;
        this.OI_ILLEGALITY_NUM = OI_ILLEGALITY_NUM;
        this.OI_SECOND_NUM = OI_SECOND_NUM;
        this.OI_COMMERCE_CODE = OI_COMMERCE_CODE;
        this.OI_COMMERCE_NAME = OI_COMMERCE_NAME;
        this.OI_LOCAL_START_TIME = OI_LOCAL_START_TIME;
        this.OI_STANDARD_START_TIME = OI_STANDARD_START_TIME;
        this.OI_MONITOR_STATUS = OI_MONITOR_STATUS;
        this.OI_TIME_MONITOR_STATUS = OI_TIME_MONITOR_STATUS;
        this.OI_STANDARD_TIME_TYPE = OI_STANDARD_TIME_TYPE;
        this.ID = ID;
    }

    public mysql_BP_ORDER_INFO() {
    }
}

