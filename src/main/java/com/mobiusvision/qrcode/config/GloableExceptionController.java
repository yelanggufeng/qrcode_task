package com.mobiusvision.qrcode.config;

import com.mobiusvision.qrcode.utils.PredictableException;
import com.mobiusvision.qrcode.utils.ResultInfo;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GloableExceptionController {
    public GloableExceptionController() {
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ResultInfo> systemExceptionHandler(Exception ex) {
        ex.printStackTrace();
        ResultInfo failure = ResultInfo.failure(HttpStatus.INTERNAL_SERVER_ERROR.value(), ExceptionUtils.getStackTrace(ex));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(failure);
    }

    @ExceptionHandler({PredictableException.class})
    public ResponseEntity<ResultInfo> usinessExceptionHandler(Exception ex) {
        ex.printStackTrace();
        ResultInfo failure = ResultInfo.failure(HttpStatus.NOT_IMPLEMENTED.value(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(failure);
    }
}
