package parser;

public abstract class Parser {

    String editor;
    String style;
    String color;
    String font;
    String keywordStyle;
    String keywordColor;

    abstract void buildEditor();
    void buildFont(String s){
        font = s;
        System.out.println("Font : "+s);
    }
    void buildStyle(String s){
        style = s;
        System.out.println("Style : "+s);
    }
    void buildColor(String s){
        color = s;
        System.out.println("Color : "+s);
    }
    void buildKeywordStyle(){
        keywordStyle = "Normal";
        System.out.println("KeywordStyle : Normal");
    }
    void buildKeywordColor(){
        keywordColor = "Blue";
        System.out.println("KeywordColor : Blue");
    }

    void build(String font,String style, String color){
        buildEditor();
        buildColor(color);
        buildStyle(style);
        buildFont(font);
        buildKeywordStyle();
        buildKeywordColor();
    }



}
