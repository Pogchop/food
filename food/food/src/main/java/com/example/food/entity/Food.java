package com.example.food.entity;

import com.example.food.annotation.Column;
import com.example.food.annotation.Entity;
import com.example.food.annotation.Id;
import com.example.food.util.SQLDataTypes;

@Entity(tableName = "products")
public class Food {

    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;
    @Column(columnName = "name", columnType = SQLDataTypes.VARCHAR255)
    private String name;
    @Column(columnName = "idname", columnType = SQLDataTypes.VARCHAR255)
    private String idname;
    @Column(columnName = "description", columnType = SQLDataTypes.VARCHAR255)
    private String description;
    @Column(columnName = "thumbnail", columnType = SQLDataTypes.VARCHAR255)
    private String thumbnail;
    @Column(columnName = "price", columnType = SQLDataTypes.INTEGER)
    private int price;
    @Column(columnName = "selldate", columnType = SQLDataTypes.VARCHAR255)
    private String selldate;
    @Column(columnName = "editdate", columnType = SQLDataTypes.VARCHAR255)
    private String editdate;
    @Column(columnName = "status", columnType = SQLDataTypes.VARCHAR255)
    private String status;

    public Food(String name, String idname, String description, String thumbnail, int price, String selldate, String editdate, String status) {
        this.name = name;
        this.idname = idname;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.selldate = selldate;
        this.editdate = editdate;
        this.status = status;
    }

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSelldate() {
        return selldate;
    }

    public void setSelldate(String selldate) {
        this.selldate = selldate;
    }

    public String getEditdate() {
        return editdate;
    }

    public void setEditdate(String editdate) {
        this.editdate = editdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
