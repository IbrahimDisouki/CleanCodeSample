package com.example.cleancodesample.di

import com.example.cleancodesample.data.remote.di.remoteModule
import org.koin.core.module.Module

fun getProjectModules(): MutableList<Module> {
    val modulesList: MutableList<Module> = mutableListOf()
    modulesList.add(remoteModule)
    // Add modules here
    return modulesList
}