package org.jetbrains.qa.langfeatures.companion;


public class CompanionConsumer {
    public static void main(String[] args) {
//        WithEmptyCompanion.Companion co = new WithEmptyCompanion.Companion();
        String s = WithFieldedCompanion.WithValue.getValue();
        String s1 = WithFieldedWithJvmFieldCompanion.value;
        WithFunctioedAndJvmStaticCompanion.WithJvmStaticFunc.func();
        WithFunctioedAndJvmStaticCompanion.func();
        WithFunctionedCompanion.WithFunc.func();
    }
}
