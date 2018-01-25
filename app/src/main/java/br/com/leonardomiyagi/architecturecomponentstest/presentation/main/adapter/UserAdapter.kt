package br.com.leonardomiyagi.architecturecomponentstest.presentation.main.adapter

import android.arch.paging.PagedListAdapter
import android.databinding.DataBindingUtil
import android.support.v7.recyclerview.extensions.DiffCallback
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.leonardomiyagi.architecturecomponentstest.R
import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.databinding.ListItemUserBinding

/**
 * Created by lmiyagi on 25/01/18.
 */
class UserAdapter : PagedListAdapter<User, UserAdapter.UserViewHolder>(DIFF_CALLBACK) {

    private val users = ArrayList<User>()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserViewHolder {
        return UserViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent?.context), R.layout.list_item_user, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder?, position: Int) {
        holder?.format(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    fun setUsers(users: List<User>?) {
        if (users != null) {
            this.users.clear()
            this.users.addAll(users)
            notifyDataSetChanged()
        }
    }

    inner class UserViewHolder(private val binding: ListItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun format(user: User) {
            binding.user = user
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.equals(newItem)
            }
        }
    }
}