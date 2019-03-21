package com.example.cleancodesample.presentation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.example.cleancodesample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        findNavController(R.id.navHostFragment).addOnDestinationChangedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onDestinationChanged(controller: NavController,
                                      destination: NavDestination,
                                      arguments: Bundle?) {
        if (destination.label.isNullOrBlank().not()) {
            title = destination.label
        } else {
            title = getString(R.string.app_name)
        }
    }

}
