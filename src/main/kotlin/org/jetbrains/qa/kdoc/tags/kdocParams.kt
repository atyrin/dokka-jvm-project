package org.jetbrains.qa.kdoc.tags

import java.io.StringReader


/**
 * Oh. Hi Mark
 * @see [java.applet.AppletContext.showDocument] джава аплет шоу документ
 * @see [java.io.StringReader] стрин ридер
 * @see [java.beans.DefaultPersistenceDelegate] some comment 03
 * @see [org.jetbrains.qa.kdoc.rendering.edgecases.LongPackageName] some comment 01
 * @see [org.jetbrains.qa.kdoc.rendering.edgecases.LongPackageName] some comment 02
 * @see [org.jetbrains.qa.kdoc.rendering.edgecases.LongPackageName] some comment 03
 * @see [MyExternalLink](http://google.com)
 */
class ClassWithLongSeeAlsoList(val propInPrimaryConstructor: String) {

    val propInBody: String = ""

    /**
     * Adds a [propInPrimaryConstructor] to this group. [propInPrimaryConstructor] is a property from constructor
     *
     * Adds a [propInBody] to this group. [propInBody] is a property in the class body
     *
     * @see [java.applet.AppletContext] some comment 01
     * @see [java.io.StringReader] some comment 02
     * @see [java.beans.DefaultPersistenceDelegate] some comment 03
     * @return the new size of the group.
     * @since 1.6
     * @author Lorem Ipsum
     */
    fun funWith3SeeAlso(): StringReader {
        return StringReader(propInPrimaryConstructor)
    }

    /**
     * Adds a [propInPrimaryConstructor] to this group.
     * @return the new size of the group.
     * @since 1.1
     * @suppress
     */
    fun funWithSupressTag(): Int {
        return 0
    }
}


/**
 * Adds a [a] to this group.
 * @since 1.1
 * @suppress
 */
fun supressedFunctionShouldnBeVisible(): Int {
    return 0
}

/**
 * Function with all tags
 * @since 1.1
 * @author David Blaine
 * @throws NoSuchMethodException on NSME via `@throws` param
 * @exception NullPointerException NPE via `@exception` param
 * @see  [java.io.StringReader] copypasted
 * @param [param] integer param
 * @return [Int] exactly the same as param divided by 2
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 */
fun allKDocTagsFun(param: Int): Int {
    return 0
}


/**
 * Value with all tags
 * @since 1.1
 * @author David Blaine
 * @throws Exception on NRE `@throws` param
 * @ex ception Exception Here is an `@exception` param
 * @see  [java.io.StringReader] just see it
 * @see  [java.io.StringReader.TRANSFER_BUFFER_SIZE] just see it as well
 * @param [param] integer param
 * @return [Int] exactly the same as param divided by 2
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 */
val allKDocTagsVal: Int = 100


/**
 * Extension Function with all tags
 * @since 1.1
 * @author David Blaine
 * @throws NullPointerException on NPE `@throws` param
 * @throws NoSuchMethodException on NSME `@throws` param
 * @exception Exception Here is an `@exception` param
 * @see  [java.io.StringReader.lock] see this
 * @see  [java.io.StringReader.mark] see that
 * @param [paramInt] integer param
 * @param [paramStr] string param
 * @return [Int] exactly the same as param divided by 2
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 * @receiver String so, the receiver function. This function somehow extent it and add more functionality bla-bla-bla
 */
fun String.allKDocTagsExtension(paramInt: Int, paramStr: String): Int {
    return 0
}


/**
 * Extension value with getter
 * @since 1.1
 * @author David Blaine
 * @throws Exception on NRE `@throws` param
 * @ex ception Exception Here is an `@exception` param
 * @see  [java.io.StringReader] copypasted
 * @param [param] integer param
 * @return [Int] exactly the same as param divided by 2
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 * @receiver String so, the receiver function. This function somehow extent it and add more functionality bla-bla-bla
 */
val String.allKDocTagsValExtension: String
    get() = "100"

