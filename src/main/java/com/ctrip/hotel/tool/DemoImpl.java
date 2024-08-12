package com.ctrip.hotel.tool;

import com.ctrip.soa._32466.Mybootservice;
import com.ctrip.hotel.tool.business.GetAllianceOrderIDBusiness;
import com.ctrip.soa.getallianceorderid.GetAllianceOrderIDAsyncRequestType;
import com.ctrip.soa.getallianceorderid.GetAllianceOrderIDAsyncResponseType;
import com.ctriposs.baiji.rpc.common.types.AckCodeType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.ctriposs.baiji.rpc.server.HttpRequestContext;
import com.google.common.util.concurrent.ListenableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements Mybootservice {

    @Autowired
    GetAllianceOrderIDBusiness getAllianceOrderIDBusiness;

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        CheckHealthResponseType response = new CheckHealthResponseType();
        ResponseStatusType responseStatusType = new ResponseStatusType();
        responseStatusType.setAck(AckCodeType.Success);
        response.setResponseStatus(responseStatusType);
        return response;
    }

    @Override
    public ListenableFuture<GetAllianceOrderIDAsyncResponseType> getAllianceOrderID(GetAllianceOrderIDAsyncRequestType request, HttpRequestContext httpRequestContext) throws Exception {
        return getAllianceOrderIDBusiness.processAsync(request);
    }

}
