
package com.example.volley_post_demo;


public class Product_Data {

    private Integer id;

    private String uid;

    private String proName;

    private String proDes;

    private String proPrice;

    String proImage;

    public Product_Data(Integer id, String uid, String proName, String proDes, String proPrice, String proImage) {
        this.id = id;
        this.uid = uid;
        this.proName = proName;
        this.proDes = proDes;
        this.proPrice = proPrice;
        this.proImage = proImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDes() {
        return proDes;
    }

    public void setProDes(String proDes) {
        this.proDes = proDes;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProImage() {
        return proImage;
    }

    public void setProImage(String proImage) {
        this.proImage = proImage;
    }

    @Override
    public String toString() {
        return "Product_Data{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", proName='" + proName + '\'' +
                ", proDes='" + proDes + '\'' +
                ", proPrice='" + proPrice + '\'' +
                ", proImage='" + proImage + '\'' +
                '}';
    }
}
