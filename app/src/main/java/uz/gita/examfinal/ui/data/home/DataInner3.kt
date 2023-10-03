package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

data class DataInner3(
    val imageInner: Int,
    val textInner: String,
    val textInner2: String
    ): ItemViewData {
    override fun getItemType(): Int {
        return 3
    }
}