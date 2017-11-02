/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.plan;

import java.io.Serializable;

import org.apache.hadoop.hive.ql.plan.Explain.Level;

@Explain(displayName = "Create ResourcePlan", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
public class CreateResourcePlanDesc extends DDLDesc implements Serializable {

  private static final long serialVersionUID = -3649343104271794404L;

  private String planName;
  private Integer queryParallelism;

  // For serialization only.
  public CreateResourcePlanDesc() {
  }

  public CreateResourcePlanDesc(String planName, Integer queryParallelism) {
    this.planName = planName;
    this.queryParallelism = queryParallelism;
  }

  @Explain(displayName="name", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public String getName() {
    return planName;
  }

  @Explain(displayName="queryParallelism")
  public Integer getQueryParallelism() {
    return queryParallelism;
  }
}