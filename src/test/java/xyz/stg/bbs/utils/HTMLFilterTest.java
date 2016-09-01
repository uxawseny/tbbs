package xyz.stg.bbs.utils;

import org.junit.Test;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by Administrator on 2016/8/23.
 */
public class HTMLFilterTest {

    HTMLFilter filter = new HTMLFilter();

    @Test
    public void chr() throws Exception {

    }

    @Test
    public void htmlSpecialChars() throws Exception {

    }

    @Test
    public void filter() throws Exception {
        System.out.println(filter.filter(HtmlUtils.htmlEscape("<div onClick='alert(123)'>ccc</div>", "UTF-8")));
    }

    @Test
    public void isAlwaysMakeTags() throws Exception {

    }

    @Test
    public void isStripComments() throws Exception {

    }

}