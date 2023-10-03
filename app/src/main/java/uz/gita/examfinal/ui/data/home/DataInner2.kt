package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

data class DataInner2(
    val imageInner: Int
): ItemViewData {
    override fun getItemType(): Int {
        return 2
    }
}