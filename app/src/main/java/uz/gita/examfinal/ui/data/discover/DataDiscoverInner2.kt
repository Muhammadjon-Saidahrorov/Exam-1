package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

data class DataDiscoverInner2(
    val imageInner: Int,
    val imageInner2: Int,
    val textInner: String
): ItemViewData {
    override fun getItemType(): Int {
        return 2
    }
}