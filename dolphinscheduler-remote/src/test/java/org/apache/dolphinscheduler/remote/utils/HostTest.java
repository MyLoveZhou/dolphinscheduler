/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.remote.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * host test
 */
public class HostTest {

    @Test
    public void testHost() {
        Host host = Host.of("192.158.2.2:22");
        Assertions.assertEquals(22, host.getPort());
        host = new Host("127.0.0.1:8888");
        Assertions.assertEquals("127.0.0.1", host.getIp());
        Assertions.assertEquals(8888, host.getPort());

        host = new Host("2001:db8:1::ab9:C0A8:102:5678");
        Assertions.assertEquals("2001:db8:1::ab9:C0A8:102", host.getIp());
        Assertions.assertEquals(5678, host.getPort());
    }

}
