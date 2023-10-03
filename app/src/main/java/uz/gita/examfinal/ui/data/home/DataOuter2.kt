package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

data class DataOuter2(
    val textOuter: String,
    val inner: List<DataInner2>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 2
    }
}