package com.argo.web;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yamingd on 9/10/15.
 */
public class WebConfigTest {

    @Test
    public void testLoad() throws Exception {
        WebConfig.load();
        Assert.assertNotNull(WebConfig.instance);
    }
}
