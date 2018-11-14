package com.kangcahya.kt.hellokotlin2

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}