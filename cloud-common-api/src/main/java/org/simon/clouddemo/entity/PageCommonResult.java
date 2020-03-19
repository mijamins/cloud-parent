package org.simon.clouddemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: simon
 * @DATE： 2020-03-15
 * @Vesion 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageCommonResult<T> extends CommonResult {
    private Integer pageNum;
    private Integer pageSize;

    public PageCommonResult(Integer code, String message, Object data, Integer pageNum, Integer pageSize) {
        super(code, message, data);
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }



    public PageCommonResult(Integer code, String message, Integer pageNum, Integer pageSize) {
        super(code, message);
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
