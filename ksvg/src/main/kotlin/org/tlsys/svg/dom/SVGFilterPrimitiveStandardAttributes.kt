package org.tlsys.svg.dom

import org.w3c.dom.svg.SVGAnimatedLength
import org.w3c.dom.svg.SVGAnimatedString

/**
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFilterPrimitiveStandardAttributes">Documentation</a>
 */
external interface SVGFilterPrimitiveStandardAttributes {
    val x: SVGAnimatedLength
    val y: SVGAnimatedLength
    val width: SVGAnimatedLength
    val height: SVGAnimatedLength
    val result: SVGAnimatedString
}