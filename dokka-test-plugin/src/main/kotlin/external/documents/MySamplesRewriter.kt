package external.documents

import org.jetbrains.dokka.analysis.kotlin.sample.FunctionCallRewriter
import org.jetbrains.dokka.analysis.kotlin.sample.SampleRewriter

class MySamplesRewriter: SampleRewriter {
    override fun getFunctionCallRewriter(name: String): FunctionCallRewriter? {
        if (name in setOf("replaceMe")) {
            return FCW()
        }
        return null
    }
}

class FCW: FunctionCallRewriter {
    override fun rewrite(arguments: List<String>, typeArguments: List<String>): String {
        return "// <here was function [replaceMe(...)] but plugin replaced it>"
    }
}