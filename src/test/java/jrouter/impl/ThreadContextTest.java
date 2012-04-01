/*
 * Copyright (C) 2010-2111 sunjumper@163.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package jrouter.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ThreadContextTest。
 */
public class ThreadContextTest {

    private ThreadContext ac;

    @Before
    public void init() {
        ac = new ThreadContext();
        ThreadContext.set(ac);
    }

    @After
    public void tearDown() {
        ThreadContext.remove();
    }

    @Test
    public void testActionContext() {
        assertNotNull(ThreadContext.get());
        assertSame(ThreadContext.get(), ac);
    }
}
