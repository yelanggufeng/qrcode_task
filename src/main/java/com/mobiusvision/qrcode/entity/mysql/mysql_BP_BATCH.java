package com.mobiusvision.qrcode.entity.mysql;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mobiusvision.qrcode.entity.BpBatch;

import java.beans.ConstructorProperties;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@TableName("BP_BATCH")
public class mysql_BP_BATCH extends BpBatch {
    private BigInteger B_ID;
    private String B_UUID;
    private LocalDateTime B_SORT_DATE;
    private String B_CODE;
    private int B_SEQUENCE;
    private String B_TYPE;
    private String B_IS_CHANGE_SLINE;
    private String B_SLINE_CODE;
    private int B_ORDER_NUM;
    private int B_SHOULD_SEND_NUM;
    private int B_THIS_SEND_NUM;
    private int B_ALL_RECV_NUM;
    private int B_PRINT_NUM;
    private LocalDateTime B_START_TIME;
    private LocalDateTime B_END_TIME;
    private String B_STATE;
    private String B_SEND_STATE;
    private LocalDateTime B_SELF_UPDATE_TIME;
    private LocalDateTime B_SUB_UPDATE_TIME;
    @TableId
    private String ID;

    public BigInteger getB_ID() {
        return this.B_ID;
    }

    public String getB_UUID() {
        return this.B_UUID;
    }

    public LocalDateTime getB_SORT_DATE() {
        return this.B_SORT_DATE;
    }

    public String getB_CODE() {
        return this.B_CODE;
    }

    public int getB_SEQUENCE() {
        return this.B_SEQUENCE;
    }

    public String getB_TYPE() {
        return this.B_TYPE;
    }

    public String getB_IS_CHANGE_SLINE() {
        return this.B_IS_CHANGE_SLINE;
    }

    public String getB_SLINE_CODE() {
        return this.B_SLINE_CODE;
    }

    public int getB_ORDER_NUM() {
        return this.B_ORDER_NUM;
    }

    public int getB_SHOULD_SEND_NUM() {
        return this.B_SHOULD_SEND_NUM;
    }

    public int getB_THIS_SEND_NUM() {
        return this.B_THIS_SEND_NUM;
    }

    public int getB_ALL_RECV_NUM() {
        return this.B_ALL_RECV_NUM;
    }

    public int getB_PRINT_NUM() {
        return this.B_PRINT_NUM;
    }

    public LocalDateTime getB_START_TIME() {
        return this.B_START_TIME;
    }

    public LocalDateTime getB_END_TIME() {
        return this.B_END_TIME;
    }

    public String getB_STATE() {
        return this.B_STATE;
    }

    public String getB_SEND_STATE() {
        return this.B_SEND_STATE;
    }

    public LocalDateTime getB_SELF_UPDATE_TIME() {
        return this.B_SELF_UPDATE_TIME;
    }

    public LocalDateTime getB_SUB_UPDATE_TIME() {
        return this.B_SUB_UPDATE_TIME;
    }

    public String getID() {
        return this.ID;
    }

    public mysql_BP_BATCH setB_ID(BigInteger B_ID) {
        this.B_ID = B_ID;
        return this;
    }

    public mysql_BP_BATCH setB_UUID(String B_UUID) {
        this.B_UUID = B_UUID;
        return this;
    }

    public mysql_BP_BATCH setB_SORT_DATE(LocalDateTime B_SORT_DATE) {
        this.B_SORT_DATE = B_SORT_DATE;
        return this;
    }

    public mysql_BP_BATCH setB_CODE(String B_CODE) {
        this.B_CODE = B_CODE;
        return this;
    }

    public mysql_BP_BATCH setB_SEQUENCE(int B_SEQUENCE) {
        this.B_SEQUENCE = B_SEQUENCE;
        return this;
    }

    public mysql_BP_BATCH setB_TYPE(String B_TYPE) {
        this.B_TYPE = B_TYPE;
        return this;
    }

    public mysql_BP_BATCH setB_IS_CHANGE_SLINE(String B_IS_CHANGE_SLINE) {
        this.B_IS_CHANGE_SLINE = B_IS_CHANGE_SLINE;
        return this;
    }

