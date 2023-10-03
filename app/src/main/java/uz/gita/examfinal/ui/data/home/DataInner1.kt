package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

data class DataInner1(
    val imageInner: Int,
    val textInner: String
): ItemViewData {
    override fun getItemType(): Int {
        return 1
    }
}