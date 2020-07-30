package eu.arrowhead.common.dto.internal;

import java.io.Serializable;

public class ServiceInterfaceRequestDTO implements Serializable {

	//=================================================================================================
	// members

	private static final long serialVersionUID = -5448099699710703982L;

	private String serviceInterface;

	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public ServiceInterfaceRequestDTO() {}

	//-------------------------------------------------------------------------------------------------
	public ServiceInterfaceRequestDTO(final String serviceInterface) {
		this.serviceInterface = serviceInterface;
	}

	//-------------------------------------------------------------------------------------------------
	public String getServiceInterface() { return serviceInterface; }

	//-------------------------------------------------------------------------------------------------
	public void setServiceInterface(final String serviceInterface) { this.serviceInterface = serviceInterface; }

}
