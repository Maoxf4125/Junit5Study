package com.maoxf;

import com.maoxf.listener.FailCaseListener;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(FailCaseListener.class)
public class FailedTest {

    @Test
    void successTest(){
        assertThat(1, is(1));
    }

    @Test
    void failedTest(){
        assertThat(1, is(2));
    }
}
