package com.seancoyle.launch_datasource.network.dateformatter

import java.time.LocalDateTime

interface DateFormatter {

    fun formatDate(dateString: String): LocalDateTime

}