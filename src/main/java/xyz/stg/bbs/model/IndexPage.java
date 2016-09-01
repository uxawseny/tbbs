package xyz.stg.bbs.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shitiangao on 16/7/20.
 */
@Component
public class IndexPage {

    public List<String> getSections() {
        return Arrays.asList("杂谈", "答疑");
    }

}
