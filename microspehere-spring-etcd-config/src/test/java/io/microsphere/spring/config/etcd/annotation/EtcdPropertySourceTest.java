/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.microsphere.spring.config.etcd.annotation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * {@link EtcdPropertySource} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@EtcdPropertySource
@ContextConfiguration(classes = {
        EtcdPropertySourceTest.class,
        EtcdPropertySourceTest.Config.class
})
public class EtcdPropertySourceTest {

    @Autowired
    private Environment environment;

    @BeforeClass
    public static void init() throws Exception {
        EtcdPropertySource annotation =
                EtcdPropertySourceTest.class.getAnnotation(EtcdPropertySource.class);
    }

    @AfterClass
    public static void destroy() {
    }


    @Test
    public void test() throws Exception {

    }

    @EtcdPropertySource(
            value = "key",
            endpoints = {
                    "http://127.0.0.1:12379"
            })
    static class Config {

    }

}