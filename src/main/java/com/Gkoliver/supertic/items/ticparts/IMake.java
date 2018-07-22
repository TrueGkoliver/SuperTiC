
package com.Gkoliver.supertic.items.ticparts;

import java.util.LinkedHashSet;
import java.util.Set;

import net.minecraftforge.client.model.IModel;

public interface IMake {
	public static final Set<PartsCommunism> modules = new LinkedHashSet<PartsCommunism>();
	
	
	
	default void init() {}
	default void init2() {}
	default void init3() {}

}
