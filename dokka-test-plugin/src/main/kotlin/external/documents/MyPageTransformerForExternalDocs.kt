package external.documents

import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.analysis.kotlin.KotlinAnalysisPlugin
import org.jetbrains.dokka.analysis.kotlin.documentable.ExternalDocumentableProvider
import org.jetbrains.dokka.analysis.kotlin.sample.SampleAnalysisEnvironmentCreator
import org.jetbrains.dokka.links.DRI
import org.jetbrains.dokka.pages.RootPageNode
import org.jetbrains.dokka.plugability.DokkaContext
import org.jetbrains.dokka.plugability.plugin
import org.jetbrains.dokka.plugability.query
import org.jetbrains.dokka.plugability.querySingle
import org.jetbrains.dokka.transformers.pages.PageTransformer

class MyPageTransformerForExternalDocs(private val context: DokkaContext) : PageTransformer {
    override fun invoke(input: RootPageNode): RootPageNode {
        val provider = context.plugin<KotlinAnalysisPlugin>().querySingle { externalDocumentableProvider }
        val sourceSet = context.configuration.sourceSets.single()

        defaultProviderGetClassFromRuntime(provider, sourceSet)
//        customProvider(provider, sourceSet)
        samples()
        return input
    }

    private fun defaultProviderGetClassFromRuntime(
        provider: ExternalDocumentableProvider,
        sourceSet: DokkaConfiguration.DokkaSourceSet
    ) {
        val argTypeDRI = DRI("x", "Runtime")
        val argTypeClass = provider.getClasslike(argTypeDRI, sourceSet)
        println(argTypeClass?.classlikes?.size)
        println(argTypeClass?.dri)
    }

    private fun samples() {
        val creator = context.plugin<KotlinAnalysisPlugin>().querySingle { sampleAnalysisEnvironmentCreator }
        val sourceSet = context.configuration.sourceSets.single()
        val sample = creator.use {
            resolveSample(sourceSet, "org.jetbrains.qa.kdoc.rendering.samples.samplesComplex")
        }
        println(sample?.body)
    }

    private fun customProvider(
        provider: List<ExternalDocumentableProvider>,
        sourceSet: DokkaConfiguration.DokkaSourceSet
    ) {
        val argTypeClass = provider[1].getClasslike(DRI(), sourceSet)
        println(argTypeClass)
    }
}