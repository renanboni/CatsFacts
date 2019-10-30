package com.boni.catsfacts.base

interface HasViewModel<T : BaseViewModel> {
    val viewModel: T
}