package com.mishka.org.server.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static java.rmi.server.LogStream.log;

public class WebParser {
    public void parseWiki() {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://en.wikipedia.org/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
//            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
            System.out.println(headline.attr("title") + "\n" + headline.absUrl("href"));
        }
    }
}
