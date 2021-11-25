package Visitor_Pattern.task1;

import Visitor_Pattern.task1.document.DokuWikiVisitor;
import Visitor_Pattern.task1.document.MarkdownVisitor;
import Visitor_Pattern.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        StringBuilder text = new StringBuilder("");
        for(var el : textSegments) {
            text.append(el.getContent());
        }
        return new DokuWikiVisitor().getDocument(text);
    }

    public StringBuilder getMarkdownDocument() {
        StringBuilder text = new StringBuilder("");
        for(var el : textSegments) {
            text.append(el.getContent());
        }
        return new MarkdownVisitor().getDocument(text);
    }
}
