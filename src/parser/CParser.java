package parser;

public class CParser extends Parser {
    public CParser(String font,String style, String color) {
        super.build(font,style,color);
    }

    @Override
    public void buildEditor() {
        editor = "Monaco";
        System.out.println("Editor : Monaco");
    }
}
