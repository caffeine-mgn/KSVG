package org.tlsys.svg

import org.w3c.dom.svg.SVGTextElement
import kotlin.browser.document

inline fun SVGText() = document.createSVG("text").unsafeCast<SVGTextElement>()


inline var SVGTextElement._x: Float
    get() = getAttribute("x")?.toFloatOrNull() ?: 0f
    set(it) {
        setAttribute("x", it.toString())
    }

inline var SVGTextElement._y: Float
    get() = getAttribute("y")?.toFloatOrNull() ?: 0f
    set(it) {
        setAttribute("y", it.toString())
    }