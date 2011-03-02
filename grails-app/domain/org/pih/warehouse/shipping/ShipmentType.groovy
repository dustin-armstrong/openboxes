package org.pih.warehouse.shipping

import java.util.Date;

/**
 * Represents the type of shipment (Sea, Air, Suitcase, Domestic Freight, Other)
 */
class ShipmentType implements java.io.Serializable {

	String name
	String description
	Integer sortOrder = 0;
	Date dateCreated;
	Date lastUpdated;
	
	static constraints = {
		name(nullable:false)
		description(nullable:true)
		sortOrder(nullable:true)
		dateCreated(display:false)
		lastUpdated(display:false)
	}

	static mapping = {
		sort "sortOrder"
	}

	
	String toString() { name }	
		
}
