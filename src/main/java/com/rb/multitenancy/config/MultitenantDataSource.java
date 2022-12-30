package com.rb.multitenancy.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

public class MultitenantDataSource extends AbstractRoutingDataSource {

    @Override
    @Nullable
    protected Object determineCurrentLookupKey() {
        return TenantContext.getCurrentTenant();
    }

}
