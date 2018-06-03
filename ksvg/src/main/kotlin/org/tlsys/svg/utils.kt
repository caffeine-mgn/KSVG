package org.tlsys.svg

import org.w3c.dom.Document
import org.w3c.dom.css.CSSStyleDeclaration
import org.w3c.dom.svg.*


var CSSStyleDeclaration.fill: String?
    inline get() = asDynamic().fill.unsafeCast<String?>()
    inline set(value) {
        asDynamic().fill = value
    }

var CSSStyleDeclaration.stroke: String?
    inline get() = asDynamic().stroke.unsafeCast<String?>()
    inline set(value) {
        asDynamic().stroke = value
    }

var CSSStyleDeclaration.dominantBaseline: String?
    inline get() = asDynamic().dominantBaseline.unsafeCast<String?>()
    inline set(value) {
        asDynamic().dominantBaseline = value
    }


inline fun SVGElement.move(x: Float, y: Float) {
    setAttribute("transform", "translate($x $y)")
}

inline val <T : SVGGraphicsElement> T.screenX: Float
    get() = this.getCTM()!!.e.unsafeCast<Float>()

inline val <T : SVGGraphicsElement> T.screenY: Float
    get() = this.getCTM()!!.f.unsafeCast<Float>()

inline fun Document.createSVG(tagName: String): SVGElement = createElementNS("http://www.w3.org/2000/svg", tagName).unsafeCast<SVGElement>()


private var id_generator = 0
val <T : SVGElement> T.gid: String
    get() {
        if (id.isEmpty())
            id = "gen_${id_generator++}"
        return id
    }

inline fun <T : SVGElement> T.fill(value: String?) {
    if (value == null)
        removeAttribute("fill")
    else
        setAttribute("fill", value)
}

inline fun <T : SVGElement, V : SVGGradientElement> T.fill(value: V) {
    fill("url(#${value.gid})")
}

inline fun <T : SVGElement> T.stroke(value: String?) {
    if (value == null)
        removeAttribute("stroke")
    else
        setAttribute("stroke", value)
}

inline fun <T : SVGElement> T.strokeWidth(value: Float?) {
    if (value == null)
        removeAttribute("stroke-width")
    else
        setAttribute("stroke-width", value.unsafeCast<String>())
}


inline fun <T : SVGElement> T.strokeLinejoin(value: String?) {
    if (value == null)
        removeAttribute("stroke-linejoin")
    else
        setAttribute("stroke-linejoin", value)
}

inline fun <T : SVGElement> T.strokeLinecap(value: String?) {
    if (value == null)
        removeAttribute("stroke-linecap")
    else
        setAttribute("stroke-linecap", value)
}

inline fun <T : SVGElement> T.strokeMiterlimit(value: Float?) {
    if (value == null)
        removeAttribute("stroke-miterlimit")
    else
        setAttribute("stroke-miterlimit", value.unsafeCast<String>())
}
