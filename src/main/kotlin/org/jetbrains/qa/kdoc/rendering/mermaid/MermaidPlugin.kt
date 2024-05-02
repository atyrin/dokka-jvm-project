package org.jetbrains.qa.kdoc.rendering.mermaid

/**
 * See the graph for more details:
 * ```mermaid
 * graph LR
 *   A[Christmas] -->|Get money| B(Go shopping)
 *   B --> C{Let me think}
 *   C -->|One| D[Laptop]
 *   C -->|Two| E[iPhone]
 *   C -->|Three| F[fa:fa-car Car]
 * ```

 * another one
 * ```mermaid

gantt
title A Gantt Diagram
dateFormat YYYY-MM-DD
section Section
A task           :a1, 2014-01-01, 30d
Another task     :after a1 , 20d
section Another
Task in sec      :2014-01-12 , 12d
another task      : 24d

 * ```

 */
class MermaidPlugin {
}