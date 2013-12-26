package org.agorava.empireavenue.jackson;

import org.agorava.empireavenue.model.ProfileInfo;

import com.fasterxml.jackson.databind.module.SimpleModule;

@SuppressWarnings("serial")
public class EmpireAvenueModule extends SimpleModule {
	
	public EmpireAvenueModule() {
		super("EmpireAvenueModule");
	}
	
	
	  @Override
	    public void setupModule(SetupContext context) {
		  context.setMixInAnnotations(ProfileInfo.class, ProfileMixin.class);
	  }

}
