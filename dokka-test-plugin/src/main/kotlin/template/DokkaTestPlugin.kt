package template

import external.documents.ExternalDocumentableProviderImpl
import external.documents.MyPageTransformerForExternalDocs
import external.documents.MySamplesRewriter
import org.jetbrains.dokka.CoreExtensions
import org.jetbrains.dokka.analysis.kotlin.KotlinAnalysisPlugin
import org.jetbrains.dokka.plugability.DokkaPlugin
import org.jetbrains.dokka.plugability.DokkaPluginApiPreview
import org.jetbrains.dokka.plugability.PluginApiPreviewAcknowledgement

class DokkaTestPlugin : DokkaPlugin() {
    init {
        println("DokkaTest Plugin applied")
    }

//    val transformer by extending {
//        CoreExtensions.pageTransformer providing {
//            MyPageTransformerForExternalDocs(it)
//        }
//    }

//    val myExternalDocumentableProvider by extending {
//        plugin<KotlinAnalysisPlugin>().externalDocumentableProvider with ExternalDocumentableProviderImpl()
//    }

    val myExternalDocumentableProvider by extending {
        plugin<KotlinAnalysisPlugin>().sampleRewriter with MySamplesRewriter()
    }

    @DokkaPluginApiPreview
    override fun pluginApiPreviewAcknowledgement() = PluginApiPreviewAcknowledgement
}