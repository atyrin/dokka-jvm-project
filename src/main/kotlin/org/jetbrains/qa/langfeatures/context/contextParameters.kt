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
    }
}