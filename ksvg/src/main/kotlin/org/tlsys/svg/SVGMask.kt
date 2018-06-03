package org.tlsys.svg

import org.tlsys.svg.dom.SVGMaskElement
import org.w3c.dom.svg.SVGElement
import kotlin.browser.document

inline fun SVGMask() = document.createSVG("mask").unsafeCast<SVGMaskElement>()

private var maskIdGen = 0
private fun genId() = "mask_${maskIdGen++}"

fun <T : SVGElement> T.mask(mask: SVGMaskElement) {
    if (mask.id.isEmpty())
        mask.id = genId()
    setAttribute("mask", "url(#${mask.id})")
}

inline fun <T : SVGElement> T.appendTo(mask: SVGMaskElement): T {
    mask.appendChild(this)
    return this
}