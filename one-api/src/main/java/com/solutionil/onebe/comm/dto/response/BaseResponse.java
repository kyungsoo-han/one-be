package com.solutionil.onebe.comm.dto.response;


import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BaseResponse<T> {

    private HttpStatus status = HttpStatus.OK;
    private String message;
    private T data;

    public static BaseResponse success() {
        return new BaseResponse<>();
    }
    public static BaseResponse success(String message) {
        return new BaseResponse<>(message);
    }
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(data);
    }

    public BaseResponse(){
        this.message = "정상처리되었습니다.";
    }

    public BaseResponse(T data) {
        this.data = data;

    }
    public BaseResponse(String message) {
        this.message = message;

    }

}
