package com.example.timurmuhortov.amocrm.domain.irepository

import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.Response
import com.example.timurmuhortov.amocrm.data.UserData
import io.reactivex.Single
import okhttp3.ResponseBody

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 1:44
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


interface IAuthRepository {

    fun login(userData: UserData): Single<ResponseBody>

    fun deals(): Single<Response<Deal>>
}