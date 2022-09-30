package com.seancoyle.ui_launch.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import com.seancoyle.core.util.printLogDebug
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.ui_launch.databinding.RvLaunchItemBinding

class PokeListAdapter
constructor(
    private val interaction: Interaction? = null,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val diffCallBack = object : DiffUtil.ItemCallback<Pokemon>() {

        override fun areItemsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem.name == newItem.name
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem == newItem
        }

    }

    private val differ =
        AsyncListDiffer(
            LaunchRecyclerChangeCallback(this),
            AsyncDifferConfig.Builder(diffCallBack).build()
        )

    internal inner class LaunchRecyclerChangeCallback(
        private val adapter: PokeListAdapter
    ) : ListUpdateCallback {

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            adapter.notifyItemRangeChanged(position, count, payload)
        }

        override fun onInserted(position: Int, count: Int) {
            adapter.notifyItemRangeChanged(position, count)
        }

        @SuppressLint("NotifyDataSetChanged")
        override fun onMoved(fromPosition: Int, toPosition: Int) {
            adapter.notifyDataSetChanged()
        }

        @SuppressLint("NotifyDataSetChanged")
        override fun onRemoved(position: Int, count: Int) {
            adapter.notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PokeListViewHolder(
            RvLaunchItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            interaction = interaction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {

            is PokeListViewHolder -> {
                holder.bind(differ.currentList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<Pokemon>) {
        val commitCallback = Runnable {
            // if process died must restore list position
            interaction?.restoreListPosition()
        }
        printLogDebug("list_adapter", "size: ${list.size}")
        differ.submitList(list, commitCallback)
    }

    inner class PokeListViewHolder
    constructor(
        private val binding: RvLaunchItemBinding,
        private val interaction: Interaction?,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Pokemon) = with(itemView) {
            with(binding) {

                /*    launchImage.glideLoadLaunchImage(item.links.missionImage, true)

            }

            setOnClickListener {
                interaction?.onItemSelected(absoluteAdapterPosition, item.links)
            }
    */
            }
        }
    }


    interface Interaction {

        fun onItemSelected(pokemon: Pokemon)

        fun restoreListPosition()

    }

}













