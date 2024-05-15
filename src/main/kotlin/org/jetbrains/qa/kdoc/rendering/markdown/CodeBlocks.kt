package org.jetbrains.qa.kdoc.rendering.markdown

/**
 * Starting 1.9.20 Dokka can render code block with styles.
 */
class CodeBlocks {


    /**
     * Some sample of Kotlin code but without explicit lng -- should be kotlin by default.
     *
     * Sample for code block with unspecified lang
     * ```
     * inline class A(val a: Int)
     * ```
     * end of kdoc
     */
    fun plain(){}


    /**
     * https://github.com/Kotlin/dokka/issues/3609
     * Some sample of Kotlin code but without explicit lng -- should be kotlin by default.
     *
     * Sample for code block with unspecified lang
     * `inline class A(val a: Int)`
     * end of kdoc
     */
    fun plainInline(){}


    /**
     * Some sample of code but unknown
     * ```undefined
     * let a
     * ```
     */
    fun undefined(){}

    /**
     * Some sample of Kotlin code with explicit lang
     * ```kotlin
     * value class A(val a: Int)
     * ```
     */
    fun kotlin(){}


    /**
     * JS sample
     * ```js
     * function addNumbers(num1, num2) {
     *     return num1 + num2;
     * }
     *
     * console.log(addNumbers(10, 5));  // Outputs: 15
     * ```
     */
    fun js(){}


    /**
     * ```xml
     * <?xml version="1.0" encoding="UTF-8"?>
     * <note>
     *   <to>Tove</to>
     *   <from>Jani</from>
     *   <heading>Reminder</heading>
     *   <body>Don't forget me this weekend!</body>
     * </note>
     * ```
     */
    val xml: String = ""

    /**
     * ```json
     * {
     *   "name": "John Doe",
     *   "age": 30,
     *   "address": {
     *     "street": "123 Main St",
     *     "city": "New York",
     *     "state": "NY",
     *     "postalCode": "10001"
     *   },
     *   "phoneNumbers": [
     *     {
     *       "type": "home",
     *       "number": "123 456-7890"
     *     },
     *     {
     *       "type": "mobile",
     *       "number": "987 654-3210"
     *     }
     *   ],
     *   "hasPets": false
     * }
     * ```
     */
    fun json(){}

    /**
     * ```md
     *
     * # Heading 1
     * ## Heading 2
     * ### Heading 3
     *
     * **Bold text**
     *
     * *Italic text*
     *
     * [Link to Google](https://www.google.com)
     *
     * - Bullet point
     * - Another bullet point
     *
     * 1. Numbered list item
     * 2. Another list item
     *
     * `Inline code`
     * ```
     */
    fun md(){}

}