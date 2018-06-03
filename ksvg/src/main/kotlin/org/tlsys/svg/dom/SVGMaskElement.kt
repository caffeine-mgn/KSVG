package org.tlsys.svg.dom

import org.w3c.dom.svg.SVGAnimatedEnumeration
import org.w3c.dom.svg.SVGAnimatedLength
import org.w3c.dom.svg.SVGElement

external abstract class SVGMaskElement : SVGElement {
    val maskUnits: SVGAnimatedEnumeration
    val maskContentUnits: SVGAnimatedEnumeration
    val x: SVGAnimatedLength
    val y: SVGAnimatedLength
    val width: SVGAnimatedLength
    val height: SVGAnimatedLength
}