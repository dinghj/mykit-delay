/**
 * Copyright 2019-2999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.delay;

import io.mykit.delay.queue.core.ConsumeQueueProvider;
import io.mykit.delay.starter.ready.StartGetReady;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuyazhuang
 * @version 1.0.0
 * @date 2019/5/30
 * @description 测试延迟队列
 */
@SpringBootApplication
public class TestDelayQueue {

    public static void main(String[] args) {
        StartGetReady.ready(ConsumeQueueProvider.class.getName());
        SpringApplication.run(TestDelayQueue.class, args);
    }
}
