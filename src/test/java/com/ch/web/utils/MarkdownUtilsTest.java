package com.ch.web.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkdownUtilsTest {

    @Test
    void renderHtml() {
        String markdown = "### 这是标题";
        String s = MarkdownUtils.renderHtml(markdown);
        System.out.println(s);
    }
}