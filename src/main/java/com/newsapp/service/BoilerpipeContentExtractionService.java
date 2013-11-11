package com.newsapp.service;

import java.net.URL;

import de.l3s.boilerpipe.document.TextDocument;
import de.l3s.boilerpipe.extractors.ArticleExtractor;
import de.l3s.boilerpipe.sax.BoilerpipeSAXInput;
import de.l3s.boilerpipe.sax.HTMLDocument;
import de.l3s.boilerpipe.sax.HTMLFetcher;

public class BoilerpipeContentExtractionService {

    public Content content(String url) {
        try {
            final HTMLDocument htmlDoc = HTMLFetcher.fetch(new URL(url));
            final TextDocument doc = new BoilerpipeSAXInput(htmlDoc.toInputSource()).getTextDocument();
            String title = doc.getTitle();

            String content = ArticleExtractor.INSTANCE.getText(doc);
            return new Content(title, content);
        } catch (Exception e) {
            // ignore exception
        }
        return null;

    }
}
