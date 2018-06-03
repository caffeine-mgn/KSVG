package org.tlsys.svg

import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGSVGElement
import kotlin.browser.document

inline fun SVGStage() = document.createSVG("svg").unsafeCast<SVGSVGElement>()

inline fun <T : SVGElement> T.appendTo(group: SVGSVGElement): T {
    group.appendChild(this)
    return this
}

inline fun SVGSVGElement.viewBox(x: Float, y: Float, width: Float, height: Float) {
    setAttribute("viewBox", "$x $y $width $height")
}