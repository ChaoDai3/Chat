package top.gzcsxy.chatgpt.entity.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 描述：金额消耗列表
 *
 * @author : [chao]
 * @version : [v1.0]
 * @createTime : [2023/5/6 9:58]
 */
@Data
public class DailyCost {
    /**
     * 时间戳
     */
    @JsonProperty("timestamp")
    private long timestamp;
    /**
     * 模型消耗金额详情
     */
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
}
