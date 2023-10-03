package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

data class DataDiscoverOuter1(
    val inner: List<DataDiscoverInner1>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 1
    }
}