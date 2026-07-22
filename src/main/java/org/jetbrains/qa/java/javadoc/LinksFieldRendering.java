package org.jetbrains.qa.java.javadoc;

/**
 * Examples of Javadoc links grouped by tag.
 */
public class LinksFieldRendering {

    /**
     * {@link} supports package, class, member, and explicitly labelled links.
     * <p>
     * Package: {@link org.jetbrains.qa.kdoc.rendering.markdown}.
     * <p>
     * Class: {@link org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks}.
     * <p>
     * Label: {@link org.jetbrains.qa.kdoc.rendering.markdown package link}.
     * <p>
     * Class label: {@link org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks code blocks}.
     * <p>
     * Member anchor and label: {@link org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks#plain() plain code block}.
     */
    public void link() {
    }

    /**
     * {@linkplain} supports package, class, member, and explicitly labelled links.
     * <p>
     * Package: {@linkplain org.jetbrains.qa.kdoc.rendering.markdown}.
     * <p>
     * Class: {@linkplain org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks}.
     * <p>
     * Label: {@linkplain org.jetbrains.qa.kdoc.rendering.markdown package link}.
     * <p>
     * Class label: {@linkplain org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks code blocks}.
     * <p>
     * Member anchor and label: {@linkplain org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks#plain() plain code block}.
     */
    public void linkPlain() {
    }

    /**
     * The {@code @see} tag supports package, class, member, and explicitly labelled links.
     *
     * @see org.jetbrains.qa.kdoc.rendering.markdown
     * @see org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks
     * @see org.jetbrains.qa.kdoc.rendering.markdown package link
     */
    public void see() {
    }

    /**
     * @see org.jetbrains.qa.kdoc.rendering.markdown.CodeBlocks#plain() plain code block
     */
    public void seeWithAnchor() {
    }
}
