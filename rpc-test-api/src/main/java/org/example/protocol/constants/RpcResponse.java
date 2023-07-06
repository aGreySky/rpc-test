package org.example.protocol.constants;

import lombok.Data;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 1:46 PM
 */
@Data
public class RpcResponse {

    private String reqId;

    private Object content;
}
