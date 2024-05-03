package org.jetbrains.qa.signatures.arguments.functional


/**
 * Function with functional param
 * @return [(Int) -> Int]
 */
fun funWithFunctionalTypeReturn(): (Int) -> Int = { it -> it * 2 }


/**
 * Function with functional param
 * @param p [(String) -> Int]
 * @return [(Int) -> Int]
 */
fun funWithFunctionalTypeGetAndReturn(p: (String) -> Int): (Int) -> Int = { it -> it * 2 }