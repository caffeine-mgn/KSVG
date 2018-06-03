package org.tlsys.svg

import org.tlsys.svg.dom.SVGFEOffsetElement
import org.tlsys.svg.dom.SVGFilterElement
import kotlin.browser.document

inline fun SVGFilter() = document.createSVG("filter").unsafeCast<SVGFilterElement>()
inline fun SVGFEOffset() = document.createSVG("feOffset").unsafeCast<SVGFEOffsetElement>()