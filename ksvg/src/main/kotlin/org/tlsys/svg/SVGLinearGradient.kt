package org.tlsys.svg

import org.w3c.dom.svg.*
import kotlin.browser.document
import kotlin.dom.clear

inline fun SVGLinearGradient() = document.createSVG("linearGradient").unsafeCast<SVGLinearGradientElement>()
class LinearGradientBuilder(val element: SVGGradientElement) {
    fun stop(offset: Float, color: String? = null, opacity: Float? = null, vararg styleClasses: String) {
        val stop = document.createSVG("stop").unsafeCast<SVGStopElement>()
        stop.offset.baseVal = offset
        if (color != null)
            stop.setAttribute("stop-color", color)

        if (opacity != null)
            stop.setAttribute("stop-opacity", opacity.toString())

        styleClasses.forEach {
            stop.classList.add(it)
        }

        element.appendChild(stop)
    }
}

inline fun SVGLinearGradientElement.x1(value: Float) {
    setAttribute("x1", value.unsafeCast<String>())
}

inline fun SVGLinearGradientElement.x2(value: Float) {
    setAttribute("x2", value.unsafeCast<String>())
}

inline fun SVGLinearGradientElement.y1(value: Float) {
    setAttribute("y1", value.unsafeCast<String>())
}

inline fun SVGLinearGradientElement.y2(value: Float) {
    setAttribute("y2", value.unsafeCast<String>())
}


operator fun <T : SVGGradientElement> T.invoke(f: LinearGradientBuilder.() -> Unit): T {
    clear()
    LinearGradientBuilder(this).f()
    return this
}

inline fun <T : SVGGradientElement> T.appendTo(group: SVGDefsElement): T {
    group.appendChild(this)
    return this
}
