/**
 * Precompiled [aws_lambda_demo.java-library-conventions.gradle.kts][Aws_lambda_demo_java_library_conventions_gradle] script plugin.
 *
 * @see Aws_lambda_demo_java_library_conventions_gradle
 */
public
class Aws_lambda_demo_javaLibraryConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Aws_lambda_demo_java_library_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
