package org.tlsys.svg

import org.w3c.dom.svg.SVGPathElement
import kotlin.browser.document

inline fun SVGPath() = document.createSVG("path").unsafeCast<SVGPathElement>()
inline fun SVGPath(noinline f: PathBuilder.() -> Unit): SVGPathElement {
    val v = SVGPath()
    return v.invoke(f)
}

class PathBuilder {
    var body = ""
    var cmd = ""

    inline fun m(x: Float, y: Float) {
        body += "M$x,$y"
    }

    inline fun z() {
        body += "Z"
    }

    inline fun l(x: Float, y: Float) {
        body += "L$x,$y"
    }

    inline fun cmd(c: String) {
        if (cmd != c) {
            cmd = c
            body += c
        }
    }

    inline fun c(x: Float, y: Float) {
        if (cmd != "C") {
            cmd = "C"
            body += "C$x,$y"
        } else
            body += ",$x,$y"
    }

    inline fun q(x: Float, y: Float) {
        body += "Q$x,$y"
    }

    inline fun s(x: Float, y: Float) {
        body += "S$x,$y"
    }

    inline fun t(x: Float, y: Float) {
        body += "T$x,$y"
    }

    inline fun a(x: Float, y: Float) {
        body += "A$x,$y"
    }

    inline fun h(x: Float) {
        body += "H$x"
    }

    inline fun v(x: Float) {
        body += "V$x"
    }


}

operator fun SVGPathElement.invoke(f: PathBuilder.() -> Unit): SVGPathElement {
    val p = PathBuilder()
    p.f()
    setAttribute("d", p.body)
    return this
}