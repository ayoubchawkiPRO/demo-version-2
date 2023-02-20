package com.example.demoversion2.service;

import com.example.demoversion2.dto.VersionDTO;
import com.example.demoversion2.entites.Version;
import com.example.demoversion2.repositories.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VersionService {

    @Autowired
    private VersionRepository versionRepository;

    public List<Version> getAllVersions() {
        return versionRepository.findAll();
    }

   // public Version getVersionById(Long id) {
       // Optional<Version> optionalVersion = versionRepository.findById(id);
     //   if (optionalVersion.isPresent()) {
     //       return optionalVersion.get();
      //  } else {
      //      throw new ChangeSetPersister.NotFoundException("Version not found with id " + id);
     //   }
   // }

    public Version saveVersion(Version version) {
        return versionRepository.save(version);
    }

    public void deleteVersionById(Long id) {
        versionRepository.deleteById(id);
    }

    public VersionDTO getVersions() {
        return null;
    }

    public void updateVersion(String ios, String android, String emergency) {
    }
}

