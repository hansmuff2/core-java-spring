package eu.arrowhead.common.dto.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.arrowhead.common.dto.shared.ErrorWrapperDTO;

public class GSDPollResponseDTO implements Serializable, ErrorWrapperDTO {

	//=================================================================================================
	// members
		
	private static final long serialVersionUID = -6771214774324850151L;
	
	private CloudResponseDTO providerCloud;
	private String requiredServiceDefinition;
	private List<String> availableInterfaces;
	private Integer numOfProviders; 
	private List<QoSMeasurementAttributesFormDTO> qosMeasurements;
	private Map<String,String> serviceMetadata;
	private boolean gatewayIsMandatory;
	
	//=================================================================================================
	// methods
		
	//-------------------------------------------------------------------------------------------------	
	public GSDPollResponseDTO() {}
	
	//-------------------------------------------------------------------------------------------------
	public GSDPollResponseDTO(final CloudResponseDTO providerCloud, final String requiredServiceDefinition, final List<String> availableInterfaces,
							  final Integer numOfProviders, final List<QoSMeasurementAttributesFormDTO> qosMeasurements,
							  final Map<String,String> serviceMetadata, final boolean gatewayIsMandatory) {
		this.providerCloud = providerCloud;
		this.requiredServiceDefinition = requiredServiceDefinition;
		this.availableInterfaces = availableInterfaces;
		this.numOfProviders = numOfProviders;
		this.qosMeasurements = qosMeasurements;
		this.serviceMetadata = serviceMetadata;
		this.gatewayIsMandatory = gatewayIsMandatory;
	}

	//-------------------------------------------------------------------------------------------------	
	public CloudResponseDTO getProviderCloud() { return providerCloud; }
	public String getRequiredServiceDefinition() { return requiredServiceDefinition; }
	public List<String> getAvailableInterfaces() { return availableInterfaces; }	
	public Integer getNumOfProviders() { return numOfProviders; }
	public List<QoSMeasurementAttributesFormDTO> getQosMeasurements() { return qosMeasurements; }
	public Map<String,String> getServiceMetadata() { return serviceMetadata; }
	public boolean isGatewayIsMandatory() { return gatewayIsMandatory; }

	//-------------------------------------------------------------------------------------------------	
	public void setProviderCloud(final CloudResponseDTO providerCloud) { this.providerCloud = providerCloud; }
	public void setRequiredServiceDefinition(final String requiredServiceDefinition) { this.requiredServiceDefinition = requiredServiceDefinition; }
	public void setAvailableInterfaces(final List<String> availableInterfaces) { this.availableInterfaces = availableInterfaces; } 	
	public void setNumOfProviders(final Integer numOfProviders) { this.numOfProviders = numOfProviders; }	
	public void setQosMeasurements(final List<QoSMeasurementAttributesFormDTO> qosMeasurements) { this.qosMeasurements = qosMeasurements; }
	public void setServiceMetadata(final Map<String,String> serviceMetadata) { this.serviceMetadata = serviceMetadata; }
	public void setGatewayIsMandatory(final boolean gatewayIsMandatory) { this.gatewayIsMandatory = gatewayIsMandatory; }

	//-------------------------------------------------------------------------------------------------
	@JsonIgnore
	@Override
	public boolean isError() {
		return false;
	}
}