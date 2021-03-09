package com.bluedream.springdata.webap1.exception;

public class ApiException extends Exception{
    String strText = "ApiException";

    public ApiException(String mesg){
        this.strText = this.strText + ": " +mesg;
    }
    public String getMessage(){
        return (this.strText);
    }
}
