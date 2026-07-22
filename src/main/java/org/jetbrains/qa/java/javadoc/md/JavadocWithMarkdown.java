package org.jetbrains.qa.java.javadoc.md;

/// Markdown Javadoc is supported for Java source comments introduced by JEP 467.
///
/// This class intentionally keeps one example for each Markdown construct covered
/// by the Dokka implementation. The methods below are separate so the generated
/// page makes regressions easy to locate.
public class JavadocWithMarkdown {

    /// Returns a hash code value for the object. This method is
    /// supported for the benefit of hash tables such as those provided by
    /// [java.util.HashMap].
    ///
    /// The general contract of `hashCode` is:
    ///
    ///   - Whenever it is invoked on the same object more than once during
    ///     an execution of a Java application, the `hashCode` method
    ///     must consistently return the same integer, provided no information
    ///     used in `equals` comparisons on the object is modified.
    ///   - If two objects are equal according to the
    ///     [equals][#equals(Object)] method, then calling the `hashCode` method
    ///     on each of the two objects must produce the same integer result.
    ///   - It is _not_ required that unequal objects produce distinct integer
    ///     results. However, distinct results may improve hash-table performance.
    ///
    /// @return a hash code value for this object.
    /// @see java.lang.Object#equals(java.lang.Object)
    /// @see java.lang.System#identityHashCode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /// Compares this object with another object.
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    /// Inline `code` block.
    ///
    /// Traditional code block:
    /// ```
    /// /** Hello World! */
    /// public class HelloWorld {
    ///     public static void main(String... args) {
    ///         System.out.println("Hello World!"); // the traditional example
    ///     }
    /// }
    /// ```
    ///
    /// Code block with a specified language:
    /// ```kotlin
    /// val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    /// ```
    public void markdownCodeBlocks() {
    }

    /// Reference links can target packages, classes, fields, methods, and
    /// explicitly labelled links:
    ///
    /// - a package [java.util]
    /// - a class [String]
    /// - a field [String#CASE_INSENSITIVE_ORDER]
    /// - a method [String#isEmpty()]
    /// - [the java.util package][java.util]
    /// - [a class][String]
    /// - [a field][String#CASE_INSENSITIVE_ORDER]
    /// - [a method][String#isEmpty()]
    /// - escaped square brackets in reference [String#copyValueOf(char\[\])]
    /// - [JetBrains](https://www.jetbrains.com/)
    public void markdownReferenceLinks() {
    }

    /// ## Inline Formatting
    ///
    /// - **Bold text** is created using double asterisks or double underscores.
    /// - *Italic text* is created using single asterisks or single underscores.
    /// - ***Bold and italic*** is created using triple asterisks.
    /// - `Inline code` is created using backticks.
    ///
    /// ## Escaping Special Characters
    ///
    /// You can escape special characters using a backslash:
    /// \*This text is not in italics\*
    public void basicTextFormatting() {
    }

    /// # Heading 1
    /// ## Heading 2
    /// ### Heading 3
    /// #### Heading 4
    /// ##### Heading 5
    /// ###### Heading 6
    ///
    /// Alternatively, headings one and two can use setext syntax:
    ///
    /// Heading 1
    /// =========
    ///
    /// Heading 2
    /// ---------
    public void headings() {
    }

    /// ## Unordered Lists
    /// - Item 1
    /// - Item 2
    ///   - Subitem 2.1
    ///   - Subitem 2.2
    /// - Item 3
    ///
    /// You can also use asterisks or plus signs:
    /// * Item A
    /// * Item B
    /// + Item X
    /// + Item Y
    ///
    /// ## Ordered Lists
    /// 1. First item
    /// 2. Second item
    ///    1. Subitem 2.1
    ///    2. Subitem 2.2
    /// 3. Third item
    public void lists() {
    }

    /// ## Basic Table
    ///
    /// | Header 1 | Header 2 | Header 3 |
    /// |----------|----------|----------|
    /// | Row 1, Col 1 | Row 1, Col 2 | Row 1, Col 3 |
    /// | Row 2, Col 1 | Row 2, Col 2 | Row 2, Col 3 |
    /// | Row 3, Col 1 | Row 3, Col 2 | Row 3, Col 3 |
    ///
    /// ## Complex Table
    ///
    /// | Method | Description | Return Type | Throws |
    /// |--------|-------------|-------------|--------|
    /// | `get(Object key)` | Returns the value for a key | `V` | `NullPointerException` |
    /// | `put(K key, V value)` | Associates a value with a key | `V` | `UnsupportedOperationException` |
    /// | `remove(Object key)` | Removes a mapping for a key | `V` | `ClassCastException` |
    public void tables() {
    }

    /// ## Basic Blockquote
    /// > Blockquotes are very handy in email to emulate reply text.
    /// > This line is part of the same quote.
    ///
    /// Quote break.
    ///
    /// > Quote
    ///
    /// ## Nested Blockquote
    /// > text 1
    /// > text 2
    /// >> text 3
    /// >> text 4
    /// >
    /// > text 5
    ///
    /// ## Blockquote Right After Text
    /// text
    /// > quote
    ///
    /// ## Blockquote Inside a Code Block
    /// ```
    /// text
    /// > quote
    /// > quote
    /// ```
    public void blockquotes() {
    }
}
