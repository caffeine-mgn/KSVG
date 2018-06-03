package org.tlsys.svg

import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGGElement
import kotlin.browser.document

inline fun SVGGroup() = document.createSVG("g").unsafeCast<SVGGElement>()

inline fun <T : SVGElement> T.appendTo(group: SVGGElement): T {
    group.appendChild(this)
    return this
}
