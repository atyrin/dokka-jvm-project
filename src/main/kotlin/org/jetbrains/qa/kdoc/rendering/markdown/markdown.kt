package org.jetbrains.qa.kdoc.rendering.markdown


/**
 * Headers
 * # A first-level heading
 * ## A second-level heading
 * ### A third-level heading
 *
 * **This is bold text**
 *
 * _This text is italicized_
 *
 * ~~This was mistaken text~~
 *
 * **This text is _extremely_ important**
 *
 * This is a <sub>subscript</sub> text
 *
 * This is a <sup>superscript</sup> text
 */
fun simpleMarkdownFormatting(){

}


/**
 * Some basic Git commands are:
 * ```
 * git status
 * git add
 * git commit
 * ```
 */
fun codeMarkdownFormatting(){}


/**
 * Some basic Git commands are: `git status` and `git commit`.
 * May be we can combine it with `code` ot _italic_
 */
fun inlineCodeMarkdownFormatting(){}


/**
 * Text that is not a quote
 *
 * > Text that is a quote
 */
fun quotesMarkdownFormtting(){}


/**
 * This site was built using [GitHub Pages](https://pages.github.com/).
 *
 * And with image!
 *
 * ![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://myoctocat.com/assets/images/base-octocat.svg)
 */
fun linksMarkdownFormatting(){}