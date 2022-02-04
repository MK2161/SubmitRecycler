package com.example.modelrecyclerview

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.model_text_input.view.*

class TextAdapter (
    private val textList : ArrayList<String> = arrayListOf()
) : RecyclerView.Adapter<TextAdapter.TextViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.model_text_input,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        val inputText = textList[position]
        with(holder) {
            uiTvInputText.text = inputText
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(items: ArrayList<String>) {
        this.textList.clear()
        this.textList.addAll(items)
        notifyDataSetChanged()

    }

    override fun getItemCount() = textList.size



    inner class TextViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val uiTvInputText : AppCompatTextView = view.uiTvInputText

    }

}


