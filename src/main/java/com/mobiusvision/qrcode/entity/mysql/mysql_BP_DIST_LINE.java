package com.mobiusvision.qrcode.entity.mysql;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mobiusvision.qrcode.entity.BpDistLine;

import java.beans.ConstructorProperties;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@TableName("BP_DIST_LINE")
public class mysql_BP_DIST_LINE extends BpDistLine {
    private BigInteger DL_ID;
    private String DL_UUID;
    private String DL_B_UUID;
    private LocalDateTime DL_SORT_DATE;
    private String DL_B_CODE;
    private String DL_B_TYPE;
    private String DL_CODE;
    private String DL_NAME;
    private int DL_SEQUENCE;
    private int DL_ORDER_NUM;
    private int DL_PRINT_NUM;
    private LocalDateTime DL_START_TIME;
    private LocalDateTime DL_END_TIME;
    private String DL_STATE;
    private String DL_SEND_STATE;
    private LocalDateTime DL_SELF_UPDATE_TIME;
    private LocalDateTime DL_SUB_UPDATE_TIME;
    @TableId
    private String ID;

    public BigInteger getDL_ID() {
        return this.DL_ID;
    }

    public String getDL_UUID() {
        return this.DL_UUID;
    }

    public String getDL_B_UUID() {
        return this.DL_B_UUID;
    }

    public LocalDateTime getDL_SORT_DATE() {
        return this.DL_SORT_DATE;
    }

    public String getDL_B_CODE() {
        return this.DL_B_CODE;
    }

    public String getDL_B_TYPE() {
        return this.DL_B_TYPE;
    }

    public String getDL_CODE() {
        return this.DL_CODE;
    }

    public String getDL_NAME() {
        return this.DL_NAME;
    }

    public int getDL_SEQUENCE() {
        return this.DL_SEQUENCE;
    }

    public int getDL_ORDER_NUM() {
        return this.DL_ORDER_NUM;
    }

    public int getDL_PRINT_NUM() {
        return this.DL_PRINT_NUM;
    }

    public LocalDateTime getDL_START_TIME() {
        return this.DL_START_TIME;
    }

    public LocalDateTime getDL_END_TIME() {
        return this.DL_END_TIME;
    }

    public String getDL_STATE() {
        return this.DL_STATE;
    }

    public String getDL_SEND_STATE() {
        return this.DL_SEND_STATE;
    }

    public LocalDateTime getDL_SELF_UPDATE_TIME() {
        return this.DL_SELF_UPDATE_TIME;
    }

    public LocalDateTime getDL_SUB_UPDATE_TIME() {
        return this.DL_SUB_UPDATE_TIME;
    }

    public String getID() {
        return this.ID;
    }

