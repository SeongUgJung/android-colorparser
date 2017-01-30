package com.nobrain.android.colorparser;


import android.support.v4.util.SimpleArrayMap;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Util parse color from <a href="https://www.w3.org/TR/css3-color/#svg-color">w3c-css-color</a>
 */
public class ColorParser {

    private static final SimpleArrayMap<String, Integer> colorMap = new SimpleArrayMap<>();
    private static final Logger logger = Logger.getLogger(ColorParser.class.getSimpleName());
    private static int DEFAULT_COLOR = 0x00000000; // default color is black

    static {
        colorMap.put("transparent", 0x0);
        colorMap.put("aliceblue", 0xFFF0F8FF);
        colorMap.put("antiquewhite", 0xFFFAEBD7);
        colorMap.put("aqua", 0xFF00FFFF);
        colorMap.put("aquamarine", 0xFF7FFFD4);
        colorMap.put("azure", 0xFFF0FFFF);
        colorMap.put("beige", 0xFFF5F5DC);
        colorMap.put("bisque", 0xFFFFE4C4);
        colorMap.put("black", 0xFF000000);
        colorMap.put("blanchedalmond", 0xFFFFEBCD);
        colorMap.put("blue", 0xFF0000FF);
        colorMap.put("blueviolet", 0xFF8A2BE2);
        colorMap.put("brown", 0xFFA52A2A);
        colorMap.put("burlywood", 0xFFDEB887);
        colorMap.put("cadetblue", 0xFF5F9EA0);
        colorMap.put("chartreuse", 0xFF7FFF00);
        colorMap.put("chocolate", 0xFFD2691E);
        colorMap.put("coral", 0xFFFF7F50);
        colorMap.put("cornflowerblue", 0xFF6495ED);
        colorMap.put("cornsilk", 0xFFFFF8DC);
        colorMap.put("crimson", 0xFFDC143C);
        colorMap.put("cyan", 0xFF00FFFF);
        colorMap.put("darkblue", 0xFF00008B);
        colorMap.put("darkcyan", 0xFF008B8B);
        colorMap.put("darkgoldenrod", 0xFFB8860B);
        colorMap.put("darkgray", 0xFFA9A9A9);
        colorMap.put("darkgreen", 0xFF006400);
        colorMap.put("darkgrey", 0xFFA9A9A9);
        colorMap.put("darkkhaki", 0xFFBDB76B);
        colorMap.put("darkmagenta", 0xFF8B008B);
        colorMap.put("darkolivegreen", 0xFF556B2F);
        colorMap.put("darkorange", 0xFFFF8C00);
        colorMap.put("darkorchid", 0xFF9932CC);
        colorMap.put("darkred", 0xFF8B0000);
        colorMap.put("darksalmon", 0xFFE9967A);
        colorMap.put("darkseagreen", 0xFF8FBC8F);
        colorMap.put("darkslateblue", 0xFF483D8B);
        colorMap.put("darkslategray", 0xFF2F4F4F);
        colorMap.put("darkslategrey", 0xFF2F4F4F);
        colorMap.put("darkturquoise", 0xFF00CED1);
        colorMap.put("darkviolet", 0xFF9400D3);
        colorMap.put("deeppink", 0xFFFF1493);
        colorMap.put("deepskyblue", 0xFF00BFFF);
        colorMap.put("dimgray", 0xFF696969);
        colorMap.put("dimgrey", 0xFF696969);
        colorMap.put("dodgerblue", 0xFF1E90FF);
        colorMap.put("firebrick", 0xFFB22222);
        colorMap.put("floralwhite", 0xFFFFFAF0);
        colorMap.put("forestgreen", 0xFF228B22);
        colorMap.put("fuchsia", 0xFFFF00FF);
        colorMap.put("gainsboro", 0xFFDCDCDC);
        colorMap.put("ghostwhite", 0xFFF8F8FF);
        colorMap.put("gold", 0xFFFFD700);
        colorMap.put("goldenrod", 0xFFDAA520);
        colorMap.put("gray", 0xFF808080);
        colorMap.put("green", 0xFF008000);
        colorMap.put("greenyellow", 0xFFADFF2F);
        colorMap.put("grey", 0xFF808080);
        colorMap.put("honeydew", 0xFFF0FFF0);
        colorMap.put("hotpink", 0xFFFF69B4);
        colorMap.put("indianred", 0xFFCD5C5C);
        colorMap.put("indigo", 0xFF4B0082);
        colorMap.put("ivory", 0xFFFFFFF0);
        colorMap.put("khaki", 0xFFF0E68C);
        colorMap.put("lavender", 0xFFE6E6FA);
        colorMap.put("lavenderblush", 0xFFFFF0F5);
        colorMap.put("lawngreen", 0xFF7CFC00);
        colorMap.put("lemonchiffon", 0xFFFFFACD);
        colorMap.put("lightblue", 0xFFADD8E6);
        colorMap.put("lightcoral", 0xFFF08080);
        colorMap.put("lightcyan", 0xFFE0FFFF);
        colorMap.put("lightgoldenrodyellow", 0xFFFAFAD2);
        colorMap.put("lightgray", 0xFFD3D3D3);
        colorMap.put("lightgreen", 0xFF90EE90);
        colorMap.put("lightgrey", 0xFFD3D3D3);
        colorMap.put("lightpink", 0xFFFFB6C1);
        colorMap.put("lightsalmon", 0xFFFFA07A);
        colorMap.put("lightseagreen", 0xFF20B2AA);
        colorMap.put("lightskyblue", 0xFF87CEFA);
        colorMap.put("lightslategray", 0xFF778899);
        colorMap.put("lightslategrey", 0xFF778899);
        colorMap.put("lightsteelblue", 0xFFB0C4DE);
        colorMap.put("lightyellow", 0xFFFFFFE0);
        colorMap.put("lime", 0xFF00FF00);
        colorMap.put("limegreen", 0xFF32CD32);
        colorMap.put("linen", 0xFFFAF0E6);
        colorMap.put("magenta", 0xFFFF00FF);
        colorMap.put("maroon", 0xFF800000);
        colorMap.put("mediumaquamarine", 0xFF66CDAA);
        colorMap.put("mediumblue", 0xFF0000CD);
        colorMap.put("mediumorchid", 0xFFBA55D3);
        colorMap.put("mediumpurple", 0xFF9370DB);
        colorMap.put("mediumseagreen", 0xFF3CB371);
        colorMap.put("mediumslateblue", 0xFF7B68EE);
        colorMap.put("mediumspringgreen", 0xFF00FA9A);
        colorMap.put("mediumturquoise", 0xFF48D1CC);
        colorMap.put("mediumvioletred", 0xFFC71585);
        colorMap.put("midnightblue", 0xFF191970);
        colorMap.put("mintcream", 0xFFF5FFFA);
        colorMap.put("mistyrose", 0xFFFFE4E1);
        colorMap.put("moccasin", 0xFFFFE4B5);
        colorMap.put("navajowhite", 0xFFFFDEAD);
        colorMap.put("navy", 0xFF000080);
        colorMap.put("oldlace", 0xFFFDF5E6);
        colorMap.put("olive", 0xFF808000);
        colorMap.put("olivedrab", 0xFF6B8E23);
        colorMap.put("orange", 0xFFFFA500);
        colorMap.put("orangered", 0xFFFF4500);
        colorMap.put("orchid", 0xFFDA70D6);
        colorMap.put("palegoldenrod", 0xFFEEE8AA);
        colorMap.put("palegreen", 0xFF98FB98);
        colorMap.put("paleturquoise", 0xFFAFEEEE);
        colorMap.put("palevioletred", 0xFFDB7093);
        colorMap.put("papayawhip", 0xFFFFEFD5);
        colorMap.put("peachpuff", 0xFFFFDAB9);
        colorMap.put("peru", 0xFFCD853F);
        colorMap.put("pink", 0xFFFFC0CB);
        colorMap.put("plum", 0xFFDDA0DD);
        colorMap.put("powderblue", 0xFFB0E0E6);
        colorMap.put("purple", 0xFF800080);
        colorMap.put("red", 0xFFFF0000);
        colorMap.put("rosybrown", 0xFFBC8F8F);
        colorMap.put("royalblue", 0xFF4169E1);
        colorMap.put("saddlebrown", 0xFF8B4513);
        colorMap.put("salmon", 0xFFFA8072);
        colorMap.put("sandybrown", 0xFFF4A460);
        colorMap.put("seagreen", 0xFF2E8B57);
        colorMap.put("seashell", 0xFFFFF5EE);
        colorMap.put("sienna", 0xFFA0522D);
        colorMap.put("silver", 0xFFC0C0C0);
        colorMap.put("skyblue", 0xFF87CEEB);
        colorMap.put("slateblue", 0xFF6A5ACD);
        colorMap.put("slategray", 0xFF708090);
        colorMap.put("slategrey", 0xFF708090);
        colorMap.put("snow", 0xFFFFFAFA);
        colorMap.put("springgreen", 0xFF00FF7F);
        colorMap.put("steelblue", 0xFF4682B4);
        colorMap.put("tan", 0xFFD2B48C);
        colorMap.put("teal", 0xFF008080);
        colorMap.put("thistle", 0xFFD8BFD8);
        colorMap.put("tomato", 0xFFFF6347);
        colorMap.put("turquoise", 0xFF40E0D0);
        colorMap.put("violet", 0xFFEE82EE);
        colorMap.put("wheat", 0xFFF5DEB3);
        colorMap.put("white", 0xFFFFFFFF);
        colorMap.put("whitesmoke", 0xFFF5F5F5);
        colorMap.put("yellow", 0xFFFFFF00);
        colorMap.put("yellowgreen", 0xFF9ACD32);
    }

