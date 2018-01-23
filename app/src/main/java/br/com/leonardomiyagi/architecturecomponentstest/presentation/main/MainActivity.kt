package br.com.leonardomiyagi.architecturecomponentstest.presentation.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import br.com.leonardomiyagi.architecturecomponentstest.R
import br.com.leonardomiyagi.architecturecomponentstest.presentation.base.BaseActivity
import br.com.leonardomiyagi.architecturecomponentstest.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
