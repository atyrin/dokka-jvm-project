package org.jetbrains.qa.java.javadoc;

/**
 *
 * Test link: {@link org.jetbrains.qa.kdoc.rendering.markdown}. End of link.
 * Test link: {@link org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks}. End of link.
 *
 * @see org.jetbrains.qa.kdoc.rendering.markdown
 * @see org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks
 */
public class LinksFieldRendering {

    /**
     *
     * Test link: {@link org.jetbrains.qa.kdoc.rendering.markdown}. End of link.
     */
    void package1(){}

    /**
     * declaration with seeAlso
     * @see org.jetbrains.qa.kdoc.rendering.markdown
     */
    void package2(){}


    /**
     *
     * Test link: {@link org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks}. End of link.
     */
    void class1(){}

    /**
     * declaration with seeAlso
     * @see org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks
     */
    void class2(){}
}
