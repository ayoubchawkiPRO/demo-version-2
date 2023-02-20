package com.example.demoversion2.controller;

import com.example.demoversion2.dto.VersionDTO;
import com.example.demoversion2.entites.Version;
import com.example.demoversion2.repositories.VersionRepository;
import com.example.demoversion2.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/versions")@Email
public class VersionController {
    @Autowired
    private VersionRepository versionRepository;
    @Autowired
    private VersionService versionService;


    @GetMapping("/getv")
    public List<VersionDTO> getVersions() {
        List<VersionDTO> versions = versionService.getVersions();
        return versions;
    }

    @PutMapping("/put")
    public ResponseEntity<String> updateVersion(@RequestParam(name = "ios") String ios,
                                                @RequestParam(name = "android") String android,
                                                @RequestParam(name = "emergency") String emergency) {
        versionService.updateVersion(ios, android, emergency);
        return ResponseEntity.ok().body("Version updated successfully!");
    }
}
