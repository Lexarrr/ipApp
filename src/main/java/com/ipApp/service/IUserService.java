package com.ipApp.service;


import com.ipApp.web.dto.UserDto;
import com.ipApp.location.MyUserDetailsService;
import com.ipApp.persistence.model.NewLocationToken;
import com.ipApp.persistence.model.PasswordResetToken;
import com.ipApp.persistence.model.User;
import com.ipApp.persistence.model.VerificationToken;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;


public interface IUserService {

    User registerNewUserAccount(UserDto accountDto);

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    MyUserDetailsService.VerificationToken getVerificationToken(String VerificationToken);

    MyUserDetailsService.VerificationToken generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordResetToken getPasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    String generateQRUrl(User user) throws UnsupportedEncodingException;

    User updateUser2FA(boolean use2FA);

    List<String> getUsersFromSessionRegistry();

    NewLocationToken isNewLoginLocation(String username, String ip);

    String isValidNewLocationToken(String token);

    void addUserLocation(User user, String ip);
}
