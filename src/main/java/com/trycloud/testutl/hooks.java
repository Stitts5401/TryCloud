package com.trycloud.testutl;

import com.trycloud.base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends TestBase {
public hooks(){
    super();
}
    @Before
    public void setup(){
        initialization();
        TestUtil.sleep(1000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
