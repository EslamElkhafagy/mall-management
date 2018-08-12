package FrontApp.Classes;

import java.io.FileInputStream;
public class electronic_items {
    
    
    private String name;
    private String code;
    private int amount;
    private double price;
    private String details;
    private byte[] image;
    private FileInputStream fin;
    private int len_image;
    private String category;
    private String shop_id;
    
public electronic_items( String name,String code,int amount, double price,String details, byte[] image, String category, String shop_id){
    
    this.name=name;
    this.code=code;
    this.amount=amount;
    this.price=price;
    this.details=details;
    this.image=image;
    this.category=category;
    this.shop_id = shop_id;
}

    electronic_items(){
        //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image=image;
    }

    /**
     * @return the fin
     */
    public FileInputStream getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(FileInputStream fin) {
        this.fin = fin;
    }

    /**
     * @return the len_image
     */
    public int getLen_image() {
        return len_image;
    }

    /**
     * @param len_image the len_image to set
     */
    public void setLen_image(int len_image) {
        this.len_image = len_image;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the shop_id
     */
    public String getShop_id() {
        return shop_id;
    }

    /**
     * @param shop_id the shop_id to set
     */
    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    
}
