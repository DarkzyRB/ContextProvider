# ContextProvider

Kotlin Android object for global applicationContext


## Usage

In your Aplication class

```kotlin
class YourApp : Application() {

    override fun onCreate() {
        super.onCreate()

        //
        // ! Provider initialize
        ContextProvider.context = applicationContext
    }
}

```

Get and fun

```kotlin
ContextProvider.context
```
