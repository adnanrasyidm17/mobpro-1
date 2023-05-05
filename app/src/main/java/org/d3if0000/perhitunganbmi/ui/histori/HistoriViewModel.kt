package org.d3if0000.perhitunganbmi.ui.histori

import androidx.lifecycle.ViewModel
import org.d3if0000.perhitunganbmi.db.BmiDao

class HistoriViewModel(db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}