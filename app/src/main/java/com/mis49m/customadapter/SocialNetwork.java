package com.mis49m.customadapter;

/**
 * Created by km10232 on 2/27/15.
 */
public class SocialNetwork {

    private String name;
    private int image;
    private boolean isChecked;


    public SocialNetwork(String name, int image, boolean isChecked){
        this.name = name;
        this.isChecked = isChecked;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isChecked() {
        return isChecked;
    }
    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }


}
