/*
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.yardstickframework;

import java.util.*;

/**
 * Benchmark probe.
 */
public interface BenchmarkProbe {
    /**
     * Starts probe execution.
     *
     * @param drv Benchmark driver.
     * @param cfg Benchmark configuration.
     * @throws Exception If start failed.
     */
    public void start(BenchmarkDriver drv, BenchmarkConfiguration cfg) throws Exception;

    /**
     * Stops probe execution.
     *
     * @throws Exception If stop failed.
     */
    public void stop() throws Exception;

    /**
     * Gets collection of meta information.
     * Meta information is description of every point value.
     *
     * @return Collection of meta information.
     */
    public Collection<String> metaInfo();

    /**
     * Gets collection of probe points. This collection should reset each time this method is called.
     *
     * @return Collection of probe points.
     */
    public Collection<BenchmarkProbePoint> points();

    /**
     * Notifies the probe to build a point. This method is invoked periodically with given interval.
     *
     * @param time Time of the point.
     */
    public void buildPoint(long time);
}
