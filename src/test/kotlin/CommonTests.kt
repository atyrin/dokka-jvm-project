import org.jetbrains.qa.java.constructors.ConstructorsJavaAnnotation
import org.jetbrains.qa.java.constructors.JavaClassDefaultConstructor
import org.jetbrains.qa.java.constructors.JavaClassExplicitDefaultConstructors
import org.jetbrains.qa.java.constructors.JavaRecord
import org.jetbrains.qa.java.members.JavaClassWithNested
import org.jetbrains.qa.members.ClassWithNested
import org.junit.Test
import java.io.File

class CommonTests {
    @Test
    fun t(){
        val q = zz()(2)
        val outside = inside(10)
        print(outside)
    }


    @Test
    fun t2(){
        println(File("index.html").exists())
    }

    fun inside(p: Int): String{
        ConstructorsJavaAnnotation()
        val r = JavaRecord("")
        r.recordProp1
        JavaClassWithNested.Nested()
        JavaClassWithNested().Inner()
        JavaClassDefaultConstructor()
        JavaClassExplicitDefaultConstructors()
        ClassWithNested.Nested()
        ClassWithNested().Inner()
        print("")
        val x = p * 2
        return x.toString()
    }
}

fun zz(): (Int) -> Int = { it -> it * 2 }
