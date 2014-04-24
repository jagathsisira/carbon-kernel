/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.kernel.internal.tenant.store.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "TenantStore")
@XmlAccessorType(XmlAccessType.FIELD)
public class TenantStoreConfig {

    @XmlElement(name = "Tenant")
    private Map<String, TenantConfig> tenantConfigs = new HashMap<>();

    public Collection<TenantConfig> getTenantConfigs() {
        return tenantConfigs.values();
    }

    public void addTenantConfig(TenantConfig tenantConfig) {
        this.tenantConfigs.put(tenantConfig.getId(), tenantConfig);
    }
}