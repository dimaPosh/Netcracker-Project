package com.netcracker.shop.server.model;

/**
 * The type Product model.
 */
public class ProductModel {
    private Integer id;
    private String name;
    private Float price;
    private String description;
    private String image;
    private Integer count;
    private CategoryModel category;

    /**
     * Instantiates a new Product model.
     */
    public ProductModel() {
    }

    /**
     * Instantiates a new Product model.
     *
     * @param id          the id
     * @param name        the name
     * @param price       the price
     * @param description the description
     * @param image       the image
     * @param count       the count
     * @param category    the category
     */
    public ProductModel(Integer id, String name,
                        Float price, String description,
                        String image, Integer count,
                        CategoryModel category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.count = count;
        this.category = category;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get image byte [ ].
     *
     * @return the byte [ ]
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public CategoryModel getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(CategoryModel category) {
        this.category = category;
    }
}
