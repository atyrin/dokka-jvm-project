package org.jetbrains.qa.langfeatures.companion

class WithEmptyCompanion{
    companion object{

    }
}


class WithFieldedCompanion{
    companion object WithValue{
        val value: String = " "
    }
}

class WithFieldedWithJvmFieldCompanion{

    companion object WithJvmFieldValue{
        @JvmField
        val value: String = " "
    }
}


class WithFunctionedCompanion{

    companion object WithFunc{
        fun func(){}
    }
}

/**
 * Extension for companion
 */
fun WithFunctionedCompanion.WithFunc.extension(){}

class WithFunctioedAndJvmStaticCompanion{

    companion object WithJvmStaticFunc{
        @JvmStatic
        fun func(){}
    }
}

/**
 * @suppress
 */
fun useCompanions(){
    WithEmptyCompanion
    WithFieldedCompanion.value
    WithFieldedCompanion.value
    WithFieldedWithJvmFieldCompanion.value
    WithFieldedWithJvmFieldCompanion.value
    WithFunctionedCompanion.func()
    WithFunctionedCompanion.func()
}