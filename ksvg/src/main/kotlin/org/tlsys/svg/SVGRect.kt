package org.tlsys.svg

import org.w3c.dom.svg.SVGRectElement
import kotlin.browser.document

inline fun SVGRect() = document.createSVG("rect").unsafeCast<SVGRectElement>()

inline var SVGRectElement._x: Float
    get() = x.baseVal.value
    set(it) {
        x.baseVal.value = it
    }

inline var SVGRectElement._y: Float
    get() = y.baseVal.value
    set(it) {
        y.baseVal.value = it
    }

inline var SVGRectElement._width: Float
    get() = width.baseVal.value
    set(it) {
        width.baseVal.value = it
    }

inline var SVGRectElement._height: Float
    get() = height.baseVal.value
    set(it) {
        height.baseVal.value = it
    }

inline var SVGRectElement._rx: Float
    get() = rx.baseVal.value
    set(it) {
        rx.baseVal.value = it
    }

inline var SVGRectElement._ry: Float
    get() = ry.baseVal.value
    set(it) {
        ry.baseVal.value = it
    }