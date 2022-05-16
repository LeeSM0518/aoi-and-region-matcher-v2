//package io.wisoft.aoiandregionmatcherv2.entity
//
//import io.wisoft.aoiandregionmatcherv2.entity.vo.Point
//import org.locationtech.jts.geom.Polygon
//import java.math.BigInteger
//import javax.persistence.Column
//import javax.persistence.Entity
//import javax.persistence.GeneratedValue
//import javax.persistence.GenerationType
//import javax.persistence.Id
//
//@Entity
//class Region private constructor(
//    @Column(nullable = false)
//    val name: String,
//
//    @Column(columnDefinition = "geometry(Polygon, 4326)", nullable = false)
//    val area: Polygon
//) {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "bigserial", name = "region_id", nullable = false)
//    private lateinit var id: BigInteger
//
//    constructor(name: String, area: List<Point>) : this(name,) {
//
//    }
//
//}