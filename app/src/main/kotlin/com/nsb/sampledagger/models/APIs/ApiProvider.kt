package com.nsb.sampledagger.models.APIs

import com.nsb.sampledagger.models.entities.House
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET

interface ApiProvider {
    
    @GET("/59cb74db2d00000608806b22")
    fun getHouseList(): Observable<Response<House>>
}
