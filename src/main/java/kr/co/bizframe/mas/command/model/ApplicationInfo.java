/*
 * Copyright 2018 Torpedo corp.
 *  
 * bizframe mas project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package kr.co.bizframe.mas.command.model;

import java.io.Serializable;
import java.util.HashMap;

import kr.co.bizframe.mas.util.TimeUtil;

public class ApplicationInfo implements Serializable {

	private static final long serialVersionUID = -7110066878705684652L;

	private String id;

	private String name;

	private String contextFilePath;

	private String loadClass;

	private String status;

	private HashMap<String, String> properties = new HashMap<String, String>();

	private Boolean serviceable = new Boolean(false);

	private Boolean routable = new Boolean(false);

	private long initTime = -1L;

	private long startTime = -1L;

	private long stopTime = -1L;

	private String routeId;

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContextFilePath() {
		return contextFilePath;
	}

	public void setContextFilePath(String contextFilePath) {
		this.contextFilePath = contextFilePath;
	}

	public String getLoadClass() {
		return loadClass;
	}

	public void setLoadClass(String loadClass) {
		this.loadClass = loadClass;
	}

	public HashMap<String, String> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, String> properties) {
		this.properties = properties;
	}

	public void putProperty(String key, String value) {
		properties.put(key, value);
	}

	public String getProperty(String key) {
		return properties.get(key);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getServiceable() {
		return serviceable;
	}

	public void setServiceable() {
		this.serviceable = true;
	}

	public Boolean getRoutable() {
		return routable;
	}

	public void setRoutable() {
		this.routable = true;
	}

	public long getInitTime() {
		return initTime;
	}

	public void setInitTime(long initTime) {
		this.initTime = initTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getStopTime() {
		return stopTime;
	}

	public void setStopTime(long stopTime) {
		this.stopTime = stopTime;
	}

	@Override
	public String toString() {
		return "ApplicationInfo [id=" + id + ", name=" + name + ", loadClass=" + loadClass + ", contextDir=" + contextFilePath + ",  properties=" + properties 
		+ ", initTime=["+TimeUtil.getTimeStamp(initTime)+"], startTime=["+TimeUtil.getTimeStamp(startTime)+"], stopTime=["+TimeUtil.getTimeStamp(stopTime)+"]";
	}
	
	
	
}
