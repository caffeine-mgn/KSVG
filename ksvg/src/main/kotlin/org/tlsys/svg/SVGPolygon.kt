package org.tlsys.svg

import org.w3c.dom.DOMPoint
import org.w3c.dom.svg.SVGPolygonElement
import kotlin.browser.document

inline fun SVGPolygon() = document.createSVG("polygon").unsafeCast<SVGPolygonElement>()

inline fun SVGPolygonElement.points(points: String): SVGPolygonElement {
    setAttribute("points", points)
    return this
}

fun SVGPolygonElement.points(points: Array<Pair<Float, Float>>): SVGPolygonElement {
    this.points.clear()
    points.forEach {
        this.points.appendItem(DOMPoint(it.first.toDouble(), it.second.toDouble()))
    }
    return this
}