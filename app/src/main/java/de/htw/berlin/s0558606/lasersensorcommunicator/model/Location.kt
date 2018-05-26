package de.htw.berlin.s0558606.lasersensorcommunicator.model

import android.arch.persistence.room.*
import com.google.android.gms.maps.model.LatLng

/**
 * Created by Marcel Ebert S0558606 on 26.05.18.
 */

@Entity(tableName = "location")
data class Location(
        @ColumnInfo(name = "name")
        var name: String = "",

        @ColumnInfo(name = "location")
        var location: String = "") {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

}