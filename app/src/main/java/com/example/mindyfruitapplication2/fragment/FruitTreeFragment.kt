//package com.example.mindyfruitapplication2.fragment
//
//import android.app.Fragment
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.mindyfruitapplication2.R
//
///**
// * Created by manyuan.tong on 8/29/23
// * @author manyuan.tong@bytedance.com
// */
//class FruitTreeFragment : Fragment() {
//
//    private var itemList: RecyclerView? = null
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val view: View = inflater.inflate(
//            R.layout.activity_main,
//            container,
//            false,
//        )
//        itemList = view.findViewById(R.id.fruit_list)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        initView()
//    }
//
//    private fun initView() {
//        val layoutManager = LinearLayoutManager(context)
//        itemList?.layoutManager = layoutManager
//        val myDataset = arrayOf("Item 1", "Item 2", "Item 3")
//        val mAdapter = FruitListAdapter(myDataset)
//        itemList?.adapter = mAdapter
//    }
//}