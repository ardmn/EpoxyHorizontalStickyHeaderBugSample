package com.viter.artem.epoxyhorizontalstickyheaderbugsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy.StickyHeaderController
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy.fixed_manager.FixedStickyHeaderLinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = StickyHeaderLinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
        recyclerView.setController(StickyHeaderController())
        recyclerView.requestModelBuild()
    }
}