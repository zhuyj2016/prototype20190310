package easy;

import java.math.BigDecimal;

public class Invoice {

    private String id;
    private String applyuserid;
    private String applayusername;
    private BigDecimal applayprice;
    private String decription;
    private String applytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(String applyuserid) {
        this.applyuserid = applyuserid;
    }

    public String getApplayusername() {
        return applayusername;
    }

    public void setApplayusername(String applayusername) {
        this.applayusername = applayusername;
    }

    public BigDecimal getApplayprice() {
        return applayprice;
    }

    public void setApplayprice(BigDecimal applayprice) {
        this.applayprice = applayprice;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", applyuserid='" + applyuserid + '\'' +
                ", applayusername='" + applayusername + '\'' +
                ", applayprice=" + applayprice +
                ", decription='" + decription + '\'' +
                ", applytime='" + applytime + '\'' +
                '}';
    }
}
