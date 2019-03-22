package com.example.cleancodesample.presentation

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.cleancodesample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
        setupNavigationComponent()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
    }

    private fun setupNavigationComponent() {
        val navController = findNavController(R.id.navHostFragment)
        navController.addOnDestinationChangedListener(this)
        val appBarConfiguration = AppBarConfiguration
                .Builder(R.id.splashFragment, R.id.signUpFragment)
                .build()
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    override fun onDestinationChanged(controller: NavController,
                                      destination: NavDestination,
                                      arguments: Bundle?) {
        if (destination.id == R.id.splashFragment) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            supportActionBar?.hide()
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
            supportActionBar?.show()
        }
    }

}
