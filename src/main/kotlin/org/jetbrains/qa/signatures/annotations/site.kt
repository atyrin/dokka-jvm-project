package org.jetbrains.qa.signatures.annotations

@MustBeDocumented
annotation class Inject
@MustBeDocumented
annotation class VisibleForTesting
@MustBeDocumented
annotation class Fancy

@MustBeDocumented
annotation class Ann

interface WithAnnotationSetSite {
    @set:[Inject VisibleForTesting]
    var collaborator: String
}

class R
fun @receiver:Fancy R.myExtension() { }

class WithAnnotationInConstructor(@field:Ann val foo: String,
               @get:Ann val bar: String,
               @param:Ann val quux: String)


