package org.jetbrains.qa.signatures.constructors

annotation class NotDocumentedForConstructor

@MustBeDocumented
annotation class DocumentedForConstructor

class ConstructorDefault {}

class ConstructorsOnlyPrimary(val p: String)

class ConstructorsOnlySecondary {
    constructor(s: String)
}

class ConstructorsPrimaryAndSecondary(val p: String) {
    constructor(i: Int) : this(i.toString())
}

class ConstructorsPrimaryExplicit constructor(p: String)
class ConstructorsPWithNonDocAnnotation @NotDocumentedForConstructor constructor(p: String)
class ConstructorsSecondaryWithNonDocAnnotation {
    @NotDocumentedForConstructor
    constructor(p: String)
}

class ConstructorsPWithDocAnnotation @DocumentedForConstructor constructor(p: String)
class ConstructorsSecondaryWithDocAnnotation {
    @DocumentedForConstructor
    constructor(p: String)
}