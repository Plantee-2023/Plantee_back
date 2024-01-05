package com.plantee.domain;

public class PlantVO {

	private int plant_id;
	private String common_name;
	private String image;
	private String contents;
	private String watering;
	private String sunlight;
	private String care_level;
	private String leaf;
	private String flowers;
	private String fruits;
	private String type;
	private String indoor;
	private String poisonous_pet;
	private String cuisine;
	private int category;
	
	public int getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(int plant_id) {
		this.plant_id = plant_id;
	}
	public String getCommon_name() {
		return common_name;
	}
	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getSunlight() {
		return sunlight;
	}
	public void setSunlight(String sunlight) {
		this.sunlight = sunlight;
	}
	public String getCare_level() {
		return care_level;
	}
	public void setCare_level(String care_level) {
		this.care_level = care_level;
	}
	public String getLeaf() {
		return leaf;
	}
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}
	public String getFlowers() {
		return flowers;
	}
	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}
	public String getFruits() {
		return fruits;
	}
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIndoor() {
		return indoor;
	}
	public void setIndoor(String indoor) {
		this.indoor = indoor;
	}
	public String getPoisonous_pet() {
		return poisonous_pet;
	}
	public void setPoisonous_pet(String poisonous_pet) {
		this.poisonous_pet = poisonous_pet;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "PlantVO [plant_id=" + plant_id + ", common_name=" + common_name + ", image=" + image + ", contents="
				+ contents + ", watering=" + watering + ", sunlight=" + sunlight + ", care_level=" + care_level
				+ ", leaf=" + leaf + ", flowers=" + flowers + ", fruits=" + fruits + ", type=" + type + ", indoor="
				+ indoor + ", poisonous_pet=" + poisonous_pet + ", cuisine=" + cuisine + ", category=" + category + "]";
	}
}