    public mysql_BP_DIST_LINE setDL_ID(BigInteger DL_ID) {
        this.DL_ID = DL_ID;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_UUID(String DL_UUID) {
        this.DL_UUID = DL_UUID;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_B_UUID(String DL_B_UUID) {
        this.DL_B_UUID = DL_B_UUID;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_SORT_DATE(LocalDateTime DL_SORT_DATE) {
        this.DL_SORT_DATE = DL_SORT_DATE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_B_CODE(String DL_B_CODE) {
        this.DL_B_CODE = DL_B_CODE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_B_TYPE(String DL_B_TYPE) {
        this.DL_B_TYPE = DL_B_TYPE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_CODE(String DL_CODE) {
        this.DL_CODE = DL_CODE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_NAME(String DL_NAME) {
        this.DL_NAME = DL_NAME;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_SEQUENCE(int DL_SEQUENCE) {
        this.DL_SEQUENCE = DL_SEQUENCE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_ORDER_NUM(int DL_ORDER_NUM) {
        this.DL_ORDER_NUM = DL_ORDER_NUM;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_PRINT_NUM(int DL_PRINT_NUM) {
        this.DL_PRINT_NUM = DL_PRINT_NUM;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_START_TIME(LocalDateTime DL_START_TIME) {
        this.DL_START_TIME = DL_START_TIME;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_END_TIME(LocalDateTime DL_END_TIME) {
        this.DL_END_TIME = DL_END_TIME;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_STATE(String DL_STATE) {
        this.DL_STATE = DL_STATE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_SEND_STATE(String DL_SEND_STATE) {
        this.DL_SEND_STATE = DL_SEND_STATE;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_SELF_UPDATE_TIME(LocalDateTime DL_SELF_UPDATE_TIME) {
        this.DL_SELF_UPDATE_TIME = DL_SELF_UPDATE_TIME;
        return this;
    }

    public mysql_BP_DIST_LINE setDL_SUB_UPDATE_TIME(LocalDateTime DL_SUB_UPDATE_TIME) {
        this.DL_SUB_UPDATE_TIME = DL_SUB_UPDATE_TIME;
        return this;
    }

    public mysql_BP_DIST_LINE setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String toString() {
        return "mysql_BP_DIST_LINE(DL_ID=" + this.getDL_ID() + ", DL_UUID=" + this.getDL_UUID() + ", DL_B_UUID=" + this.getDL_B_UUID() + ", DL_SORT_DATE=" + this.getDL_SORT_DATE() + ", DL_B_CODE=" + this.getDL_B_CODE() + ", DL_B_TYPE=" + this.getDL_B_TYPE() + ", DL_CODE=" + this.getDL_CODE() + ", DL_NAME=" + this.getDL_NAME() + ", DL_SEQUENCE=" + this.getDL_SEQUENCE() + ", DL_ORDER_NUM=" + this.getDL_ORDER_NUM() + ", DL_PRINT_NUM=" + this.getDL_PRINT_NUM() + ", DL_START_TIME=" + this.getDL_START_TIME() + ", DL_END_TIME=" + this.getDL_END_TIME() + ", DL_STATE=" + this.getDL_STATE() + ", DL_SEND_STATE=" + this.getDL_SEND_STATE() + ", DL_SELF_UPDATE_TIME=" + this.getDL_SELF_UPDATE_TIME() + ", DL_SUB_UPDATE_TIME=" + this.getDL_SUB_UPDATE_TIME() + ", ID=" + this.getID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof mysql_BP_DIST_LINE)) {
            return false;
        } else {
            mysql_BP_DIST_LINE other = (mysql_BP_DIST_LINE)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label203: {
                    Object this$DL_ID = this.getDL_ID();
                    Object other$DL_ID = other.getDL_ID();
                    if (this$DL_ID == null) {
                        if (other$DL_ID == null) {
                            break label203;
                        }
                    } else if (this$DL_ID.equals(other$DL_ID)) {
                        break label203;
                    }

                    return false;
                }

                Object this$DL_UUID = this.getDL_UUID();
                Object other$DL_UUID = other.getDL_UUID();
                if (this$DL_UUID == null) {
                    if (other$DL_UUID != null) {
                        return false;
                    }
                } else if (!this$DL_UUID.equals(other$DL_UUID)) {
                    return false;
                }

                Object this$DL_B_UUID = this.getDL_B_UUID();
                Object other$DL_B_UUID = other.getDL_B_UUID();
                if (this$DL_B_UUID == null) {
                    if (other$DL_B_UUID != null) {
                        return false;
                    }
                } else if (!this$DL_B_UUID.equals(other$DL_B_UUID)) {
                    return false;
                }

                label182: {
                    Object this$DL_SORT_DATE = this.getDL_SORT_DATE();
                    Object other$DL_SORT_DATE = other.getDL_SORT_DATE();
                    if (this$DL_SORT_DATE == null) {
                        if (other$DL_SORT_DATE == null) {
                            break label182;
                        }
                    } else if (this$DL_SORT_DATE.equals(other$DL_SORT_DATE)) {
                        break label182;
                    }

                    return false;
                }

                label175: {
                    Object this$DL_B_CODE = this.getDL_B_CODE();
                    Object other$DL_B_CODE = other.getDL_B_CODE();
                    if (this$DL_B_CODE == null) {
                        if (other$DL_B_CODE == null) {
                            break label175;
                        }
                    } else if (this$DL_B_CODE.equals(other$DL_B_CODE)) {
                        break label175;
                    }

                    return false;
                }

                label168: {
                    Object this$DL_B_TYPE = this.getDL_B_TYPE();
                    Object other$DL_B_TYPE = other.getDL_B_TYPE();
                    if (this$DL_B_TYPE == null) {
                        if (other$DL_B_TYPE == null) {
                            break label168;
                        }
                    } else if (this$DL_B_TYPE.equals(other$DL_B_TYPE)) {
                        break label168;
                    }

                    return false;
                }

                Object this$DL_CODE = this.getDL_CODE();
                Object other$DL_CODE = other.getDL_CODE();
                if (this$DL_CODE == null) {
                    if (other$DL_CODE != null) {
                        return false;
                    }
                } else if (!this$DL_CODE.equals(other$DL_CODE)) {
                    return false;
                }

                label154: {
                    Object this$DL_NAME = this.getDL_NAME();
                    Object other$DL_NAME = other.getDL_NAME();
                    if (this$DL_NAME == null) {
                        if (other$DL_NAME == null) {
                            break label154;
                        }
                    } else if (this$DL_NAME.equals(other$DL_NAME)) {
                        break label154;
                    }

                    return false;
                }

                if (this.getDL_SEQUENCE() != other.getDL_SEQUENCE()) {
                    return false;
                } else if (this.getDL_ORDER_NUM() != other.getDL_ORDER_NUM()) {
                    return false;
                } else if (this.getDL_PRINT_NUM() != other.getDL_PRINT_NUM()) {
                    return false;
                } else {
                    label143: {
                        Object this$DL_START_TIME = this.getDL_START_TIME();
                        Object other$DL_START_TIME = other.getDL_START_TIME();
                        if (this$DL_START_TIME == null) {
                            if (other$DL_START_TIME == null) {
                                break label143;
                            }
                        } else if (this$DL_START_TIME.equals(other$DL_START_TIME)) {
                            break label143;
                        }

                        return false;
                    }

                    label136: {
                        Object this$DL_END_TIME = this.getDL_END_TIME();
                        Object other$DL_END_TIME = other.getDL_END_TIME();
                        if (this$DL_END_TIME == null) {
                            if (other$DL_END_TIME == null) {
                                break label136;
                            }
                        } else if (this$DL_END_TIME.equals(other$DL_END_TIME)) {
                            break label136;
                        }

                        return false;
                    }

                    Object this$DL_STATE = this.getDL_STATE();
                    Object other$DL_STATE = other.getDL_STATE();
                    if (this$DL_STATE == null) {
                        if (other$DL_STATE != null) {
                            return false;
                        }
                    } else if (!this$DL_STATE.equals(other$DL_STATE)) {
                        return false;
                    }

                    label122: {
                        Object this$DL_SEND_STATE = this.getDL_SEND_STATE();
                        Object other$DL_SEND_STATE = other.getDL_SEND_STATE();
                        if (this$DL_SEND_STATE == null) {
                            if (other$DL_SEND_STATE == null) {
                                break label122;
                            }
                        } else if (this$DL_SEND_STATE.equals(other$DL_SEND_STATE)) {
                            break label122;
                        }

                        return false;
                    }

                    label115: {
                        Object this$DL_SELF_UPDATE_TIME = this.getDL_SELF_UPDATE_TIME();
                        Object other$DL_SELF_UPDATE_TIME = other.getDL_SELF_UPDATE_TIME();
                        if (this$DL_SELF_UPDATE_TIME == null) {
                            if (other$DL_SELF_UPDATE_TIME == null) {
                                break label115;
                            }
                        } else if (this$DL_SELF_UPDATE_TIME.equals(other$DL_SELF_UPDATE_TIME)) {
                            break label115;
                        }

                        return false;
                    }

                    Object this$DL_SUB_UPDATE_TIME = this.getDL_SUB_UPDATE_TIME();
                    Object other$DL_SUB_UPDATE_TIME = other.getDL_SUB_UPDATE_TIME();
                    if (this$DL_SUB_UPDATE_TIME == null) {
                        if (other$DL_SUB_UPDATE_TIME != null) {
                            return false;
                        }
                    } else if (!this$DL_SUB_UPDATE_TIME.equals(other$DL_SUB_UPDATE_TIME)) {
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
        return other instanceof mysql_BP_DIST_LINE;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $DL_ID = this.getDL_ID();
//        int result = result * 59 + ($DL_ID == null ? 43 : $DL_ID.hashCode());
//        Object $DL_UUID = this.getDL_UUID();
//        result = result * 59 + ($DL_UUID == null ? 43 : $DL_UUID.hashCode());
//        Object $DL_B_UUID = this.getDL_B_UUID();
//        result = result * 59 + ($DL_B_UUID == null ? 43 : $DL_B_UUID.hashCode());
//        Object $DL_SORT_DATE = this.getDL_SORT_DATE();
//        result = result * 59 + ($DL_SORT_DATE == null ? 43 : $DL_SORT_DATE.hashCode());
//        Object $DL_B_CODE = this.getDL_B_CODE();
//        result = result * 59 + ($DL_B_CODE == null ? 43 : $DL_B_CODE.hashCode());
//        Object $DL_B_TYPE = this.getDL_B_TYPE();
//        result = result * 59 + ($DL_B_TYPE == null ? 43 : $DL_B_TYPE.hashCode());
//        Object $DL_CODE = this.getDL_CODE();
//        result = result * 59 + ($DL_CODE == null ? 43 : $DL_CODE.hashCode());
//        Object $DL_NAME = this.getDL_NAME();
//        result = result * 59 + ($DL_NAME == null ? 43 : $DL_NAME.hashCode());
//        result = result * 59 + this.getDL_SEQUENCE();
//        result = result * 59 + this.getDL_ORDER_NUM();
//        result = result * 59 + this.getDL_PRINT_NUM();
//        Object $DL_START_TIME = this.getDL_START_TIME();
//        result = result * 59 + ($DL_START_TIME == null ? 43 : $DL_START_TIME.hashCode());
//        Object $DL_END_TIME = this.getDL_END_TIME();
//        result = result * 59 + ($DL_END_TIME == null ? 43 : $DL_END_TIME.hashCode());
//        Object $DL_STATE = this.getDL_STATE();
//        result = result * 59 + ($DL_STATE == null ? 43 : $DL_STATE.hashCode());
//        Object $DL_SEND_STATE = this.getDL_SEND_STATE();
//        result = result * 59 + ($DL_SEND_STATE == null ? 43 : $DL_SEND_STATE.hashCode());
//        Object $DL_SELF_UPDATE_TIME = this.getDL_SELF_UPDATE_TIME();
//        result = result * 59 + ($DL_SELF_UPDATE_TIME == null ? 43 : $DL_SELF_UPDATE_TIME.hashCode());
//        Object $DL_SUB_UPDATE_TIME = this.getDL_SUB_UPDATE_TIME();
//        result = result * 59 + ($DL_SUB_UPDATE_TIME == null ? 43 : $DL_SUB_UPDATE_TIME.hashCode());
//        Object $ID = this.getID();
//        result = result * 59 + ($ID == null ? 43 : $ID.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {

        return Objects.hash(DL_ID, DL_UUID, DL_B_UUID, DL_SORT_DATE, DL_B_CODE, DL_B_TYPE, DL_CODE, DL_NAME, DL_SEQUENCE, DL_ORDER_NUM, DL_PRINT_NUM, DL_START_TIME, DL_END_TIME, DL_STATE, DL_SEND_STATE, DL_SELF_UPDATE_TIME, DL_SUB_UPDATE_TIME, ID);
    }

    @ConstructorProperties({"DL_ID", "DL_UUID", "DL_B_UUID", "DL_SORT_DATE", "DL_B_CODE", "DL_B_TYPE", "DL_CODE", "DL_NAME", "DL_SEQUENCE", "DL_ORDER_NUM", "DL_PRINT_NUM", "DL_START_TIME", "DL_END_TIME", "DL_STATE", "DL_SEND_STATE", "DL_SELF_UPDATE_TIME", "DL_SUB_UPDATE_TIME", "ID"})
    public mysql_BP_DIST_LINE(BigInteger DL_ID, String DL_UUID, String DL_B_UUID, LocalDateTime DL_SORT_DATE, String DL_B_CODE, String DL_B_TYPE, String DL_CODE, String DL_NAME, int DL_SEQUENCE, int DL_ORDER_NUM, int DL_PRINT_NUM, LocalDateTime DL_START_TIME, LocalDateTime DL_END_TIME, String DL_STATE, String DL_SEND_STATE, LocalDateTime DL_SELF_UPDATE_TIME, LocalDateTime DL_SUB_UPDATE_TIME, String ID) {
        this.DL_ID = DL_ID;
        this.DL_UUID = DL_UUID;
        this.DL_B_UUID = DL_B_UUID;
        this.DL_SORT_DATE = DL_SORT_DATE;
        this.DL_B_CODE = DL_B_CODE;
        this.DL_B_TYPE = DL_B_TYPE;
        this.DL_CODE = DL_CODE;
        this.DL_NAME = DL_NAME;
        this.DL_SEQUENCE = DL_SEQUENCE;
        this.DL_ORDER_NUM = DL_ORDER_NUM;
        this.DL_PRINT_NUM = DL_PRINT_NUM;
        this.DL_START_TIME = DL_START_TIME;
        this.DL_END_TIME = DL_END_TIME;
        this.DL_STATE = DL_STATE;
        this.DL_SEND_STATE = DL_SEND_STATE;
        this.DL_SELF_UPDATE_TIME = DL_SELF_UPDATE_TIME;
        this.DL_SUB_UPDATE_TIME = DL_SUB_UPDATE_TIME;
        this.ID = ID;
    }

    public mysql_BP_DIST_LINE() {
    }
}

