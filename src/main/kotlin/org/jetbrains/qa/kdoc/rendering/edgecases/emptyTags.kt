package org.jetbrains.qa.kdoc.rendering.edgecases

import java.io.StringReader

/**
 * Members have no values in the tag. That should be handled somehow
 * @throws
 * @author
 * @sample
 * @see
 * @exception
 * @param
 * @property
 * @constructor
 */
class ClassWithTagsWithEmptyValue(val a: String) {

    /**
     * @param
     * @see
     * @since
     * @exception
     * @sample
     * @throws
     * @author
     */
    val propertyWithEmptyTags: Int = 0

    /**
     * Function with no param name.
     * Expect: just empty field
     * @param [no param name]
     * @param
     * @return
     * @see
     * @since
     * @exception
     * @sample
     * @author
     * @throws
     */
    fun funWithEmptyPTags(param: String): StringReader {
        return StringReader(a)
    }
}