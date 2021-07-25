package com.example.fundoapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RegistrationFragment : Fragment(), View.OnClickListener {

    lateinit var buttonLogin: Button
    lateinit var buttonRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //        initViews(view)
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

//    private fun initViews(view: View) {
//        buttonLogin = view.findViewById(R.id.buttonLogin)
//        buttonRegister = view.findViewById(R.id.buttonSignUp)
//
//        buttonLogin.setOnClickListener {
//            parentFragmentManager.popBackStack()
//        }
//        buttonRegister.setOnClickListener(this)
//    }

    override fun onClick(v: View?) {

    }
}