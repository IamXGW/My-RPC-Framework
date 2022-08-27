package com.iamxgw.transport;

import com.iamxgw.entity.RpcRequest;

public interface RpcClient {
    Object sendRequest(RpcRequest rpcRequest);

}
