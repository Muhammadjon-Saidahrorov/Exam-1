package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

class DataDiscoverOuter3(
    val textOuter: String,
    val inner: List<DataDiscoverInner3>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 3
    }
}