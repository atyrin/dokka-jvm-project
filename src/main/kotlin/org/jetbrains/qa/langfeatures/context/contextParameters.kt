package org.jetbrains.qa.langfeatures.context

interface AnalysisScope {  }
interface Type {
    context(analysisScope: AnalysisScope)
    val isNullable: Boolean
        get() = false
}

context(analysisScope: AnalysisScope)
fun Type.equalTo(other: Type): Boolean = false

context(_: AnalysisScope)
val Type.isBoolean: Boolean get() = false


interface Logger {  }
interface UserService {  }
interface DbConnection {  }

class DbUserService(val logger: Logger, val connection: DbConnection): UserService {
    companion object {
        context(logger: Logger, connection: DbConnection)
        operator fun invoke(): DbUserService = DbUserService(logger, connection)

        context(i1: Int, i2: Int, i3: Int, i4: Int, i5: Int, i6: Int, i7: Int, i8: Int, i9: Int, i10: Int)
        fun funWithLongContextList(){}

        context(i1: Int, i2: Int, i3: Int, i4: Int, i5: Int, i6: Int, i7: Int, i8: Int, i9: Int, i10: Int)
        fun funWithLongContextListWithParams(j1: String, j2: String, j3: String, j4: String, j5: String, j6: String, j7: String, j8: String, j9: String, j10: String){}
    }
}