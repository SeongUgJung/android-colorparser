# Android Color Parser

Android `android.graphics.Color` has a function for color-parsing.

but It supports [basic colors of w3c](https://www.w3.org/TR/css3-color/#html4).
 
This project is for supporting more color keywords. It's based on [W3C's Expanded Color](https://www.w3.org/TR/css3-color/#svg-color)

# How to install

```
dependencies {
    repositories {
        jcenter()
        // or
        maven {
            url  "http://dl.bintray.com/zerobrain/maven" 
        }
    }
    
    compile 'com.nobrain.android.colorparser:color-parser:1.0.0'
}
```


# How to use

```java
// parsing lime or 0x00ff00
ColorParser.parse("#FF00FF00"); 
ColorParser.parse("#00FF00"); 
ColorParser.parse("#F0F0");
ColorParser.parse("#0F0");
ColorParser.parse("lime");
ColorParser.parse("LIME");
```

# LICENSE

Apache License Version 2.0
