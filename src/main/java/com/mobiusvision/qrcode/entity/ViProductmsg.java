package com.mobiusvision.qrcode.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Objects;

@TableName("VI_PRODUCTMSG")
public class ViProductmsg implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("BIGBOX_BAR")
    private String bigboxBar;
    @TableField("PACK_BAR")
    private String packBar;
    @TableField("BOX_BAR")
    private String boxBar;
    @TableField("ITEM_NAME")
    private String itemName;
    @TableField("PACK_KIND")
    private String packKind;

    public ViProductmsg() {
    }

    public String getBigboxBar() {
        return this.bigboxBar;
    }

    public String getPackBar() {
        return this.packBar;
    }

    public String getBoxBar() {
        return this.boxBar;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getPackKind() {
        return this.packKind;
    }

    public ViProductmsg setBigboxBar(String bigboxBar) {
        this.bigboxBar = bigboxBar;
        return this;
    }

    public ViProductmsg setPackBar(String packBar) {
        this.packBar = packBar;
        return this;
    }

    public ViProductmsg setBoxBar(String boxBar) {
        this.boxBar = boxBar;
        return this;
    }

    public ViProductmsg setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public ViProductmsg setPackKind(String packKind) {
        this.packKind = packKind;
        return this;
    }

    public String toString() {
        return "ViProductmsg(bigboxBar=" + this.getBigboxBar() + ", packBar=" + this.getPackBar() + ", boxBar=" + this.getBoxBar() + ", itemName=" + this.getItemName() + ", packKind=" + this.getPackKind() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ViProductmsg)) {
            return false;
        } else {
            ViProductmsg other = (ViProductmsg)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$bigboxBar = this.getBigboxBar();
                    Object other$bigboxBar = other.getBigboxBar();
                    if (this$bigboxBar == null) {
                        if (other$bigboxBar == null) {
                            break label71;
                        }
                    } else if (this$bigboxBar.equals(other$bigboxBar)) {
                        break label71;
                    }

                    return false;
                }

                Object this$packBar = this.getPackBar();
                Object other$packBar = other.getPackBar();
                if (this$packBar == null) {
                    if (other$packBar != null) {
                        return false;
                    }
                } else if (!this$packBar.equals(other$packBar)) {
                    return false;
                }

                label57: {
                    Object this$boxBar = this.getBoxBar();
                    Object other$boxBar = other.getBoxBar();
                    if (this$boxBar == null) {
                        if (other$boxBar == null) {
                            break label57;
                        }
                    } else if (this$boxBar.equals(other$boxBar)) {
                        break label57;
                    }

                    return false;
                }

                Object this$itemName = this.getItemName();
                Object other$itemName = other.getItemName();
                if (this$itemName == null) {
                    if (other$itemName != null) {
                        return false;
                    }
                } else if (!this$itemName.equals(other$itemName)) {
                    return false;
                }

                Object this$packKind = this.getPackKind();
                Object other$packKind = other.getPackKind();
                if (this$packKind == null) {
                    if (other$packKind == null) {
                        return true;
                    }
                } else if (this$packKind.equals(other$packKind)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ViProductmsg;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $bigboxBar = this.getBigboxBar();
//        int result = result * 59 + ($bigboxBar == null ? 43 : $bigboxBar.hashCode());
//        Object $packBar = this.getPackBar();
//        result = result * 59 + ($packBar == null ? 43 : $packBar.hashCode());
//        Object $boxBar = this.getBoxBar();
//        result = result * 59 + ($boxBar == null ? 43 : $boxBar.hashCode());
//        Object $itemName = this.getItemName();
//        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
//        Object $packKind = this.getPackKind();
//        result = result * 59 + ($packKind == null ? 43 : $packKind.hashCode());
//        return result;
//    }

    @Override
    public int hashCode() {

        return Objects.hash(bigboxBar, packBar, boxBar, itemName, packKind);
    }
}
