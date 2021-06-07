package com.safecornerscoffee.mocha.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/web/WEB-INF/applicationContext.xml")
public class TimeServiceTest {

    @Autowired
    TimeService timeService;

    @Test
    public void getCurrentTimeTest() {
        String time = timeService.getCurrentTime();
        assertThat(time).isNotNull();
    }
}