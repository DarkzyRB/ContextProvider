import android.content.Context

//
// ! Internal Object (Singleton)
internal object ContextProvider {
    private var ctx: Context? = null

    var context: Context
        get() {
            return ctx
                ?: throw IllegalStateException("App has not been initialized in Application class.")
        }
        set(value: Context) { ctx = value }
}
