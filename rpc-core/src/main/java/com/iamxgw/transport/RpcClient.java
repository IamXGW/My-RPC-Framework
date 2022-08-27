package com.iamxgw.transport;

import com.iamxgw.entity.RpcRequest;
import com.iamxgw.serializer.CommonSerializer;

public interface RpcClient {
    Object sendRequest(RpcRequest rpcRequest);

    void setSerializer(CommonSerializer serializer);
}
