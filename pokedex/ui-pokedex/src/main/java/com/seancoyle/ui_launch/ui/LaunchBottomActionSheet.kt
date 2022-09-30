package com.seancoyle.ui_launch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.seancoyle.ui_launch.R
import com.seancoyle.ui_launch.databinding.FragmentLaunchBottomActionSheetBinding


class LaunchBottomActionSheet : BottomSheetDialogFragment() {

    private var _binding: FragmentLaunchBottomActionSheetBinding? = null
    private val binding get() = _binding!!

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.BottomSheetDialogStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLaunchBottomActionSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setListeners()
    }

    private fun setupUI() {
        with(binding) {

        }
    }

    private fun setListeners() {
        with(binding) {

            exitBtn.setOnClickListener {
                dismiss()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}