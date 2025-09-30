package in.vishalproj.moneymanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.vishalproj.moneymanager.dto.AuthDTO;
import in.vishalproj.moneymanager.dto.ProfileDTO;
import in.vishalproj.moneymanager.service.ProfileService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

@PostMapping("/register")
    public ResponseEntity<ProfileDTO> registerProfile(@RequestBody ProfileDTO profileDTO){
        ProfileDTO registeredProfile = profileService.registerProfile(profileDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredProfile);
    }
@GetMapping("/activate")
    public ResponseEntity<String>ActivateProfile(@RequestParam String token){
    boolean isActivated = profileService.activateProfile(token);
    if(isActivated){
        return ResponseEntity.ok("profile activated successfully");
    }else{
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Activation token not found or already used");
    }
    }
@PostMapping("/login")
    public ResponseEntity<Map<String,Object>> login (@RequestBody AuthDTO authDTO) {
    try {
        if (!profileService.isAccountActive(authDTO.getEmail())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Map.of(
                    "message", "Account is not active.Please activate your account first"
            ));
        }
        Map<String, Object> response = profileService.authenticateAndGenerateToken(authDTO);
        return ResponseEntity.ok(response);

    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of(
                "message", e.getMessage()
        ));
    }
}
    @GetMapping("/profile")
    public ResponseEntity<ProfileDTO> getPublicProfile() {
        ProfileDTO profileDTO = profileService.getPublicProfile(null);
        return ResponseEntity.ok(profileDTO);
    }
}

