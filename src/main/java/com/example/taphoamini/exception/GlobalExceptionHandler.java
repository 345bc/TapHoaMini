package com.example.taphoamini.exception;

import com.example.taphoamini.dto.response.ApiResponse;
import com.example.taphoamini.dto.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ApiResponse<Object>> handle(Exception ex) {
        log.error("Uncategorized exception: ", ex);
        return ResponseEntity
                .internalServerError()
                .body(ApiResponse.<Object>builder()
                        .code(ErrorCode.UNCATEGORIZED_EXCEPTION.getCode())
                        .message(ErrorCode.UNCATEGORIZED_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler(value = AppException.class)
    public ResponseEntity<ApiResponse<Object>> handle(AppException ex) {
        ErrorCode errorCode = ex.getErrorCode();
        return ResponseEntity.badRequest()
                .body(ApiResponse.<Object>builder()
                        .code(errorCode.getCode())
                        .message(errorCode.getMessage())
                        .build());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Object>> handleValidation(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getFieldError().getDefaultMessage();

        return ResponseEntity.badRequest().body(ApiResponse.builder()
                .code(ErrorCode.INVALID_KEY.getCode())
                .message(message)
                .build());
    }


}
