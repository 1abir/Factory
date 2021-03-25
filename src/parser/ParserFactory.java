package parser;

public class ParserFactory {

    public Parser getParser(String fileType,String style,String font, String color){
        switch (fileType){
            case "py":
                return new PythonParser(font, style, color);
            case "c":
                return new CParser(font, style, color);
            case "cpp":
                return new CppParser(font, style, color);
        }
        return null;
    }
}
