package com.seancoyle.launch_datasource.network.numberformatter

import java.text.NumberFormat
import java.util.*

class NumberFormatterImpl : NumberFormatter {

    override fun formatNumber(number: Long?): String {
        return NumberFormat.getNumberInstance(Locale.US)
            .format(number)
            .replace(",", "،")
    }

}