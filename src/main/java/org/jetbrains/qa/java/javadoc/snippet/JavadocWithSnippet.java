package org.jetbrains.qa.java.javadoc.snippet;

import java.util.List;

/**
 * Demonstrates the JEP 413 {@code @snippet} tag supported by Dokka.
 *
 * <p>Each method keeps a small, focused example so the generated documentation
 * makes snippet parsing and markup regressions easy to identify.</p>
 */
public class JavadocWithSnippet {

    /**
     * A plain inline Java snippet:
     *
     * {@snippet :
     * String greeting = "Hello, snippets!";
     * System.out.println(greeting);
     * }
     *
     * Inline snippets can also specify a language explicitly:
     *
     * {@snippet lang="properties" :
     * app.name=demo
     * app.version=1.0
     * }
     *
     * {@snippet lang="kotlin" :
     * fun greet(name: String) = "Hello, $name!"
     * }
     */
    public void inlineSnippets() {
    }

    /**
     * Highlight markup supports bold, italic, and highlighted text, as well as
     * region-wide regular-expression highlighting.
     *
     * {@snippet :
     * public void configure() { // @highlight substring="public" type="bold"
     *     String text = "hello"; // @highlight substring="text" type="italic"
     *     int count = 42;         // @highlight substring="42" type="highlighted"
     * }
     * // @highlight regex="test[\d]{1}" region
     * System.out.println("test1");
     * System.out.println("test2");
     * // @end
     * }
     */
    public void highlightedSnippet() {
    }

    /**
     * Replace markup supports literal and regular-expression replacement, both
     * for individual lines and for a named region.
     *
     * {@snippet :
     * String config = "oldValue"; // @replace substring="oldValue" replacement="newValue"
     * System.out.println("Hello World!"); // @replace regex='".*"' replacement="..."
     * // @replace region="credentials" regex="secret\d+" replacement="***"
     * String password = "secret123";
     * // @end region="credentials"
     * }
     */
    public void replacedSnippet() {
    }

    /**
     * Link markup can target JDK declarations, the current class, and methods
     * referenced by either a substring or a regular expression.
     *
     * {@snippet :
     * // @link substring="System.out" target="System#out" region
     * System.out.println("Hello World!");
     * System.out.println("link"); // @link substring="println" target="java.io.PrintStream#println(String)"
     * List<String> items = new ArrayList<>(); // @link regex="\\bList" target="List"
     * items.stream() // @link substring="stream" target="java.util.Collection#stream()"
     *     .filter(s -> !s.isEmpty())
     *     .map(String::toUpperCase) // @link substring="String" target="String"
     *     .forEach(System.out::println); // @end
     * processItems(items); // @link substring="processItems" target="#processItems(List)"
     * }
     */
    public void linkedSnippet() {
    }

    /**
     * Multiple markup directives may appear on the same line.
     *
     * {@snippet :
     * String value = "hello".toUpperCase().trim(); // @link substring="toUpperCase" target="String#toUpperCase()" @link substring="trim" target="String#trim()" @replace substring="hello" replacement="..."
     * }
     */
    public void multipleMarkupTags() {
    }

    /**
     * A trailing colon applies the markup directive to the following line.
     *
     * {@snippet lang="properties" :
     * local.timezone=PST
     * # @highlight regex="[0-9]+" :
     * local.zip=94123
     * local.area-code=415
     * }
     */
    public void markupOnNextLine() {
    }

    /**
     * External snippets can be loaded from {@code snippet-files} by file name
     * or class name, and narrowed to a named region.
     *
     * {@snippet lang="kotlin" file="KtSnippetSource.kt" region="example"}
     *
     * {@snippet file="SnippetSource.java" region="example"}
     *
     * {@snippet class="SnippetSource" region="example"}
     */
    public void externalSnippets() {
    }

    public void processItems(List<String> items) {
        items.forEach(System.out::println);
    }
}
