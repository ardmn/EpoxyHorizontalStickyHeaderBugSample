package com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.R

@EpoxyModelClass(layout = R.layout.epoxy_sticky_item)
abstract class StickyItemEpoxyHolder : EpoxyModelWithHolder<StickyItemEpoxyHolder.StickyHolder>() {

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: StickyHolder) {
        holder.titleView.text = title
    }

    class StickyHolder : KotlinEpoxyHolder() {
        val titleView by bind<TextView>(R.id.title)
    }
}