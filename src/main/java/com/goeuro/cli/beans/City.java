
package com.goeuro.cli.beans;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @author ahmedeid
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_id",
    "key",
    "name",
    "fullName",
    "iata_airport_code",
    "type",
    "country",
    "geo_position",
    "locationId",
    "inEurope",
    "countryId",
    "countryCode",
    "coreCountry",
    "distance",
    "names",
    "alternativeNames"
})
public class City {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("key")
    private Object key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("iata_airport_code")
    private Object iataAirportCode;
    @JsonProperty("type")
    private String type;
    @JsonProperty("country")
    private String country;
    @JsonProperty("geo_position")
    private GeoPosition geoPosition;
    @JsonProperty("locationId")
    private Integer locationId;
    @JsonProperty("inEurope")
    private Boolean inEurope;
    @JsonProperty("countryId")
    private Integer countryId;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("coreCountry")
    private Boolean coreCountry;
    @JsonProperty("distance")
    private Object distance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public Object getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(Object key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The fullName
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The iataAirportCode
     */
    @JsonProperty("iata_airport_code")
    public Object getIataAirportCode() {
        return iataAirportCode;
    }

    /**
     * 
     * @param iataAirportCode
     *     The iata_airport_code
     */
    @JsonProperty("iata_airport_code")
    public void setIataAirportCode(Object iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The geoPosition
     */
    @JsonProperty("geo_position")
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    /**
     * 
     * @param geoPosition
     *     The geo_position
     */
    @JsonProperty("geo_position")
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    /**
     * 
     * @return
     *     The locationId
     */
    @JsonProperty("locationId")
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * 
     * @param locationId
     *     The locationId
     */
    @JsonProperty("locationId")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * 
     * @return
     *     The inEurope
     */
    @JsonProperty("inEurope")
    public Boolean getInEurope() {
        return inEurope;
    }

    /**
     * 
     * @param inEurope
     *     The inEurope
     */
    @JsonProperty("inEurope")
    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    /**
     * 
     * @return
     *     The countryId
     */
    @JsonProperty("countryId")
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId
     *     The countryId
     */
    @JsonProperty("countryId")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The coreCountry
     */
    @JsonProperty("coreCountry")
    public Boolean getCoreCountry() {
        return coreCountry;
    }

    /**
     * 
     * @param coreCountry
     *     The coreCountry
     */
    @JsonProperty("coreCountry")
    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public Object getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(key).append(name).append(fullName).append(iataAirportCode).append(type).append(country).append(geoPosition).append(locationId).append(inEurope).append(countryId).append(countryCode).append(coreCountry).append(distance).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof City) == false) {
            return false;
        }
        City rhs = ((City) other);
        return new EqualsBuilder().append(id, rhs.id).append(key, rhs.key).append(name, rhs.name).append(fullName, rhs.fullName).append(iataAirportCode, rhs.iataAirportCode).append(type, rhs.type).append(country, rhs.country).append(geoPosition, rhs.geoPosition).append(locationId, rhs.locationId).append(inEurope, rhs.inEurope).append(countryId, rhs.countryId).append(countryCode, rhs.countryCode).append(coreCountry, rhs.coreCountry).append(distance, rhs.distance).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
