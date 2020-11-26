package com.example.loginsenhafragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_second_data.*

class FragmentSecondData : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val login = arguments?.getString(LOGIN)
            val senha = arguments?.getString(SENHA)
            tv_text_second_fragment.text = "Dados do login : $login \nDados da senha $senha"
    }

    companion object {
        fun newInstance(): FragmentSecondData {
            val args = Bundle()
            val fragment = FragmentSecondData()
            fragment.arguments = args
            return fragment
        }

        const val LOGIN = "LOGIN"
        const val SENHA = "SENHA"
    }


}
