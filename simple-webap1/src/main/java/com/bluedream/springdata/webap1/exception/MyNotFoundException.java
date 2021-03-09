package com.bluedream.springdata.webap1.exception;

public class MyNotFoundException extends ApiException{
    String strText = "MyNotFoundException";
    public MyNotFoundException(){
        super("MyNotFoundException");
    }

    public MyNotFoundException(String mesg){
        super("");
        this.strText = this.strText + ": " +mesg;
    }

}
