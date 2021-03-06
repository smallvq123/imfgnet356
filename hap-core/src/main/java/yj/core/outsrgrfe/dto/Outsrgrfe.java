package yj.core.outsrgrfe.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "wip_outsrgrfe")
public class Outsrgrfe extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotEmpty
      private String aufnr; //订单号

     @NotEmpty
      private String matnr; //物料号

     @NotEmpty
      private String vornr; //外协工序号

     @NotEmpty
      private String lifnr; //供应商编码

     @NotEmpty
      private String ktsch; //标准文本码

     @NotEmpty
      private String vsnda; //生产版本

     @NotEmpty
      private String ebeln; //采购订单

    @NotEmpty
      private String sortl;
     @NotEmpty
      private String ebelp; //采购订单行

      private Double menge; //采购订单行数目

     @NotEmpty
      private String loekz;

     @Transient
      private Long createdBy;

     @Transient
      private Date creationDate;

     @Transient
      private Long lastUpdatedBy;

     @Transient
      private  Date lastUpdateDate;

    @Override
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @Override
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setAufnr(String aufnr){
         this.aufnr = aufnr;
     }

     public String getAufnr(){
         return aufnr;
     }

     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setVornr(String vornr){
         this.vornr = vornr;
     }

     public String getVornr(){
         return vornr;
     }

     public void setLifnr(String lifnr){
         this.lifnr = lifnr;
     }

     public String getLifnr(){
         return lifnr;
     }

     public void setKtsch(String ktsch){
         this.ktsch = ktsch;
     }

     public String getKtsch(){
         return ktsch;
     }

     public void setVsnda(String vsnda){
         this.vsnda = vsnda;
     }

     public String getVsnda(){
         return vsnda;
     }

     public void setEbeln(String ebeln){
         this.ebeln = ebeln;
     }

     public String getEbeln(){
         return ebeln;
     }

     public void setEbelp(String ebelp){
         this.ebelp = ebelp;
     }

     public String getEbelp(){
         return ebelp;
     }

     public void setMenge(Double menge){
         this.menge = menge;
     }

     public Double getMenge(){
         return menge;
     }

     public void setLoekz(String loekz){
         this.loekz = loekz;
     }

     public String getLoekz(){
         return loekz;
     }

    public String getSortl() {
        return sortl;
    }

    public void setSortl(String sortl) {
        this.sortl = sortl;
    }
}
