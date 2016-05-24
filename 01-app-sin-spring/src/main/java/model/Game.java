package model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Game Pojo
 */
public class Game {

    private String name;
    private String category;
    private int dateRelease;
    private boolean cool;

    public Game() {
    }

    public Game(String name, String category, int dateRelease, boolean cool) {
        this.name = name;
        this.category = category;
        this.dateRelease = dateRelease;
        this.cool = cool;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name",  name)
                .append("category",  category)
                .append("dateRelease",  dateRelease)
                .append("cool",  cool)
                .toString();
    }

    /**
     * Gets category.
     *
     * @return Value of category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new cool.
     *
     * @param cool New value of cool.
     */
    public void setCool(boolean cool) {
        this.cool = cool;
    }

    /**
     * Sets new dateRelease.
     *
     * @param dateRelease New value of dateRelease.
     */
    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    /**
     * Gets dateRelease.
     *
     * @return Value of dateRelease.
     */
    public int getDateRelease() {
        return dateRelease;
    }

    /**
     * Sets new category.
     *
     * @param category New value of category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets cool.
     *
     * @return Value of cool.
     */
    public boolean isCool() {
        return cool;
    }
}