    public mysql_BP_BATCH setB_SLINE_CODE(String B_SLINE_CODE) {
        this.B_SLINE_CODE = B_SLINE_CODE;
        return this;
    }

    public mysql_BP_BATCH setB_ORDER_NUM(int B_ORDER_NUM) {
        this.B_ORDER_NUM = B_ORDER_NUM;
        return this;
    }

    public mysql_BP_BATCH setB_SHOULD_SEND_NUM(int B_SHOULD_SEND_NUM) {
        this.B_SHOULD_SEND_NUM = B_SHOULD_SEND_NUM;
        return this;
    }

    public mysql_BP_BATCH setB_THIS_SEND_NUM(int B_THIS_SEND_NUM) {
        this.B_THIS_SEND_NUM = B_THIS_SEND_NUM;
        return this;
    }

    public mysql_BP_BATCH setB_ALL_RECV_NUM(int B_ALL_RECV_NUM) {
        this.B_ALL_RECV_NUM = B_ALL_RECV_NUM;
        return this;
    }

    public mysql_BP_BATCH setB_PRINT_NUM(int B_PRINT_NUM) {
        this.B_PRINT_NUM = B_PRINT_NUM;
        return this;
    }

    public mysql_BP_BATCH setB_START_TIME(LocalDateTime B_START_TIME) {
        this.B_START_TIME = B_START_TIME;
        return this;
    }

    public mysql_BP_BATCH setB_END_TIME(LocalDateTime B_END_TIME) {
        this.B_END_TIME = B_END_TIME;
        return this;
    }

    public mysql_BP_BATCH setB_STATE(String B_STATE) {
        this.B_STATE = B_STATE;
        return this;
    }

    public mysql_BP_BATCH setB_SEND_STATE(String B_SEND_STATE) {
        this.B_SEND_STATE = B_SEND_STATE;
        return this;
    }

    public mysql_BP_BATCH setB_SELF_UPDATE_TIME(LocalDateTime B_SELF_UPDATE_TIME) {
        this.B_SELF_UPDATE_TIME = B_SELF_UPDATE_TIME;
        return this;
    }

    public mysql_BP_BATCH setB_SUB_UPDATE_TIME(LocalDateTime B_SUB_UPDATE_TIME) {
        this.B_SUB_UPDATE_TIME = B_SUB_UPDATE_TIME;
        return this;
    }

