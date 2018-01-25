package br.com.leonardomiyagi.architecturecomponentstest.presentation.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.leonardomiyagi.architecturecomponentstest.R
import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.databinding.ActivityMainBinding
import br.com.leonardomiyagi.architecturecomponentstest.presentation.base.BaseActivity
import br.com.leonardomiyagi.architecturecomponentstest.presentation.main.adapter.UserAdapter
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: MainViewModel.MainViewModelFactory

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel

    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.users().observe(this, Observer(this::processResponse))
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        adapter = UserAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun processResponse(users: List<User>?) {
        adapter.setUsers(users)
    }
}
