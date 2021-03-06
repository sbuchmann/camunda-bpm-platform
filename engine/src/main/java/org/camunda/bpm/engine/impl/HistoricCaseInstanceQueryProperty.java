/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.engine.impl;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.query.QueryProperty;


/**
 * Contains the possible properties which can be used in a {@link HistoricCaseInstanceQueryProperty}.
 * 
 * @author Sebastian Menski
 */
public class HistoricCaseInstanceQueryProperty implements QueryProperty {

  private static final long serialVersionUID = 1L;

  private static final Map<String, HistoricCaseInstanceQueryProperty> properties = new HashMap<String, HistoricCaseInstanceQueryProperty>();

  public static final HistoricCaseInstanceQueryProperty PROCESS_INSTANCE_ID_ = new HistoricCaseInstanceQueryProperty("CASE_INST_ID_");
  public static final HistoricCaseInstanceQueryProperty PROCESS_DEFINITION_ID = new HistoricCaseInstanceQueryProperty("CASE_DEF_ID_");
  public static final HistoricCaseInstanceQueryProperty BUSINESS_KEY = new HistoricCaseInstanceQueryProperty("BUSINESS_KEY_");
  public static final HistoricCaseInstanceQueryProperty CREATE_TIME = new HistoricCaseInstanceQueryProperty("CREATE_TIME_");
  public static final HistoricCaseInstanceQueryProperty CLOSE_TIME = new HistoricCaseInstanceQueryProperty("CLOSE_TIME_");
  public static final HistoricCaseInstanceQueryProperty DURATION = new HistoricCaseInstanceQueryProperty("DURATION_");

  private String name;

  public HistoricCaseInstanceQueryProperty(String name) {
    this.name = name;
    properties.put(name, this);
  }

  public String getName() {
    return name;
  }
  
  public static HistoricCaseInstanceQueryProperty findByName(String propertyName) {
    return properties.get(propertyName);
  }

}
