package com.hroscope.cegep.cegephoroscope.Friends_List;

/**
 * Created by krishna on 2017-07-12.
 */

public class FriendListModel {
    private String profileImage;
    private String name;
    private String date;

    public FriendListModel(String profileImage, String name,String date) {
        this.profileImage = profileImage;
        this.name=name;
        this.date =date;

    }

        public String getProfileImage() {
        return  profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    public String getListName() {
        return  name;
    }

    public void setListName(String name) {
        this.name = name;
    }

    public String getListdate() {
        return  date;
    }

    public void setListdate(String date) {
        this.date = date;
    }
}
