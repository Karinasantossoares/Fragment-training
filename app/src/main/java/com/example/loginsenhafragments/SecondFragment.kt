package com.example.loginsenhafragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.loginsenhafragments.model.User
import kotlinx.android.synthetic.main.fragment_second_data.*

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_data, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
             arguments?.getParcelable<User>(DATE_USER)?.let {
                 tv_text_second_fragment.text = "Dados do login: ${it.login} and ${it.password}"
            }


    }

    companion object {
        fun newInstance(user:User): SecondFragment {
            val args = Bundle()
            args.putParcelable(DATE_USER ,user)
            val fragment = SecondFragment()
            fragment.arguments = args
            return fragment
        }

        const val DATE_USER = "DATE_USER"
    }


}
