package org.jetbrains.qa.inheritence.properties


/**
 * [name] is a property
 */
abstract class Parent<out RowType : Any>(val name: (String) -> RowType)


/**
 * [name] is a parameter. But [Child] class inherited from [Parent]
 */
abstract class Child<out RowType : Any>(name: (String) -> RowType) : Parent<RowType>(name)


