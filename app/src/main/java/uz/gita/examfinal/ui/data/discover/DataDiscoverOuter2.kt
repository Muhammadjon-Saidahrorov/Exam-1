package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

data class DataDiscoverOuter2(
    val textOuter: String,
    val inner: List<DataDiscoverInner2>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 2
    }
}