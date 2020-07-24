package com.mobiusvision.qrcode.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(
        description = "统一Restful返回对象"
)
public class CommonResult<T> {
    @ApiModelProperty("请求状态：0成功，1提示失败，2打印堆栈")
    private int code;
    @ApiModelProperty("错误信息")
    private String errorMsg;
    @ApiModelProperty("堆栈异常信息")
    private String stackException;
    @ApiModelProperty("请求返回数据")
    private T result;

    public static <T> CommonResult<T> buildError(String errorMsg) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(1);
        commonResult.setErrorMsg(errorMsg);
        return commonResult;
    }

    public static <T> CommonResult<T> buildException(String stackException) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(2);
        commonResult.setStackException(stackException);
        return commonResult;
    }

    public static <T> CommonResult buildSuccess(T result) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(0);
        commonResult.setResult(result);
        return commonResult;
    }

    public CommonResult() {
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getStackException() {
        return this.stackException;
    }

    public T getResult() {
        return this.result;
    }

    public CommonResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public CommonResult<T> setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public CommonResult<T> setStackException(String stackException) {
        this.stackException = stackException;
        return this;
    }

    public CommonResult<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public String toString() {
        return "CommonResult(code=" + this.getCode() + ", errorMsg=" + this.getErrorMsg() + ", stackException=" + this.getStackException() + ", result=" + this.getResult() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CommonResult)) {
            return false;
        } else {
            CommonResult<?> other = (CommonResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else {
                label49: {
                    Object this$errorMsg = this.getErrorMsg();
                    Object other$errorMsg = other.getErrorMsg();
                    if (this$errorMsg == null) {
                        if (other$errorMsg == null) {
                            break label49;
                        }
                    } else if (this$errorMsg.equals(other$errorMsg)) {
                        break label49;
                    }

                    return false;
                }

                Object this$stackException = this.getStackException();
                Object other$stackException = other.getStackException();
                if (this$stackException == null) {
                    if (other$stackException != null) {
                        return false;
                    }
                } else if (!this$stackException.equals(other$stackException)) {
                    return false;
                }

                Object this$result = this.getResult();
                Object other$result = other.getResult();
                if (this$result == null) {
                    if (other$result != null) {
                        return false;
                    }
                } else if (!this$result.equals(other$result)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof CommonResult;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        int result = result * 59 + this.getCode();
//        Object $errorMsg = this.getErrorMsg();
//        result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
//        Object $stackException = this.getStackException();
//        result = result * 59 + ($stackException == null ? 43 : $stackException.hashCode());
//        Object $result = this.getResult();
//        result = result * 59 + ($result == null ? 43 : $result.hashCode());
//        return result;
//    }

    @Override
    public int hashCode() {

        return Objects.hash(code, errorMsg, stackException, result);
    }
}

