package com.example.demoversion2.dto;

import lombok.Data;

@Data
public class VersionDTO {

    private String iosVersion;
    private String androidVersion;

    public VersionDTO() {
    }

    public VersionDTO(String iosVersion, String androidVersion) {
        this.iosVersion = iosVersion;
        this.androidVersion = androidVersion;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }
}

