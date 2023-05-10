package lomayd.DBMSLabCaching.api.domain.user.controller;

import org.springframework.cache.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lomayd.DBMSLabCaching.api.domain.user.dto.UserRequestDto;
import lomayd.DBMSLabCaching.api.domain.user.dto.UserResponseDto;
import lomayd.DBMSLabCaching.api.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> joinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.joinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @Cacheable(value = "User", key = "#id", cacheManager = "cacheManager")
    public UserResponseDto.UserInfo getUser(@RequestParam String id) {
        return userService.getUser(id);
    }

    @PatchMapping
    public ResponseEntity<Void> modifyUser(@RequestParam String id, @RequestBody UserRequestDto.UserModify userModify) {
        userService.modifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @CacheEvict(value = "User", key = "#id", cacheManager = "cacheManager")
    public ResponseEntity<Void> removeUser(@RequestParam String id) {
        userService.removeUser(id);
        return ResponseEntity.ok().build();
    }
}
