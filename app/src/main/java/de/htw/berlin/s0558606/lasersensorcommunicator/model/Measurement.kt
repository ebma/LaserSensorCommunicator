package de.htw.berlin.s0558606.lasersensorcommunicator.model

import android.arch.persistence.room.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Marcel Ebert S0558606 on 26.05.18.
 */

@Entity(tableName = "measurement", foreignKeys = [
    (ForeignKey(entity = MeasuringLocation::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("location_id"),
            onDelete = ForeignKey.CASCADE))])
@TypeConverters(DateConverter::class)
data class Measurement(
        @ColumnInfo(name = "pm25")
        var pm25: String = "0",

        @ColumnInfo(name = "pm10")
        var pm10: String = "0",

        @ColumnInfo(name = "start")
        var start: Date = Date(),

        @ColumnInfo(name = "end")
        var end: Date = Date(),

        @ColumnInfo(name = "location_id")
        var locationID: Long) {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    fun getStartAsString(): String {
        return SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(start)
    }
    fun getEndAsString(): String {
        return SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(end)
    }
}