package com.example.petadopt.model;

public class Pet {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private boolean adopted;

    // Constructor, getters, and setters
    public Pet(Long id, String name, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.adopted = false;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    
    public boolean isAdopted() { return adopted; }
    public void setAdopted(boolean adopted) { this.adopted = adopted; }
}
