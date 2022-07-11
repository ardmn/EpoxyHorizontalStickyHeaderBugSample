package com.viter.artem.epoxyhorizontalstickyheaderbugsample.epoxy

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.viter.artem.epoxyhorizontalstickyheaderbugsample.R

@EpoxyModelClass(layout = R.layout.epoxy_item)
abstract class ItemEpoxyHolder : EpoxyModelWithHolder<Holder>() {

    @EpoxyAttribute lateinit var title: String

    override fun bind(holder: Holder) {
        holder.titleView.text = title
    }
}

class Holder : KotlinEpoxyHolder() {
    val titleView by bind<TextView>(R.id.title)
}