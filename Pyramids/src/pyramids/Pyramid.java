/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author moham
 */
public class Pyramid {
    private String modern_name, site, material;
    private float height, lat, lng;
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "This pyramid recently has been called (" + this.getModern_name() + ") and its height is about " + this.getHeight() + " m";
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        if(height < 0 || Float.isNaN(height))
            height = 0;
        this.height = height;
    }
    
    public void setHeight(String height) {
        if(height.isBlank())
            height = "0";
        try{
            this.height = Float.parseFloat(height);
        } catch(NumberFormatException ex){
            System.out.println(height);
        }
        
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        if(Float.isNaN(lat))
            lat = 0;
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        if(Float.isNaN(lng))
            lng = 0;
        this.lng = lng;
    }
}
