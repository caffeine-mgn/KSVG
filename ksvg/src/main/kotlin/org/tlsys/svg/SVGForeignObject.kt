package org.tlsys.svg

import org.w3c.dom.HTMLBodyElement
import org.w3c.dom.get
import org.w3c.dom.svg.SVGForeignObjectElement
import kotlin.browser.document

inline fun SVGForeignObject() = document.createSVG("foreignObject").unsafeCast<SVGForeignObjectElement>()

val SVGForeignObjectElement.body: HTMLBodyElement
    get() {
        val tag = this.getElementsByTagName("body")
        return if (tag.length == 1) {
            tag.get(0).unsafeCast<HTMLBodyElement>()
        } else {
            val t = document.createElement("body")
            appendChild(t)
            t.unsafeCast<HTMLBodyElement>()
        }
    }

inline var SVGForeignObjectElement._width: Float
    get() = width.baseVal.value
    set(it) {
        width.baseVal.value = it
    }

inline var SVGForeignObjectElement._height: Float
    get() = height.baseVal.value
    set(it) {
        height.baseVal.value = it
    }