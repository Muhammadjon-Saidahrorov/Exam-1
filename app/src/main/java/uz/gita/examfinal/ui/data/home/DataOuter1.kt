package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

data class DataOuter1(
    val textOuter: String,
    val inner: List<DataInner1>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 1
    }
}