    /**
     * If it fails to parse color, then this color will be returned
     *
     * @param defaultColor default color when failing to parse.
     */
    public static void setDefaultColor(int defaultColor) {
        DEFAULT_COLOR = defaultColor;
    }

    /**
     * it will parse this format:<br>
     * #AARRGGBB ex) #FFFFFFFF<br>
     * #RRGGBB ex) #FFFFFF<br>
     * #ARGB ex) #FFFF<br>
     * #RGB ex) #FFF<br>
     * [nameed] ex) orange, purple, white...
     *
     * @param colorString target
     * @return parsed value
     */
    public static int parse(String colorString) {
        if (colorString == null || colorString.length() == 0) {
            return DEFAULT_COLOR;
        }

        if (colorString.startsWith("#")) {
            String colorCode = colorString.substring(1);
            int length = colorCode.length();
            if (length == 6 || length == 8) {
                // for FFFFFF || FFFFFFFF
                return (int) hexcodeToColor(colorCode);
            } else if (length == 3 || length == 4) {
                // for FFF || FFFF
                StringBuilder builder = new StringBuilder(8);
                for (int idx = 0; idx < length; idx++) {
                    builder.append(colorCode.charAt(idx))
                            .append(colorCode.charAt(idx));
                }

                return (int) hexcodeToColor(builder.toString());
            }

            return DEFAULT_COLOR;
        } else if (colorMap.containsKey(colorString.toLowerCase())) {
            return colorMap.get(colorString.toLowerCase());
        } else {
            return DEFAULT_COLOR;
        }

    }

    private static long hexcodeToColor(String hexcode) {
        long color = DEFAULT_COLOR;
        try {
            color = Long.parseLong(hexcode, 16);
            if (hexcode.length() == 6) {
                color |= 0xFF000000;
            }
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "Fail Color Parsing : " + hexcode, e);
        }

        return color;
    }
}
