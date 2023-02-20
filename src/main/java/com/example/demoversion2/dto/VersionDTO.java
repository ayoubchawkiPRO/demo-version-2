package com.example.demoversion2.dto;

import lombok.Data;

@Data
public class VersionDTO {

    private String platform;
    private String version;


    public VersionDTO() {
    }

    public VersionDTO(String iosVersion, String androidVersion) {
        this.version = version;
        this.platform = platform;
    }

    public String getIosVersion() {
        return version;
    }

    public void setIosVersion(String iosVersion) {
        this.version = iosVersion;
    }

    public String getAndroidVersion() {
        return platform;
    }

    public void setAndroidVersion(String androidVersion) {
        this.platform = androidVersion;
    }
}

