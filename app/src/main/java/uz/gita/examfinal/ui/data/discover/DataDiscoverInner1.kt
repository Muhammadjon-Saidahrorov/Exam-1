package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

data class DataDiscoverInner1(
    val imageInner: Int
): ItemViewData {
    override fun getItemType(): Int {
        return 1
    }
}