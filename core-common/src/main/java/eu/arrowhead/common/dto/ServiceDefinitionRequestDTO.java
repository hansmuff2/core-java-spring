package eu.arrowhead.common.dto;

import java.io.Serializable;

public class ServiceDefinitionRequestDTO implements Serializable {

	private static final long serialVersionUID = -1966787184376371095L;
	
	//=================================================================================================
	// members
	
	private String serviceDefinition;
			
	//=================================================================================================
	// methods
		
	//-------------------------------------------------------------------------------------------------
	public ServiceDefinitionRequestDTO() {}
	
	//-------------------------------------------------------------------------------------------------
	public ServiceDefinitionRequestDTO(final String serviceDefinition) {
		this.serviceDefinition = serviceDefinition;
	}

	//-------------------------------------------------------------------------------------------------
	public String getServiceDefinition() { return serviceDefinition; }
	
	//-------------------------------------------------------------------------------------------------
	public void setServiceDefinition(final String serviceDefinition) { this.serviceDefinition = serviceDefinition; }
}