/**
 * Reference in description [AllKDocTagsClass]
 *
 * @since 1.1
 * @author David Blaine
 * @author Robert The First
 * @throws Exception on NRE `@throws` param one
 * @throws Exception on NRE `@throws` param two
 * @see  [java.io.StringReader] see this
 * @see  [java.io.StringReader.mark] see this too
 * @param [paramInt] integer param
 * @param [paramStr] string param
 * @property propertyIntVal interger property description from class kdoc
 * @property propertyUnassignedVar unassigned property description from class kdoc
 * @return [Int] exactly the same as param divided by 2
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 * @constructor reference in constructor [AllKDocTagsClass]
 */
class AllKDocTagsClass(paramInt: Int, paramStr: String = "100") {
    /**
     * String property description from prop kdoc
     * @since 1.8
     */
    val propertyStringVal: String = "str"
    val propertyIntVal: Int = 100
    lateinit var propertyUnassignedVar: String

    /**
     * Inner class with all tags
     * @since 1.1
     * @author David Blaine
     * @throws Exception on NRE `@throws` param
     * @exception Exception Here is an `@exception` param
     * @see  [java.io.StringReader] copypasted
     * @param [innerParam] integer param for inner class
     * @return [Int] exactly the same as param divided by 2
     * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
     * @constructor [InnerClass] constructor of class description
     * @property innerProp inner property described in class kdoc
     *
     */
    inner class InnerClass(innerParam: AllKDocTagsClass) {
        lateinit var innerProp: InnerClass
    }

    /**
     * Inner class with all tags
     * @since 1.1.1.1-SNAPSHOT
     * @author David Blaine
     * @throws Exception on NRE `@throws` param
     * @exception Exception Here is an `@exception` param
     * @see  [java.io.StringReader] copypasted
     * @param [nestedParam] integer param for inner class in nested class kdoc
     * @return [Int] exactly the same as param divided by 2
     * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
     * @constructor [InnerClass] constructor of class description
     * @property paramProp parametrised property described in nested class kdoc
     *
     */
    class NestedClass(
        /**
         * Param described in the param kdoc
         */
        nestedDescrivedParam: String,
        val paramProp: Int,
        nestedParam: AllKDocTagsClass
    )


    /**
     * Companion object of the [AllKDocTagsClass]
     * @since 1.7.20
     * @author David Blaine <andrei.tyrin@jb.com>
     * @throws Exception on NRE `@throws` param
     * @exception Exception Here is an `@exception` param
     * @see  [java.io.StringReader] some java class
     * @param there is no params
     * @property [COMPANION_PROPERTY_VAR] property of the companion object described in companion kdoc
     * @return [Int] exactly the same as param divided by 2
     * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
     * @constructor [InnerClass] constructor of companion object??
     *
     */
    companion object {
        /**
         * Companion prop described in prop kdoc
         */
        const val COMPANION_PROPERTY_CONST: String = "p"
        var COMPANION_PROPERTY_VAR: String = "p"

        /**
         * Companion function
         */
        fun companionFun(): InnerClass {
            return AllKDocTagsClass(0, "")
                .InnerClass(AllKDocTagsClass(1, ""))
        }
    }


    /**
     * Function inside [AllKDocTagsClass]
     * @since 1.7
     * @author David Blaine
     * @throws Exception on NRE `@throws` param
     * @exception Exception Here is an `@exception` param
     * @see  [java.io.StringReader] copypasted
     * @param [param] integer param
     * @return [Int] exactly the same as param divided by 2
     * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
     */
    fun funWithoutParam() {}


    fun funWithoutParam(p: Any): Nothing {
        TODO()
    }
}


/**
 * Class with *empty* Throws tab
 * @throws Exception with description
 */
class ThrowsTab

/**
 * Function
 * @throws Exception with throws
 */
fun throwsBlockWithThrowsTag() {}

/**
 * Function
 * @exception Exception with exception
 */
fun throwsBlockWithExceptionTag() {}


/**
 * @param nestedParam param described in class kdoc
 * @property describedInClassKDoc class kdoc
 */
class ParamsAndPropertiesClass(
    /**
     * Param described in the param kdoc
     */
    locallyDescribed: String,
    nestedParam: AllKDocTagsClass
) {
    val nonDescribed: String = ""

    /**
     * locally described
     */
    val describedLocally: String = ""

    val describedInClassKDoc: String = ""
}

/**
 * @param functionDescribed param described in class kdoc
 */
fun paramsFun(
    /**
     * Param described in the param kdoc
     */
    locallyDescribed: String,
    functionDescribed: AllKDocTagsClass
) {
}