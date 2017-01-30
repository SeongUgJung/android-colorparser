# Android Color Parser

Android `android.graphics.Color` has a fuction for parsing.

but It supports basically [colors of w3c](https://www.w3.org/TR/css3-color/#html4).
 
This project is for supporting more color keywords.

They are defined in [W3C's Expanded Color](https://www.w3.org/TR/css3-color/#svg-color)

# How to install



# How to use

```java
// parsing hex code of lime, 0x00ff00
ColorParser.parse("#FF00FF00"); 
ColorParser.parse("#00FF00"); 
ColorParser.parse("#F0F0");
ColorParser.parse("#0F0");
ColorParser.parse("lime");
ColorParser.parse("LIME");
```

# LICENSE

Apache License Version 2.0