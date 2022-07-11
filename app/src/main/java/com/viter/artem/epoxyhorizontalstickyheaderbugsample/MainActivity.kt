package com.viter.artem.epoxyhorizontalstickyheaderbugsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy.StickyHeaderController
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy.fixed_manager.FixedStickyHeaderLinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewWrong: EpoxyRecyclerView
    private lateinit var recyclerViewRight: EpoxyRecyclerView

    private lateinit var scrollToInfo: TextView

    private var scrollTo = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scrollToInfo = findViewById(R.id.scrollToInfo)
        updateScrollToInfo()

        recyclerViewWrong = findViewById<EpoxyRecyclerView>(R.id.recycler_view_wrong).apply {
            layoutManager = StickyHeaderLinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL)
            setController(StickyHeaderController())
            requestModelBuild()
        }

        recyclerViewRight = findViewById<EpoxyRecyclerView>(R.id.recycler_view_rigth).apply {
            layoutManager = FixedStickyHeaderLinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL)
            setController(StickyHeaderController())
            requestModelBuild()
        }

        findViewById<Button>(R.id.button).setOnClickListener{
            recyclerViewWrong.scrollToPosition(scrollTo)
            recyclerViewRight.scrollToPosition(scrollTo)
            scrollTo++
            updateScrollToInfo()
        }
    }

    private fun updateScrollToInfo() {
        scrollToInfo.setText("Scroll to position $scrollTo")
    }
}