package com.example.timurmuhortov.amocrm.presentation.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.timurmuhortov.amocrm.data.view.DealViewData

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 3:22
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@StateStrategyType(AddToEndSingleStrategy::class)
interface IMainView: MvpView {

    fun showDeals(deals: List<DealViewData>)

    fun showError(msg: String)

}