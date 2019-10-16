package com.example.bankapp.model;

import java.util.List;

public class AjaxResponseBody {

    private String msg;
    private GoldenCow cow;
    private List<GoldenCow> result;

    public AjaxResponseBody() {
    }

    public List<GoldenCow> getResult() {
        return result;
    }

    public void setResult(List<GoldenCow> result) {
        this.result = result;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GoldenCow getCow() {
        return cow;
    }

    public void setCow(GoldenCow cow) {
        this.cow = cow;
    }
}
