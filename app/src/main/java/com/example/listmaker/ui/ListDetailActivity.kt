package com.example.listmaker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listmaker.R
import com.example.listmaker.ui.detail.ListDetailFragment

class ListDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}