package Visitor_Pattern.task1.document;

public interface DocumentVisitor {
    void visit(ItalicTextSegment doc);
    void visit(BoldTextSegment doc);
    void visit(UrlSegment doc);
    void visit(PlainTextSegment doc);
    StringBuilder getDocument(StringBuilder string);
}
