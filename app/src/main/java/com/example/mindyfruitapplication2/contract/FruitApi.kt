package com.example.mindyfruitapplication2.contract

import retrofit2.http.GET

/**
 * Created by manyuan.tong on 8/29/23
 * @author manyuan.tong@bytedance.com
 */
interface FruitApi {
    @GET("api/fruit/all")
    fun getFruits(
    ): List<Fruit>
}