package edu.neu.yangmingjun.eveapp

import enterprises.orbital.eve.esi.client.api.StatusApi
import enterprises.orbital.eve.esi.client.invoker.ApiException
import enterprises.orbital.eve.esi.client.model.GetStatusOk

class getStatus {
    public fun get() : Int {
        var apiInstance = StatusApi()
        var datasource = "tranquility" // String | The server name you would like data from
        var ifNoneMatch = "ifNoneMatch_example" // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
        var e: ApiException? = null

        val result = apiInstance.getStatus(datasource, ifNoneMatch)
        return result.players
    }
}
