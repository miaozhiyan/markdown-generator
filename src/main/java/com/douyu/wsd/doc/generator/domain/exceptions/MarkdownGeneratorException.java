package com.douyu.wsd.doc.generator.domain.exceptions;



public class MarkdownGeneratorException extends Exception{
    private Integer code;
    private String msg;


    public MarkdownGeneratorException(Integer code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MarkdownGeneratorException(Integer code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
