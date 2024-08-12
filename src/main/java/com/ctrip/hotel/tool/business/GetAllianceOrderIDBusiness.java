package com.ctrip.hotel.tool.business;

import com.ctrip.soa.getallianceorderid.GetAllianceOrderIDAsyncRequestType;
import com.ctrip.soa.getallianceorderid.GetAllianceOrderIDAsyncResponseType;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.springframework.stereotype.Service;

@Service
public class GetAllianceOrderIDBusiness {

    public ListenableFuture<GetAllianceOrderIDAsyncResponseType> processAsync(GetAllianceOrderIDAsyncRequestType request){
        GetAllianceOrderIDAsyncResponseType response = new GetAllianceOrderIDAsyncResponseType();
        response.setOrderID("1111111");
        response.setAvailLogID("2222");
        return Futures.immediateFuture(response);
    }
}
