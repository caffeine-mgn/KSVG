package org.tlsys.svg.dom

import org.w3c.dom.svg.SVGAnimatedNumber
import org.w3c.dom.svg.SVGAnimatedString
import org.w3c.dom.svg.SVGElement

/**
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEOffsetElement">Documentation</a>
 */
abstract external class SVGFEOffsetElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val dx: SVGAnimatedNumber
    val dy: SVGAnimatedNumber
}