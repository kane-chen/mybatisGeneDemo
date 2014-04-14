package cn.kane.domain;

import java.io.Serializable;
import java.util.Date;

public class MoneyAdvance implements Serializable {
    private String contNum;

    private Long spId;

    private String money;

    private String backMoney;

    private Boolean isBack;

    private Integer ownerUid;

    private Date ctime;

    private Date mtime;

    private Long oldId;

    private static final long serialVersionUID = 1L;

    public String getContNum() {
        return contNum;
    }

    public void setContNum(String contNum) {
        this.contNum = contNum;
    }

    public Long getSpId() {
        return spId;
    }

    public void setSpId(Long spId) {
        this.spId = spId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(String backMoney) {
        this.backMoney = backMoney;
    }

    public Boolean getIsBack() {
        return isBack;
    }

    public void setIsBack(Boolean isBack) {
        this.isBack = isBack;
    }

    public Integer getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(Integer ownerUid) {
        this.ownerUid = ownerUid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }
}