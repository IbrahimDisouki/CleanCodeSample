package com.example.cleancodesample.features.home.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleancodesample.R
import com.example.cleancodesample.presentation.BaseFragment

class HomeFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            layoutInflater.inflate(R.layout.fragment_home, container, false)

}