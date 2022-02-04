package com.example.modelrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val textAdapter by lazy { TextAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
        setUpListener()
    }

    private fun setUpUi() {
        setUpAdapter()
    }

    private fun setUpListener() {
        uiBtAdd.setOnClickListener {actionAddText()}

    }

    private fun actionAddText () {
        if (uiEtInput.text.toString().isNotBlank()){
            val textList = arrayListOf<String>()
            textList.add(uiEtInput.text.toString())
            textAdapter.setData(textList)
            uiEtInput.text?.clear()

        }
    }



    private fun setUpAdapter() {
        uiRvInputText.adapter= textAdapter

    }
}