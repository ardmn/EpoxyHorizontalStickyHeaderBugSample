package com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy

import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks

class StickyHeaderController : EpoxyController(), StickyHeaderCallbacks {

    override fun buildModels() {
        for (i in 0 until 100) {
            when (i) {
                0 -> stickyItemEpoxyHolder {
                    id("sticky-header $i")
                    title("Sticky header $i")
                }
                else -> itemEpoxyHolder {
                    id("view holder $i")
                    title("View Holder $i")
                }
            }
        }
    }

    override fun isStickyHeader(position: Int) = position == 0
}