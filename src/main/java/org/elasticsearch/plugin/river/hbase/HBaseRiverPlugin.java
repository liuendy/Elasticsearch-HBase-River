package org.elasticsearch.plugin.river.hbase;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.river.RiversModule;
import org.elasticsearch.river.hbase.HBaseRiverModule;

/**
 * Basic plug in information required by ElasticSearch. This class is also referenced under
 * /src/main/resources/es-plugin.properties.
 * 
 * @author Ravi Gairola
 */
public class HBaseRiverPlugin extends AbstractPlugin {

	@Inject
	public HBaseRiverPlugin() {}

	@Override
	public String name() {
		return "river-hbase";
	}

	@Override
	public String description() {
		return "River HBase Plugin";
	}

	/**
	 * Registers the HBaseRiverModule as "hbase" river.
	 * 
	 * @param module
	 */
	public void onModule(final RiversModule module) {
		module.registerRiver("hbase", HBaseRiverModule.class);
	}
}
