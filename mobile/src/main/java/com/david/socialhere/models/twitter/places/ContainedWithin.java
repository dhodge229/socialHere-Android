
package com.david.socialhere.models.twitter.places;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContainedWithin {

    @Expose
    private Attributes_ attributes;
    @SerializedName("bounding_box")
    @Expose
    private BoundingBox_ boundingBox;
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @Expose
    private String id;
    @Expose
    private String name;
    @SerializedName("place_type")
    @Expose
    private String placeType;
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The attributes
     */
    public Attributes_ getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Attributes_ attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The boundingBox
     */
    public BoundingBox_ getBoundingBox() {
        return boundingBox;
    }

    /**
     * 
     * @param boundingBox
     *     The bounding_box
     */
    public void setBoundingBox(BoundingBox_ boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The placeType
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * 
     * @param placeType
     *     The place_type
     */
    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
