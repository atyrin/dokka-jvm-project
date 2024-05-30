package org.jetbrains.qa.langfeatures.dataclasses


/**
 * Check out the property [prop] and generated obvious functions.
 */
data class DataClass(val prop: String)


/**
 * References:
 * - [DataClass.prop] -- property
 * - [DataClass.component1] -- the same property
 * - [DataClass.copy] -- default function
 */
fun referencesDataClass(){}