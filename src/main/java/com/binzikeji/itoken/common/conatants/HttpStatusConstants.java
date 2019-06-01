package com.binzikeji.itoken.common.conatants;

/**
 * @Description
 * @Author Bin
 * @Date 2019/4/12 12:02
 **/
public enum  HttpStatusConstants {

    BAD_GATEWAY(502, "从上游服务器接收到无效的响应");

    private int status;
    private String content;

    HttpStatusConstants(int status, String content){
        this.status = status;
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }
}
