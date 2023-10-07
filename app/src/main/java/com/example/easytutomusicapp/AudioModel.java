package com.example.easytutomusicapp;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioModel implements Parcelable {
    private String title;
    private String path;
    private String duration;

    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    // Parceling part
    protected AudioModel(Parcel in) {
        title = in.readString();
        path = in.readString();
        duration = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(path);
        dest.writeString(duration);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AudioModel> CREATOR = new Creator<AudioModel>() {
        @Override
        public AudioModel createFromParcel(Parcel in) {
            return new AudioModel(in);
        }

        @Override
        public AudioModel[] newArray(int size) {
            return new AudioModel[size];
        }
    };

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public String getDuration() {
        return duration;
    }
}
