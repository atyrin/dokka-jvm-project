package external.documents

import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.analysis.kotlin.documentable.ExternalDocumentableProvider
import org.jetbrains.dokka.links.DRI
import org.jetbrains.dokka.model.*
import org.jetbrains.dokka.model.properties.PropertyContainer

class ExternalDocumentableProviderImpl : ExternalDocumentableProvider {
    override fun getClasslike(dri: DRI, sourceSet: DokkaConfiguration.DokkaSourceSet): DClasslike? {
        return DClass(
            dri = DRI(),
            name = "CustomClassFromPlugin",
            constructors = emptyList(),
            classlikes = emptyList(),
            companion = null,
            documentation = emptyMap(),
            expectPresentInSet = null,
            extra = PropertyContainer.empty(),
            visibility = emptyMap(),
            generics = emptyList(),
            modifier = emptyMap(),
            properties = emptyList(),
            sources = emptyMap(),
            sourceSets = emptySet(),
            supertypes = emptyMap(),
            isExpectActual = false,
            functions = listOf(
                DFunction(
                    dri = DRI(),
                    name = "function0",
                    documentation = emptyMap(),
                    expectPresentInSet = null,
                    extra = PropertyContainer.empty(),
                    visibility = emptyMap(),
                    generics = emptyList(),
                    modifier = emptyMap(),
                    sources = emptyMap(),
                    sourceSets = emptySet(),
                    type = Void,
                    receiver = null,
                    isConstructor = false,
                    isExpectActual = false,
                    parameters = listOf(
                        DParameter(
                            dri = DRI(),
                            name = "f0p0",
                            documentation = emptyMap(),
                            expectPresentInSet = null,
                            extra = PropertyContainer.empty(),
                            sourceSets = emptySet(),
                            type = Void
                        ),
                        DParameter(
                            dri = DRI(),
                            name = "f0p1",
                            documentation = emptyMap(),
                            expectPresentInSet = null,
                            extra = PropertyContainer.empty(),
                            sourceSets = emptySet(),
                            type = Void
                        )
                    )
                ),
                DFunction(
                    dri = DRI(),
                    name = "function1",
                    documentation = emptyMap(),
                    expectPresentInSet = null,
                    extra = PropertyContainer.empty(),
                    visibility = emptyMap(),
                    generics = emptyList(),
                    modifier = emptyMap(),
                    sources = emptyMap(),
                    sourceSets = emptySet(),
                    type = Void,
                    receiver = null,
                    isConstructor = false,
                    isExpectActual = false,
                    parameters = listOf(
                        DParameter(
                            dri = DRI(),
                            name = "f1p0",
                            documentation = emptyMap(),
                            expectPresentInSet = null,
                            extra = PropertyContainer.empty(),
                            sourceSets = emptySet(),
                            type = Void
                        ),
                        DParameter(
                            dri = DRI(),
                            name = "f1p1",
                            documentation = emptyMap(),
                            expectPresentInSet = null,
                            extra = PropertyContainer.empty(),
                            sourceSets = emptySet(),
                            type = Void
                        )
                    )
                )
            )
        )
    }
}