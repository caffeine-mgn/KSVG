package org.tlsys.svg

import org.w3c.dom.svg.SVGDefsElement
import org.w3c.dom.svg.SVGElement
import kotlin.browser.document

inline fun SVGDefs() = document.createSVG("defs").unsafeCast<SVGDefsElement>()

inline fun <T : SVGElement> T.appendTo(group: SVGDefsElement): T {
    group.appendChild(this)
    return this
}