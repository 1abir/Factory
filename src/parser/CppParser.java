package parser;

public class CppParser extends Parser {

    public CppParser(String font,String style, String color) {
        super.build(font,style,color);
    }

    @Override
    public void buildEditor() {
        editor = "Courier New";
        System.out.println("Editor : Courier New");
    }
}
