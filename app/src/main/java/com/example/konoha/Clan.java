package com.example.konoha;

public class Clan {
    private String mClanName;
    private String mJapanName;
    private int mImageResourceId;

    public Clan(String clanName, String japanName, int ImageSource){
        this.mClanName = clanName;
        this.mJapanName = japanName;
        this.mImageResourceId = ImageSource;
    }

    public Clan(String clanName, String japanName) {
        this.mClanName = clanName;
        this.mJapanName = japanName;
        this.mImageResourceId = R.drawable.undefined;
    }

    public String getClanName() { return mClanName; }
    public String getJapanName() { return mJapanName; }
    public int getImageResourceId() { return mImageResourceId; }

}
