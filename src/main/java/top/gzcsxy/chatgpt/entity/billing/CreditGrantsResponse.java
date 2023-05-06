package top.gzcsxy.chatgpt.entity.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述：余额查询接口返回值
 *
 * @author : [chao]
 * @version : [v1.0]
 * @createTime : [2023/5/6 9:58]
 */
@Data
public class CreditGrantsResponse implements Serializable {
    private String object;
    /**
     * 总金额：美元
     */
    @JsonProperty("total_granted")
    private BigDecimal totalGranted;
    /**
     * 总使用金额：美元
     */
    @JsonProperty("total_used")
    private BigDecimal totalUsed;
    /**
     * 总剩余金额：美元
     */
    @JsonProperty("total_available")
    private BigDecimal totalAvailable;
    /**
     * 余额明细
     */
    private Grants grants;
}
