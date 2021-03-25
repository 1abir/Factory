package parser;

public class PythonParser extends Parser{
    public PythonParser(String font,String style, String color) {
        super.build(font,style,color);
    }

    @Override
    public void buildEditor() {
        editor = "Consolas";
        System.out.println("Editor : Consolas");
    }

}
