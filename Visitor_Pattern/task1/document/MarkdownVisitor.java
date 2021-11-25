package Visitor_Pattern.task1.document;

public class MarkdownVisitor implements DocumentVisitor {
    public void visit(ItalicTextSegment doc) {

    }
    public void visit(BoldTextSegment doc) {

    }
    public void visit(UrlSegment doc) {

    }
    public void visit(PlainTextSegment doc) {

    }
    public StringBuilder getDocument(StringBuilder string) {
        return string;
    }

    public MarkdownVisitor() {
    }
}
