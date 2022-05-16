package io.wisoft.aoiandregionmatcherv2.entity.factory

import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.io.WKTReader

private val geometryFactory: GeometryFactory = GeometryFactory()
private val reader: WKTReader = WKTReader()

fun create