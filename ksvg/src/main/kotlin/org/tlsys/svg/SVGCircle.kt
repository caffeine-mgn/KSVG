package org.tlsys.svg

import org.w3c.dom.svg.SVGCircleElement
import kotlin.browser.document

inline fun SVGCircle() = document.createSVG("circle").unsafeCast<SVGCircleElement>()

inline var SVGCircleElement._cx: Float
    get() = cx.baseVal.value
    set(it) {
        cx.baseVal.value = it
    }

inline var SVGCircleElement._raduis: Float
    get() = r.baseVal.value
    set(it) {
        r.baseVal.value = it
    }

inline var SVGCircleElement._cy: Float
    get() = cy.baseVal.value
    set(it) {
        cy.baseVal.value = it
    }

inline fun SVGCircleElement.radius(value: Float): SVGCircleElement {
    _raduis = value
    return this
}