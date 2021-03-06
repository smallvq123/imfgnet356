package yj.core.sccl.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ExtensionAttribute(disable=true)
@Table(name = "sap_sccl")
public class Sccl extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks;

     @NotEmpty
      private String matnr;

      private Double zsccl;


     public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setZsccl(Double zsccl){
         this.zsccl = zsccl;
     }

     public Double getZsccl(){
         return zsccl;
     }

     }
