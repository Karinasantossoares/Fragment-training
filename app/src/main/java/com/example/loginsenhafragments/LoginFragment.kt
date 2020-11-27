package com.example.loginsenhafragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.loginsenhafragments.model.User
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
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
            val login = et_login.text.toString()
            val senha = et_senha.text.toString()
            val user = User(login,senha)
            val fragmentSecondData: SecondFragment = SecondFragment.newInstance(user)
            val fragmentTransition = requireActivity().supportFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.container, fragmentSecondData)
            fragmentTransition.addToBackStack(TAG) // empilhamento
            fragmentTransition.commit()
        }

    }
    

    companion object {
        fun newInstance(): LoginFragment {
            val args = Bundle()
            val fragment = LoginFragment()
            fragment.arguments = args
            return fragment
        }

        const val TAG = "TAG"
    }

}