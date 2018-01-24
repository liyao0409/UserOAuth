package org.hy.UserOAuth;

public class JsonResult {
    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    private String State;

    public String getErrInfo() {
        return ErrInfo;
    }

    public void setErrInfo(String errInfo) {
        ErrInfo = errInfo;
    }

    private String ErrInfo;

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    private String Data;
}
