package com.example.loginsenhafragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.loginsenhafragments.FragmentSecondData.Companion.LOGIN
import com.example.loginsenhafragments.FragmentSecondData.Companion.SENHA
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val savedInstanceState1 = savedInstanceState
        super.onViewCreated(view, savedInstanceState1)
        
        btn_entrar.setOnClickListener {

            val fragmentSecondData: FragmentSecondData = FragmentSecondData.newInstance()
            val fragmentTransition = requireActivity().supportFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.container, fragmentSecondData)
            fragmentTransition.addToBackStack(TAG) // empilhamento
            fragmentTransition.commit()
        }

    }
    

    companion object {
        fun newInstance(): FragmentLogin {
            val args = Bundle()
            val fragment = FragmentLogin()
            fragment.arguments = args
            return fragment
        }

        const val TAG = "TAG"
    }

}