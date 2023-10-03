package uz.gita.examfinal.ui.data.home

import uz.gita.examfinal.ui.data.ItemViewData

class DataOuter3(
    val textOuter: String,
    val inner: List<DataInner3>
)
    : ItemViewData {
    override fun getItemType(): Int {
        return 3
    }
}