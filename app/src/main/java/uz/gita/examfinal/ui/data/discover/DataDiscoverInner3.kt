package uz.gita.examfinal.ui.data.discover

import uz.gita.examfinal.ui.data.ItemViewData

data class DataDiscoverInner3(
    val imageInner: Int,
    val textInner: String,
    ): ItemViewData {
    override fun getItemType(): Int {
        return 3
    }
}