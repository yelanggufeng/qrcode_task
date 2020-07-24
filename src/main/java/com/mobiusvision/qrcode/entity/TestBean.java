package com.mobiusvision.qrcode.entity;

import java.beans.ConstructorProperties;
import java.math.BigInteger;
import java.util.Objects;

public class TestBean {

    private BigInteger OCIID;
    private String OCIUUID;

    public BigInteger getOCIID() {
        return this.OCIID;
    }

    public String getOCIUUID() {
        return this.OCIUUID;
    }

    public TestBean setOCIID(BigInteger OCIID) {
        this.OCIID = OCIID;
        return this;
    }

    public TestBean setOCIUUID(String OCIUUID) {
        this.OCIUUID = OCIUUID;
        return this;
    }

    public String toString() {
        return "TestBean(OCIID=" + this.getOCIID() + ", OCIUUID=" + this.getOCIUUID() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TestBean)) {
            return false;
        } else {
            TestBean other = (TestBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$OCIID = this.getOCIID();
                Object other$OCIID = other.getOCIID();
                if (this$OCIID == null) {
                    if (other$OCIID != null) {
                        return false;
                    }
                } else if (!this$OCIID.equals(other$OCIID)) {
                    return false;
                }

                Object this$OCIUUID = this.getOCIUUID();
                Object other$OCIUUID = other.getOCIUUID();
                if (this$OCIUUID == null) {
                    if (other$OCIUUID != null) {
                        return false;
                    }
                } else if (!this$OCIUUID.equals(other$OCIUUID)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof TestBean;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $OCIID = this.getOCIID();
//        int result = result * 59 + ($OCIID == null ? 43 : $OCIID.hashCode());
//        Object $OCIUUID = this.getOCIUUID();
//        result = result * 59 + ($OCIUUID == null ? 43 : $OCIUUID.hashCode());
//        return result;
//    }
    @Override
    public int hashCode() {

        return Objects.hash(OCIID, OCIUUID);
    }

    @ConstructorProperties({"OCIID", "OCIUUID"})
    public TestBean(BigInteger OCIID, String OCIUUID) {
        this.OCIID = OCIID;
        this.OCIUUID = OCIUUID;
    }

    public TestBean() {
    }
}

