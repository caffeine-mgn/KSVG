package org.tlsys.svg.dom

import org.w3c.dom.svg.SVGAnimatedEnumeration
import org.w3c.dom.svg.SVGAnimatedInteger
import org.w3c.dom.svg.SVGAnimatedLength
import org.w3c.dom.svg.SVGElement

/**
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFilterElement">Documentation</a>
 */
abstract external class SVGFilterElement : SVGElement {
    val filterUnits: SVGAnimatedEnumeration
    val primitiveUnits: SVGAnimatedEnumeration
    val x: SVGAnimatedLength
    val y: SVGAnimatedLength
    val width: SVGAnimatedLength
    val height: SVGAnimatedLength
    val filterResX: SVGAnimatedInteger
    val filterResY: SVGAnimatedInteger
}