    public mysql_BP_BATCH setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String toString() {
        return "mysql_BP_BATCH(B_ID=" + this.getB_ID() + ", B_UUID=" + this.getB_UUID() + ", B_SORT_DATE=" + this.getB_SORT_DATE() + ", B_CODE=" + this.getB_CODE() + ", B_SEQUENCE=" + this.getB_SEQUENCE() + ", B_TYPE=" + this.getB_TYPE() + ", B_IS_CHANGE_SLINE=" + this.getB_IS_CHANGE_SLINE() + ", B_SLINE_CODE=" + this.getB_SLINE_CODE() + ", B_ORDER_NUM=" + this.getB_ORDER_NUM() + ", B_SHOULD_SEND_NUM=" + this.getB_SHOULD_SEND_NUM() + ", B_THIS_SEND_NUM=" + this.getB_THIS_SEND_NUM() + ", B_ALL_RECV_NUM=" + this.getB_ALL_RECV_NUM() + ", B_PRINT_NUM=" + this.getB_PRINT_NUM() + ", B_START_TIME=" + this.getB_START_TIME() + ", B_END_TIME=" + this.getB_END_TIME() + ", B_STATE=" + this.getB_STATE() + ", B_SEND_STATE=" + this.getB_SEND_STATE() + ", B_SELF_UPDATE_TIME=" + this.getB_SELF_UPDATE_TIME() + ", B_SUB_UPDATE_TIME=" + this.getB_SUB_UPDATE_TIME() + ", ID=" + this.getID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof mysql_BP_BATCH)) {
            return false;
        } else {
            mysql_BP_BATCH other = (mysql_BP_BATCH)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label203: {
                    Object this$B_ID = this.getB_ID();
                    Object other$B_ID = other.getB_ID();
                    if (this$B_ID == null) {
                        if (other$B_ID == null) {
                            break label203;
                        }
                    } else if (this$B_ID.equals(other$B_ID)) {
                        break label203;
                    }

                    return false;
                }

                Object this$B_UUID = this.getB_UUID();
                Object other$B_UUID = other.getB_UUID();
                if (this$B_UUID == null) {
                    if (other$B_UUID != null) {
                        return false;
                    }
                } else if (!this$B_UUID.equals(other$B_UUID)) {
                    return false;
                }

                Object this$B_SORT_DATE = this.getB_SORT_DATE();
                Object other$B_SORT_DATE = other.getB_SORT_DATE();
                if (this$B_SORT_DATE == null) {
                    if (other$B_SORT_DATE != null) {
                        return false;
                    }
                } else if (!this$B_SORT_DATE.equals(other$B_SORT_DATE)) {
                    return false;
                }

                label182: {
                    Object this$B_CODE = this.getB_CODE();
                    Object other$B_CODE = other.getB_CODE();
                    if (this$B_CODE == null) {
                        if (other$B_CODE == null) {
                            break label182;
                        }
                    } else if (this$B_CODE.equals(other$B_CODE)) {
                        break label182;
                    }

                    return false;
                }

                if (this.getB_SEQUENCE() != other.getB_SEQUENCE()) {
                    return false;
                } else {
                    Object this$B_TYPE = this.getB_TYPE();
                    Object other$B_TYPE = other.getB_TYPE();
                    if (this$B_TYPE == null) {
                        if (other$B_TYPE != null) {
                            return false;
                        }
                    } else if (!this$B_TYPE.equals(other$B_TYPE)) {
                        return false;
                    }

                    label167: {
                        Object this$B_IS_CHANGE_SLINE = this.getB_IS_CHANGE_SLINE();
                        Object other$B_IS_CHANGE_SLINE = other.getB_IS_CHANGE_SLINE();
                        if (this$B_IS_CHANGE_SLINE == null) {
                            if (other$B_IS_CHANGE_SLINE == null) {
                                break label167;
                            }
                        } else if (this$B_IS_CHANGE_SLINE.equals(other$B_IS_CHANGE_SLINE)) {
                            break label167;
                        }

                        return false;
                    }

                    label160: {
                        Object this$B_SLINE_CODE = this.getB_SLINE_CODE();
                        Object other$B_SLINE_CODE = other.getB_SLINE_CODE();
                        if (this$B_SLINE_CODE == null) {
                            if (other$B_SLINE_CODE == null) {
                                break label160;
                            }
                        } else if (this$B_SLINE_CODE.equals(other$B_SLINE_CODE)) {
                            break label160;
                        }

                        return false;
                    }

                    if (this.getB_ORDER_NUM() != other.getB_ORDER_NUM()) {
                        return false;
                    } else if (this.getB_SHOULD_SEND_NUM() != other.getB_SHOULD_SEND_NUM()) {
                        return false;
                    } else if (this.getB_THIS_SEND_NUM() != other.getB_THIS_SEND_NUM()) {
                        return false;
                    } else if (this.getB_ALL_RECV_NUM() != other.getB_ALL_RECV_NUM()) {
                        return false;
                    } else if (this.getB_PRINT_NUM() != other.getB_PRINT_NUM()) {
                        return false;
                    } else {
                        Object this$B_START_TIME = this.getB_START_TIME();
                        Object other$B_START_TIME = other.getB_START_TIME();
                        if (this$B_START_TIME == null) {
                            if (other$B_START_TIME != null) {
                                return false;
                            }
                        } else if (!this$B_START_TIME.equals(other$B_START_TIME)) {
                            return false;
                        }

                        label139: {
                            Object this$B_END_TIME = this.getB_END_TIME();
                            Object other$B_END_TIME = other.getB_END_TIME();
                            if (this$B_END_TIME == null) {
                                if (other$B_END_TIME == null) {
                                    break label139;
                                }
                            } else if (this$B_END_TIME.equals(other$B_END_TIME)) {
                                break label139;
                            }

                            return false;
                        }

                        Object this$B_STATE = this.getB_STATE();
                        Object other$B_STATE = other.getB_STATE();
                        if (this$B_STATE == null) {
                            if (other$B_STATE != null) {
                                return false;
                            }
                        } else if (!this$B_STATE.equals(other$B_STATE)) {
                            return false;
                        }

                        label125: {
                            Object this$B_SEND_STATE = this.getB_SEND_STATE();
                            Object other$B_SEND_STATE = other.getB_SEND_STATE();
                            if (this$B_SEND_STATE == null) {
                                if (other$B_SEND_STATE == null) {
                                    break label125;
                                }
                            } else if (this$B_SEND_STATE.equals(other$B_SEND_STATE)) {
                                break label125;
                            }

                            return false;
                        }

                        label118: {
                            Object this$B_SELF_UPDATE_TIME = this.getB_SELF_UPDATE_TIME();
                            Object other$B_SELF_UPDATE_TIME = other.getB_SELF_UPDATE_TIME();
                            if (this$B_SELF_UPDATE_TIME == null) {
                                if (other$B_SELF_UPDATE_TIME == null) {
                                    break label118;
                                }
                            } else if (this$B_SELF_UPDATE_TIME.equals(other$B_SELF_UPDATE_TIME)) {
                                break label118;
                            }

                            return false;
                        }

                        Object this$B_SUB_UPDATE_TIME = this.getB_SUB_UPDATE_TIME();
                        Object other$B_SUB_UPDATE_TIME = other.getB_SUB_UPDATE_TIME();
                        if (this$B_SUB_UPDATE_TIME == null) {
                            if (other$B_SUB_UPDATE_TIME != null) {
                                return false;
                            }
                        } else if (!this$B_SUB_UPDATE_TIME.equals(other$B_SUB_UPDATE_TIME)) {
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
        return other instanceof mysql_BP_BATCH;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $B_ID = this.getB_ID();
//        int result = result * 59 + ($B_ID == null ? 43 : $B_ID.hashCode());
//        Object $B_UUID = this.getB_UUID();
//        result = result * 59 + ($B_UUID == null ? 43 : $B_UUID.hashCode());
//        Object $B_SORT_DATE = this.getB_SORT_DATE();
//        result = result * 59 + ($B_SORT_DATE == null ? 43 : $B_SORT_DATE.hashCode());
//        Object $B_CODE = this.getB_CODE();
//        result = result * 59 + ($B_CODE == null ? 43 : $B_CODE.hashCode());
//        result = result * 59 + this.getB_SEQUENCE();
//        Object $B_TYPE = this.getB_TYPE();
//        result = result * 59 + ($B_TYPE == null ? 43 : $B_TYPE.hashCode());
//        Object $B_IS_CHANGE_SLINE = this.getB_IS_CHANGE_SLINE();
//        result = result * 59 + ($B_IS_CHANGE_SLINE == null ? 43 : $B_IS_CHANGE_SLINE.hashCode());
//        Object $B_SLINE_CODE = this.getB_SLINE_CODE();
//        result = result * 59 + ($B_SLINE_CODE == null ? 43 : $B_SLINE_CODE.hashCode());
//        result = result * 59 + this.getB_ORDER_NUM();
//        result = result * 59 + this.getB_SHOULD_SEND_NUM();
//        result = result * 59 + this.getB_THIS_SEND_NUM();
//        result = result * 59 + this.getB_ALL_RECV_NUM();
//        result = result * 59 + this.getB_PRINT_NUM();
//        Object $B_START_TIME = this.getB_START_TIME();
//        result = result * 59 + ($B_START_TIME == null ? 43 : $B_START_TIME.hashCode());
//        Object $B_END_TIME = this.getB_END_TIME();
//        result = result * 59 + ($B_END_TIME == null ? 43 : $B_END_TIME.hashCode());
//        Object $B_STATE = this.getB_STATE();
//        result = result * 59 + ($B_STATE == null ? 43 : $B_STATE.hashCode());
//        Object $B_SEND_STATE = this.getB_SEND_STATE();
//        result = result * 59 + ($B_SEND_STATE == null ? 43 : $B_SEND_STATE.hashCode());
//        Object $B_SELF_UPDATE_TIME = this.getB_SELF_UPDATE_TIME();
//        result = result * 59 + ($B_SELF_UPDATE_TIME == null ? 43 : $B_SELF_UPDATE_TIME.hashCode());
//        Object $B_SUB_UPDATE_TIME = this.getB_SUB_UPDATE_TIME();
//        result = result * 59 + ($B_SUB_UPDATE_TIME == null ? 43 : $B_SUB_UPDATE_TIME.hashCode());
//        Object $ID = this.getID();
//        result = result * 59 + ($ID == null ? 43 : $ID.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {

        return Objects.hash(B_ID, B_UUID, B_SORT_DATE, B_CODE, B_SEQUENCE, B_TYPE, B_IS_CHANGE_SLINE, B_SLINE_CODE, B_ORDER_NUM, B_SHOULD_SEND_NUM, B_THIS_SEND_NUM, B_ALL_RECV_NUM, B_PRINT_NUM, B_START_TIME, B_END_TIME, B_STATE, B_SEND_STATE, B_SELF_UPDATE_TIME, B_SUB_UPDATE_TIME, ID);
    }

    @ConstructorProperties({"B_ID", "B_UUID", "B_SORT_DATE", "B_CODE", "B_SEQUENCE", "B_TYPE", "B_IS_CHANGE_SLINE", "B_SLINE_CODE", "B_ORDER_NUM", "B_SHOULD_SEND_NUM", "B_THIS_SEND_NUM", "B_ALL_RECV_NUM", "B_PRINT_NUM", "B_START_TIME", "B_END_TIME", "B_STATE", "B_SEND_STATE", "B_SELF_UPDATE_TIME", "B_SUB_UPDATE_TIME", "ID"})
    public mysql_BP_BATCH(BigInteger B_ID, String B_UUID, LocalDateTime B_SORT_DATE, String B_CODE, int B_SEQUENCE, String B_TYPE, String B_IS_CHANGE_SLINE, String B_SLINE_CODE, int B_ORDER_NUM, int B_SHOULD_SEND_NUM, int B_THIS_SEND_NUM, int B_ALL_RECV_NUM, int B_PRINT_NUM, LocalDateTime B_START_TIME, LocalDateTime B_END_TIME, String B_STATE, String B_SEND_STATE, LocalDateTime B_SELF_UPDATE_TIME, LocalDateTime B_SUB_UPDATE_TIME, String ID) {
        this.B_ID = B_ID;
        this.B_UUID = B_UUID;
        this.B_SORT_DATE = B_SORT_DATE;
        this.B_CODE = B_CODE;
        this.B_SEQUENCE = B_SEQUENCE;
        this.B_TYPE = B_TYPE;
        this.B_IS_CHANGE_SLINE = B_IS_CHANGE_SLINE;
        this.B_SLINE_CODE = B_SLINE_CODE;
        this.B_ORDER_NUM = B_ORDER_NUM;
        this.B_SHOULD_SEND_NUM = B_SHOULD_SEND_NUM;
        this.B_THIS_SEND_NUM = B_THIS_SEND_NUM;
        this.B_ALL_RECV_NUM = B_ALL_RECV_NUM;
        this.B_PRINT_NUM = B_PRINT_NUM;
        this.B_START_TIME = B_START_TIME;
        this.B_END_TIME = B_END_TIME;
        this.B_STATE = B_STATE;
        this.B_SEND_STATE = B_SEND_STATE;
        this.B_SELF_UPDATE_TIME = B_SELF_UPDATE_TIME;
        this.B_SUB_UPDATE_TIME = B_SUB_UPDATE_TIME;
        this.ID = ID;
    }

    public mysql_BP_BATCH() {
    }
}

